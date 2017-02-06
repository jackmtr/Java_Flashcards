/**
 * Project : com.contography.flashcards 
 * File : UIDesign.java
 * Date : Feb 5, 2017
 * Time : 5:31:25 PM
 */
package com.contography.flashcards.ui;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import com.contography.flashcards.dao.Driver;

/**
 * @author Jackie
 *
 */
public class UIDesign {
	
	
	public static void checkForDatabase() throws SQLException{
		
		Driver driver = new Driver();
		
		boolean doesStudyExist = driver.tableExists("studysets");
		boolean doesFlashExist = driver.tableExists("flashcards");
		
		
		if(!doesStudyExist && !doesFlashExist){
			
			String createStudysetTableQuery = "CREATE TABLE studysets(studyset_id int NOT NULL AUTO_INCREMENT, name varchar(255) NOT NULL UNIQUE, PRIMARY KEY (studyset_id));";
			driver.createTable(createStudysetTableQuery);
			
			String createFlashcardTableQuery = "CREATE TABLE flashcards(flashcard_id int NOT NULL AUTO_INCREMENT, name varchar(255) NOT NULL, description TEXT NOT NULL, studyset_id int DEFAULT 1, PRIMARY KEY (flashcard_id), FOREIGN KEY (studyset_id) REFERENCES studysets(studyset_id));";
			driver.createTable(createFlashcardTableQuery);
			
			String insertDefaultStudysetDate1 = "INSERT INTO studysets (name) VALUES('Java');";
			driver.insertData(insertDefaultStudysetDate1);
			String insertDefaultStudysetDate2 = "INSERT INTO studysets (name) VALUES('SQL');";
			driver.insertData(insertDefaultStudysetDate2);
			String insertDefaultStudysetDate3 = "INSERT INTO studysets (name) VALUES('HTML');";
			driver.insertData(insertDefaultStudysetDate3);
			
			String insertDefaultFlashcard1 = "INSERT INTO flashcards (name, description, studyset_id) VALUES('Interface', 'Java interface can only contain method signatures and fields', 1);";
			driver.insertData(insertDefaultFlashcard1);
			String insertDefaultFlashcard2 = "INSERT INTO flashcards (name, description, studyset_id) VALUES('Polymorphism', 'The ability of an object to take on many forms', 1);";
			driver.insertData(insertDefaultFlashcard2);
			String insertDefaultFlashcard3 = "INSERT INTO flashcards (name, description, studyset_id) VALUES('AUTO_INCREMENT', 'Increase a sql column by 1, starting at 1 automaticlly', 2);";
			driver.insertData(insertDefaultFlashcard3);
		}
	}
	
	public static void start() throws SQLException{
		
		Driver driver = new Driver();
		Scanner scanner = new Scanner(System.in);
		boolean correctResponse = true;
		
		do{
			UIDisplay.welcome();
		
			String input1 = scanner.nextLine();

			if (input1.equals("1")){
				correctResponse = false;
				
				Set<String> catagories = new HashSet<String>();
				
				UIDisplay.readMessage();
				
				ResultSet result = driver.getData("SELECT name FROM studysets");
				
				while (result.next()){
					System.out.println(result.getString(1));
					catagories.add(result.getString(1));
				}
				
				System.out.println("You choose : ");
				String input2 = scanner.next();
				
				if (catagories.contains(input2)){
					
					String flashCardQuery = "SELECT flashcards.name, flashcards.description FROM flashcards join studysets WHERE flashcards.studyset_id = studysets.studyset_id && studysets.name = '" + input2 +"';";
					
					result = driver.getData(flashCardQuery);
					
					while(result.next()){
						System.out.println(result.getString(1) + ": " + result.getString(2));
					}					
				}else{
					System.out.println("The catagory given is not in the database.");
				}
				
			}else if (input1.equals("2")){
				correctResponse = false;
				
				String[] answers = newFlashcardQuestions(scanner);

				String findStudysetIdQuery = "SELECT studyset_id FROM studysets WHERE name = '" + answers[2] + "';";
				ResultSet findStudysetId = driver.getData(findStudysetIdQuery);
				System.out.println("*************");
				
				int studySetValue = 0;
				
				while(findStudysetId.next()){
					studySetValue = findStudysetId.getInt(1);
				}	
				System.out.println("*************");

				String newFlashCardQuery = "INSERT INTO flashcards (name, description, studyset_id) VALUES ('" 
						+ answers[0] + "', '" + answers[1] + "', '" + studySetValue + "');";

				driver.insertData(newFlashCardQuery);
				System.out.println("Flashcard added successfully.");
			}else{
				System.out.println("Sorry, your input was incorrect.  Please try again");
			}
		}while(correctResponse);
	}
	
	public static String[] newFlashcardQuestions(Scanner scanner){
		String[] answers = new String[3];
		
		System.out.println("What is the word/idea?");
		answers[0] = scanner.nextLine();
		
		System.out.println("What is the definition/description?");
		answers[1] = scanner.nextLine();
		
		System.out.println("Which StudySet should this be set to?");
		answers[2] = scanner.nextLine();
		
		return answers;
	}
}

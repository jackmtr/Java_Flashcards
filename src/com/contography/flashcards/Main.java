package com.contography.flashcards;
/**
 * Project : FlashCards 
 * File : FlashCards.java
 * Date : Feb 5, 2017
 * Time : 9:36:06 AM
 */

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.contography.flashcards.dao.Driver;

//import java.util.ArrayList;

//import com.contography.flashcards.data.*;
import com.contography.flashcards.ui.*;

/**
 * @author Jackie
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws SQLException{
		
		//Driver driver = new Driver();
		//Scanner scanner = new Scanner(System.in);
		//boolean correctResponse = true;
		
		/*do{
			UIDisplay.welcome();
			
			String input1 = scanner.nextLine();
	
			if (input1.equals("1")){
				correctResponse = false;
				
				UIDisplay.readMessage();
				
				ResultSet result = driver.getData("SELECT name FROM studysets");
				while (result.next()){
					System.out.println(result.getString(1));
				}
				System.out.println("You choose : ");
				String input2 = scanner.next();
				
				//validate choice
				String flashCardQuery = "SELECT * FROM flashcards WHERE catagory = '" + input2 + "';";

				result = driver.getData(flashCardQuery);
				while(result.next()){
					System.out.println(result.getString(2) + ": " + result.getString(3));
				}
			
				
			}else if (input1.equals("2")){
				
				System.out.println("What is the word/idea?");
				String key = scanner.nextLine();
				
				System.out.println("What is the definition/description?");
				String descriptionValue = scanner.nextLine();
				
				System.out.println("Which StudySet should this be set to?");
				String chosenSet = scanner.nextLine();
				
				String newFlashCardQuery = "INSERT INTO flashcards (name, description, catagory) VALUES ('" 
						+ key + "', '" + descriptionValue + "', '" + chosenSet + "');";
				
				System.out.println(newFlashCardQuery);
				
				driver.insertData(newFlashCardQuery);
				
				correctResponse = false;
			}else{
				System.out.println("Sorry, your input was incorrect.  Please try again");
			}
		}while(correctResponse);*/
		
		UIDesign.checkForDatabase();
		
		UIDesign.start();
		
		
		
		
		
		
		
		
		
		
		
		
		/*Flashcard fc1 = new Flashcard("Interface", "Built like a class, but only contains methods signatures and fields.");
		Flashcard fc2 = new Flashcard("Polymorphism", "Abiity of an object to take on many forms.");
		StudySet ss1 = new StudySet("Concepts");
		ss1.addFlashcard(fc1);
		ss1.addFlashcard(fc2);
		ss1.printFlashCards();
		
		try {
			driver.insertData("INSERT INTO studysets (idStudySet, name, description) VALUES (1, 'Java', 'Java Notes for ZE Group')");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		//UIDisplay.display(fc1.printCard());
	}
}

package com.contography.flashcards;
/**
 * Project : FlashCards 
 * File : FlashCards.java
 * Date : Feb 5, 2017
 * Time : 9:36:06 AM
 */

import java.sql.SQLException;

import com.contography.flashcards.dao.Driver;

//import java.util.ArrayList;

import com.contography.flashcards.data.*;
//import com.contography.flashcards.ui.UIDisplay;

/**
 * @author Jackie
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Driver driver = new Driver();
		
		// TODO Auto-generated method stub
		Flashcard fc1 = new Flashcard("Interface", "Built like a class, but only contains methods signatures and fields.");
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
		}
		
		//UIDisplay.display(fc1.printCard());
	}
}

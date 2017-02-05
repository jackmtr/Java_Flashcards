package com.contography.flashcards;
/**
 * Project : FlashCards 
 * File : FlashCards.java
 * Date : Feb 5, 2017
 * Time : 9:36:06 AM
 */

import com.contography.flashcards.data.*;

/**
 * @author Jackie
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Flashcard fc1 = new Flashcard("Interface", "Built like a class, but only contains methods signatures and fields.");
		
		System.out.println(fc1.printCard());
	}
}

/**
 * Project : com.contography.flashcards 
 * File : UIDisplay.java
 * Date : Feb 5, 2017
 * Time : 1:30:43 PM
 */
package com.contography.flashcards.ui;

/**
 * @author Jackie
 *
 */
public class UIDisplay {

	public static void welcome(){
		System.out.println("Welcome to your flash cards");
		System.out.println("What would you like to do?");
		System.out.println("1: Read flash cards, 2: Make flash cards");
		System.out.println("Your input: ");
	}
	
	public static void readMessage(){
		System.out.println("Choose a study set to read from: ");
	}
}

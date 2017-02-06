package com.contography.flashcards;

import java.sql.SQLException;
import com.contography.flashcards.ui.*;

/**
 * Project : FlashCards 
 * File : FlashCards.java
 * Date : Feb 5, 2017
 * Time : 9:36:06 AM
 */

/**
 * @author Jackie
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws SQLException{
		
		UIDesign.checkForDatabase();

		UIDesign.start();
	}
}

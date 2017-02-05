/**
 * Project : com.contography.flashcards 
 * File : StudySet.java
 * Date : Feb 5, 2017
 * Time : 10:44:55 AM
 */
package com.contography.flashcards.data;

import java.util.ArrayList;

/**
 * @author Jackie
 *
 */
public class StudySet {
	
	private String name;
	private String description;
	private ArrayList<Flashcard> flashcard;
	
	public StudySet(){
		super();
	}
	
	public StudySet(String name){
		setName(name);
	}
	
	public StudySet(String name, String description){
		setName(name);
		setDescription(description);
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		if (name.length()>=1){
			this.name = name;
		}
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		if(description.length()>=1){
			this.description = description;
		}
	}

	/**
	 * @return the flashcard
	 */
	public ArrayList<Flashcard> getFlashcard() {
		return flashcard;
	}

	/**
	 * @param flashcard the flashcard to set
	 */
	public void setFlashcard(ArrayList<Flashcard> flashcard) {
		this.flashcard = flashcard;
	}
	
}

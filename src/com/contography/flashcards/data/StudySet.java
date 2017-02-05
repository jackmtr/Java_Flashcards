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
		flashcard = new ArrayList<Flashcard>();
	}
	
	public StudySet(String name, String description){
		setName(name);
		setDescription(description);
		flashcard = new ArrayList<Flashcard>();
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
	
	/**
	 * 
	 */
	public void addFlashcard(Flashcard fc){
		this.flashcard.add(fc);
	}
	
	/**
	 * 
	 */
	public void printFlashCards(){
		int count = flashcard.size();
		flashcard.stream();
		
		for (int i=0; i < count; i++){
			System.out.println(flashcard.get(i).printCard());
		}
	}
}

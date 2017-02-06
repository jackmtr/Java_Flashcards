/**
 * Project : com.contography.flashcards 
 * File : Flashcard.java
 * Date : Feb 5, 2017
 * Time : 10:44:37 AM
 */
package com.contography.flashcards.data;

import java.sql.Date;

/**
 * @author Jackie
 *
 */
public class Flashcard {
	
	private String name;
	private String description;
	private Date dateCreated;
	private String catagory;
	private String miscNote;
	private int importance;
	private String example;
	
	public Flashcard(){
		super();
	}
	
	public Flashcard(String name, String description){
		setName(name);
		setDescription(description);
	}
	
	public Flashcard(String name, String description, String catagory){
		setName(name);
		setDescription(description);
		setCatagory(catagory);
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
		if(name.length()>=1){
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
	 * @return the dateCreated
	 */
	public Date getDateCreated() {
		return dateCreated;
	}

	/**
	 * @param dateCreated the dateCreated to set
	 */
	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}

	/**
	 * @return the catagory
	 */
	public String getCatagory() {
		return catagory;
	}

	/**
	 * @param catagory the catagory to set
	 */
	public void setCatagory(String catagory) {
		if(catagory.length()>=1){
			this.catagory = catagory;
		}
	}

	/**
	 * @return the miscNote
	 */
	public String getMiscNote() {
		return miscNote;
	}

	/**
	 * @param miscNote the miscNote to set
	 */
	public void setMiscNote(String miscNote) {
		if(miscNote.length()>=0){
			this.miscNote = miscNote;
		}
	}

	/**
	 * @return the importance
	 */
	public int getImportance() {
		return importance;
	}

	/**
	 * @param importance the importance to set
	 */
	public void setImportance(int importance) {
		if(importance > 0){
			this.importance = importance;
		}
	}

	/**
	 * @return the example
	 */
	public String getExample() {
		return example;
	}

	/**
	 * @param example the example to set
	 */
	public void setExample(String example) {
		if(example.length()>=1){
			this.example = example;
		}
	}
	
	/**
	 * 
	 */
	public String printCard(){
		return name + ": " + description;
	}
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sohail.alam.quizing_app.pojo;

import java.util.ArrayList;
import java.util.UUID;
import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

/**
 *
 * @author sohail.alam
 */
@Root(name = "Question")
public class QuestionStructure {

	@ElementList(required = true, empty = false, inline = true, type = OptionStructure.class)
	private ArrayList<OptionStructure> optionList;
	@Attribute(name = "number", required = true)
	private int number;
	@Attribute(name = "difficulty", required = true)
	private int difficulty;
	@Attribute(name = "text", required = true)
	private String text;
	@Attribute(name = "image", required = false)
	private String image;
	@Attribute(name = "uuid", required = true)
	private String uuid;

	/**
	 *
	 */
	public QuestionStructure() {
		optionList = new ArrayList<OptionStructure>();
	}

	/**
	 * 
	 * @param number
	 * @param difficulty
	 * @param text 
	 */
	public QuestionStructure(int number, int difficulty, String text) {

		this.uuid = String.valueOf(UUID.randomUUID());
		this.number = number;
		this.difficulty = difficulty;
		this.text = text;
	}
	
	/**
	 * 
	 * @param optionList
	 * @param number
	 * @param difficulty
	 * @param text 
	 */
	public QuestionStructure(ArrayList<OptionStructure> optionList,
		int number, int difficulty, String text) {

		this.uuid = String.valueOf(UUID.randomUUID());
		this.optionList = optionList;
		this.number = number;
		this.difficulty = difficulty;
		this.text = text;
	}

	/**
	 *
	 * @param optionList
	 * @param number
	 * @param uuid
	 * @param difficulty
	 * @param text
	 * @param image
	 */
	public QuestionStructure(ArrayList<OptionStructure> optionList,
		int number, int difficulty, String text, String image) {

		this.uuid = String.valueOf(UUID.randomUUID());
		this.optionList = optionList;
		this.number = number;
		this.difficulty = difficulty;
		this.text = text;
		this.image = image;
	}

	/**
	 * @return the optionList
	 */
	public ArrayList<OptionStructure> getOptionList() {
		return optionList;
	}

	/**
	 *
	 * @param optionList
	 */
	public void setOptionList(ArrayList<OptionStructure> optionList) {
		this.optionList = optionList;
	}

	/*
	 * 
	 */
	public void addAllToOptionList(ArrayList<OptionStructure> optionList) {
		this.optionList.addAll(optionList);
	}

	/**
	 *
	 * @param option
	 */
	public void addToOptionList(OptionStructure option) {
		this.optionList.add(option);
	}

	/**
	 * 
	 * @param number
	 * @param text  
	 */
	public void addToOptionList(int number, String text) {
		this.optionList.add(new OptionStructure(number, text));
	}

	/**
	 *
	 * @param number
	 * @param uuid
	 * @param text
	 * @param image
	 */
	public void addToOptionList(int number, String text, String image) {
		this.optionList.add(new OptionStructure(number, text, image));
	}

	/**
	 *
	 */
	public void clearOptionList() {
		this.optionList.clear();
	}

	/**
	 * @return the number
	 */
	public int getNumber() {
		return number;
	}

	/**
	 * @param number the number to set
	 */
	public void setNumber(int number) {
		this.number = number;
	}

	/**
	 * @return the uuid
	 */
	public String getUuid() {
		return uuid;
	}

	/**
	 * @param uuid the uuid to set
	 */
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	/**
	 * @return the difficulty
	 */
	public int getDifficulty() {
		return difficulty;
	}

	/**
	 * @param difficulty the difficulty to set
	 */
	public void setDifficulty(int difficulty) {
		this.difficulty = difficulty;
	}

	/**
	 * @return the text
	 */
	public String getText() {
		return text;
	}

	/**
	 * @param text the text to set
	 */
	public void setText(String text) {
		this.text = text;
	}

	/**
	 * @return the image
	 */
	public String getImage() {
		return image;
	}

	/**
	 * @param image the image to set
	 */
	public void setImage(String image) {
		this.image = image;
	}
}

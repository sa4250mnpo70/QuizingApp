/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sohail.alam.quizing_app.pojo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.UUID;
import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

/**
 *
 * @author sohail.alam
 */
@Root(name = "Quiz")
public class QuestionBankStructure implements Serializable {

	private static final long serialVersionUID = 3443757615530896340L;
	@ElementList(required = false, empty = false, inline = true, type = QuestionStructure.class)
	private ArrayList<QuestionStructure> question;
	@ElementList(required = false, empty = false, inline = true, type = OptionStructure.class)
	private ArrayList<OptionStructure> option;
	@Attribute(name = "subject", required = true)
	private String subject;
	@Attribute(name = "topic", required = true)
	private String topic;
	@Attribute(name = "timeLimit", required = true)
	private String timeLimit;
	@Attribute(name = "uuid", required = true)
	private String uuid;

	/**
	 *
	 */
	public QuestionBankStructure() {
		question = new ArrayList<QuestionStructure>();
	}

	/**
	 * 
	 * @param question
	 * @param subject
	 * @param topic
         * @param timeLimit
         * @param uuid  
	 */
	public QuestionBankStructure(ArrayList<QuestionStructure> question,
		String subject, String topic, String timeLimit, String uuid) {
		this.question = question;
		this.subject = subject;
		this.topic = topic;
		this.timeLimit = timeLimit;
                this.uuid = uuid;
	}

	/**
	 *
	 * @param question
	 */
	public void addAllQuestions(ArrayList<QuestionStructure> question) {
		this.question.addAll(question);
	}

	/**
	 *
	 * @param question
	 */
	public void addToQuestionList(QuestionStructure question) {
		this.question.add(question);
	}

	/**
	 *
	 * @return
	 */
	public ArrayList<QuestionStructure> getQuestions() {
		return this.question;
	}

	/**
	 *
	 */
	public void clearQuestions() {
		this.question.clear();
	}

	/**
	 * @param paramList the paramList to set
	 */
	public void setOptionList(ArrayList<OptionStructure> option) {
		this.option = option;
	}

	/**
	 * @return the paramList
	 */
	public ArrayList<OptionStructure> getOptionList() {
		return option;
	}

	/**
	 * @return the question
	 */
	public ArrayList<QuestionStructure> getQuestion() {
		return question;
	}

	/**
	 * @param question the question to set
	 */
	public void setQuestion(ArrayList<QuestionStructure> question) {
		this.question = question;
	}

	/**
	 * @return the option
	 */
	public ArrayList<OptionStructure> getOption() {
		return option;
	}

	/**
	 * @param option the option to set
	 */
	public void setOption(ArrayList<OptionStructure> option) {
		this.option = option;
	}

	/**
	 * @return the subject
	 */
	public String getSubject() {
		return subject;
	}

	/**
	 * @param subject the subject to set
	 */
	public void setSubject(String subject) {
		this.subject = subject;
	}

	/**
	 * @return the topic
	 */
	public String getTopic() {
		return topic;
	}

	/**
	 * @param topic the topic to set
	 */
	public void setTopic(String topic) {
		this.topic = topic;
	}

	/**
	 * @return the timeLimit
	 */
	public String getTimeLimit() {
		return timeLimit;
	}

	/**
	 * @param timeLimit the timeLimit to set
	 */
	public void setTimeLimit(String timeLimit) {
		this.timeLimit = timeLimit;
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
}

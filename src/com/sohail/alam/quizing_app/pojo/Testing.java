/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sohail.alam.quizing_app.pojo;

import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.UUID;
import org.simpleframework.xml.Serializer;
import org.simpleframework.xml.core.Persister;

/**
 *
 * @author sohail.alam
 */
public class Testing {

	public static void main(String args[]) {
		OptionStructure option1 = new OptionStructure(1, "This is option 1.", String.valueOf(UUID.randomUUID()));
		option1.removeCorrectAnsFlag();
		OptionStructure option2 = new OptionStructure(2, "This is option 2.", String.valueOf(UUID.randomUUID()));
		option2.removeCorrectAnsFlag();

		ArrayList<OptionStructure> optionsList = new ArrayList<OptionStructure>();
		optionsList.add(option1);
		optionsList.add(option2);

		QuestionStructure question1 = new QuestionStructure(optionsList, 1, 5, "This is question 1", String.valueOf(UUID.randomUUID()));
		QuestionStructure question2 = new QuestionStructure(optionsList, 2, 1, "This is question 2", String.valueOf(UUID.randomUUID()));

		ArrayList<QuestionStructure> questionList = new ArrayList<QuestionStructure>();
		questionList.add(question1);
		questionList.add(question2);

		QuestionBankStructure quiz = new QuestionBankStructure(questionList, "Test", "Test1", "123", String.valueOf(UUID.randomUUID()));

		Serializer serialize = new Persister();
		ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
		OutputStreamWriter outputStreamWriter = new OutputStreamWriter(
			byteArrayOutputStream);

		try {
			serialize.write(quiz, outputStreamWriter);
		} catch (Exception e) {
		}

		String xmlMsg = byteArrayOutputStream.toString();
		System.out.println(xmlMsg);
	}
}

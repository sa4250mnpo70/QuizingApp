/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sohail.alam.quizing_app;

import java.util.UUID;

/**
 *
 * @author SOHAIL
 */
public class Questions {

    private int questionNo = 0;
    private int difficulty = 0;
    private String text = null;
    private byte[] image = null;
    private String uuid = null;

    /**
     * 
     */
    public Questions() {
    }
    
    /**
     * 
     * @param questionNo
     * @param difficulty
     * @param text 
     */
    public Questions(int questionNo, int difficulty, String text){
        this.questionNo = questionNo;
        this.difficulty = difficulty;
        this.text = text;
        this.uuid = String.valueOf(UUID.randomUUID());
    }
    
    /**
     * 
     * @param questionNo
     * @param difficulty
     * @param text
     * @param image 
     */
    public Questions(int questionNo, int difficulty, String text, byte[] image){
        this.questionNo = questionNo;
        this.difficulty = difficulty;
        this.text = text;
        this.image = image;
        this.uuid = String.valueOf(UUID.randomUUID());
    }

    /**
     * @return the questionNo
     */
    public int getQuestionNo() {
        return questionNo;
    }

    /**
     * @param questionNo the questionNo to set
     */
    public void setQuestionNo(int questionNo) {
        this.questionNo = questionNo;
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
    public byte[] getImage() {
        return image;
    }

    /**
     * @param image the image to set
     */
    public void setImage(byte[] image) {
        this.image = image;
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

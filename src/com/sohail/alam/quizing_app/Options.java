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
public class Options {

    private int number;
    private String text;
    private byte[] image;
    private Boolean correctAns;
    private String uuid;

    /**
     * 
     */
    public Options() {
    }

    /**
     * 
     * @param number
     * @param text 
     */
    public Options(int number, String text){
        this.number = number;
        this.text = text;
        this.uuid = String.valueOf(UUID.randomUUID());
    }
    
    /**
     * 
     * @param number
     * @param text
     * @param image 
     */
    public Options(int number, String text, byte[] image){
        this.number = number;
        this.text = text;
        this.image = image;
        this.uuid = String.valueOf(UUID.randomUUID());
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
     * @return the correctAns
     */
    public Boolean getCorrectAns() {
        return correctAns;
    }

    /**
     * @param correctAns the correctAns to set
     */
    public void setCorrectAns(Boolean correctAns) {
        this.correctAns = correctAns;
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

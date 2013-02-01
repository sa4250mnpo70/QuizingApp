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
public class Quiz {

    private String subject;
    private String topic;
    private String timeLimit;
    private String uuid;
    private static volatile Quiz instance = null;

    /**
     * 
     */
    private Quiz() {
        this.uuid = String.valueOf(UUID.randomUUID());
    }

    /**
     * 
     * @return 
     */
    public static Quiz getInstance() {
        if (instance == null) {
            synchronized (QuizingAppMethods.class) {
                if (instance == null) {
                    instance = new Quiz();
                }
            }
        }
        return instance;
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
}

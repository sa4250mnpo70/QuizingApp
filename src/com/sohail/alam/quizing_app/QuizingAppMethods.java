/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sohail.alam.quizing_app;

/**
 * This is a singleton class containing all methods to be used for the quizing
 * application.
 *
 * @author SOHAIL
 */
public class QuizingAppMethods {

    private static volatile QuizingAppMethods instance = null;

    /**
     *
     */
    private QuizingAppMethods() {
    }

    /**
     *
     * @return
     */
    public static QuizingAppMethods getInstance() {
        if (instance == null) {
            synchronized (QuizingAppMethods.class) {
                if (instance == null) {
                    instance = new QuizingAppMethods();
                }
            }
        }
        return instance;
    }

    /**
     * Login only for administrators
     *
     * @param username
     * @param password
     * @return
     */
    public boolean loginAdmin(String username, String password) {
        return true;
    }

    /**
     * Normal Login for all members
     *
     * @param username
     * @param password
     * @return
     */
    public boolean login(String username, String password) {
        return false;
    }

    /**
     * Logout for all members including Administrators
     *
     * @param username
     * @return
     */
    public boolean logout(String username) {
        return true;
    }
}

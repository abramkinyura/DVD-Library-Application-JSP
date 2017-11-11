/*
 * DVDItem.java
 *
 * Created on December 7, 2005, 10:43 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package com.dvd.model;

import java.io.Serializable;

/**
 *
 * @author student
 */
public class DVDItem implements Serializable {
    
    /** Creates a new instance of DVDItem */
    public DVDItem(String title, String year, String genre) {
        this.title = title;
        this.year = year;
        this.genre = genre;
    }

    /**
     * Holds value of property title.
     */
    private String title;

    /**
     * Getter for property title.
     * @return Value of property title.
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * Holds value of property year.
     */
    private String year;

    /**
     * Getter for property year.
     * @return Value of property year.
     */
    public String getYear() {
        return this.year;
    }

    /**
     * Holds value of property genre.
     */
    private String genre;

    /**
     * Getter for property genre.
     * @return Value of property genre.
     */
    public String getGenre() {
        return this.genre;
    }
    
}

/*
 * AddDVDForm.java
 *
 * Created on December 9, 2005, 2:42 PM
 */

package com.dvd.view;

import javax.servlet.http.HttpServletRequest;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

/**
 *
 * @author student
 * @version
 */

public class AddDVDForm extends org.apache.struts.action.ActionForm {
    
    /**
     *
     */
    public AddDVDForm() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
        ActionErrors errors = new ActionErrors();
        // Form verification
        if ( title.length() == 0 ) {
            errors.add("title", new ActionMessage("error.titleField.required"));
        }
        if ( year.length() == 0 ) {
            errors.add("year", new ActionMessage("error.yearField.required"));
        } else if (!year.matches("\\d\\d\\d\\d")) {
            errors.add("year", new ActionMessage("error.yearField.invalid"));
        }
        return errors;
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
     * Setter for property title.
     * @param title New value of property title.
     */
    public void setTitle(String title) {
        this.title = title;
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
     * Setter for property year.
     * @param year New value of property year.
     */
    public void setYear(String year) {
        this.year = year;
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
    
    /**
     * Setter for property genre.
     * @param genre New value of property genre.
     */
    public void setGenre(String genre) {
        this.genre = genre;
    }
    
    /**
     * Holds value of property newGenre.
     */
    private String newGenre;
    
    /**
     * Getter for property newGenre.
     * @return Value of property newGenre.
     */
    public String getNewGenre() {
        return this.newGenre;
    }
    
    /**
     * Setter for property newGenre.
     * @param newGenre New value of property newGenre.
     */
    public void setNewGenre(String newGenre) {
        this.newGenre = newGenre;
    }
}

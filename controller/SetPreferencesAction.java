/*
 * SetPreferencesAction.java
 *
 * Created on December 8, 2005, 10:30 PM
 */

package com.dvd.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionForward;
/**
 *
 * @author student
 * @version
 */

public class SetPreferencesAction extends Action {
    
    /* forward name="success" path="" */
    private final static String SUCCESS = "success";
    
    /**
     * This is the action called from the Struts framework.
     * @param mapping The ActionMapping used to select this instance.
     * @param form The optional ActionForm bean for this request.
     * @param request The HTTP Request we are processing.
     * @param response The HTTP Response we are processing.
     * @throws java.lang.Exception
     * @return
     */
    public ActionForward execute(ActionMapping mapping, ActionForm  form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        
        // Retrieve form parameters
        String[] show_values = request.getParameterValues("show");
        
        // Retrieve the session object
        HttpSession session = request.getSession();
        
        // Remove old values
        session.removeAttribute("showTitle");
        session.removeAttribute("showYear");
        session.removeAttribute("showGenre");
        
        // Use the parameter values as attribute names
        if ( show_values != null ) {
            for ( int i = 0; i < show_values.length; i++ ) {
                session.setAttribute(show_values[i], "true");
            }
        }
        
        return mapping.findForward("success");
    }
}

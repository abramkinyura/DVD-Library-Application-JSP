/*
 * AddDVDAction.java
 *
 * Created on December 8, 2005, 9:40 PM
 */

package com.dvd.controller;

import com.dvd.model.DVDItem;
import com.dvd.model.DVDLibrary;
import com.dvd.view.AddDVDForm;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMessage;
import org.apache.struts.action.ActionMessages;
/**
 *
 * @author student
 * @version
 */

public class AddDVDAction extends Action {
    
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
        
        ServletContext context = getServlet().getServletContext();
        // Use Struts actions to record business processing errors.
        ActionErrors errors = new ActionErrors();
        // Store this set in the request scope, in case we need to
        // send the ErrorPage view.
        saveMessages(request, errors);
        try {
            // Retrieve the DVD library from the session-scope
            HttpSession session = request.getSession();
            DVDLibrary library = (DVDLibrary) session.getAttribute("library");
            
            // Cast the action form to an application-specific form
            AddDVDForm myForm = (AddDVDForm) form;
            
            // Business logic
            DVDItem item = library.addDVD(myForm.getTitle(),
                    myForm.getYear(),
                    myForm.getGenre());
            
            // Store the item on the request-scope
            request.setAttribute("dvdItem", item);
            
            // Dispatch to Success view
            return mapping.findForward("success");
            
            // Handle any unexpected expections
        } catch (RuntimeException e) {
            // Log stack trace
            context.log("An unexpected error: ", e);
            // Record the error
            errors.add(ActionMessages.GLOBAL_MESSAGE,
                    new ActionMessage("error.unexpectedError",
                    e.getMessage()));
            // and forward to the error handling page (the form itself)
            return mapping.findForward("error");
        }
    }
}

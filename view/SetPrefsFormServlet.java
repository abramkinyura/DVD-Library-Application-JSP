/*
 * SetPrefsFormServlet.java
 *
 * Created on December 8, 2005, 10:52 PM
 */

package com.dvd.view;

import java.io.*;
import java.net.*;

import javax.servlet.*;
import javax.servlet.http.*;

/**
 *
 * @author student
 * @version
 */
public class SetPrefsFormServlet extends HttpServlet {
    
    /** Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     * @param request servlet request
     * @param response servlet response
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        
        out.println("<html>");
        out.println("<head>");
        out.println("<title>DVD Library Application : Set Display Preferences</title>");
        out.println("<body bgcolor='white'>");
        
        out.println("<h1>Set Display Preferences</h1>");
        
        out.println("<form method='POST' action='"
                + response.encodeURL("set_prefs.do")
                + "'>");
        
        out.println("  Columns to display in list:");
        out.println("  <input type='checkbox' name='show' value='showTitle'> title");
        out.println("  <input type='checkbox' name='show' value='showYear'> year");
        out.println("  <input type='checkbox' name='show' value='showGenre'> genre");
        
        out.println("  <br/><br/>");
        
        out.println("  <input type='submit' value='Set Preferences'>");
        
        out.println("</form>");
        
        out.println("</body>");
        out.println("</html>");
        out.close();
    }
    
    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /** Handles the HTTP <code>GET</code> method.
     * @param request servlet request
     * @param response servlet response
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        processRequest(request, response);
    }
    
    /** Handles the HTTP <code>POST</code> method.
     * @param request servlet request
     * @param response servlet response
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        processRequest(request, response);
    }
    
    /** Returns a short description of the servlet.
     */
    public String getServletInfo() {
        return "Short description";
    }
    // </editor-fold>
}

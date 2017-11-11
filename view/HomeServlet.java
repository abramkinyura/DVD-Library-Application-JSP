/*
 * HomeServlet.java
 *
 * Created on December 8, 2005, 10:49 PM
 */

package com.dvd.view;

import java.io.*;

import javax.servlet.*;
import javax.servlet.http.*;

/**
 *
 * @author student
 * @version
 */
public class HomeServlet extends HttpServlet {
    
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
        out.println("<title>DVD Library Application</title>");
        out.println("<body bgcolor='white'>");
        
        out.println("<h1>DVD Library Application</h1>");
        
        out.println("<ul>");
        out.println("  <li><a href='"
                + response.encodeURL("list_library.view")
                + "'>Display my DVD library</a></li>");
        out.println("  <li><a href='"
                + response.encodeURL("add_dvd.view")
                + "'>Add a DVD to my collection</a></li>");
        out.println("  <li><a href='"
                + response.encodeURL("set_prefs.view")
                + "'>Set user preferences</a></li>");
        out.println("</ul>");
        
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

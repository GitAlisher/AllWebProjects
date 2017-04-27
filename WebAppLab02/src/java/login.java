/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.lang.*;
/**
 *
 * @author Alisher
 */
@WebServlet(urlPatterns = {"/login"})
public class login extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    public static String IPN;
    public static String password;
    public static String name;
    public static boolean used;
    public static boolean curSt = false;
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        try{
            /* TODO output your page here. You may use following sample code. */
            IPN = request.getParameter("ipn");
            password = request.getParameter("pw");
            name = Validate.getName(IPN, password);
            if (name.equals("")) {
                out.println("<div style = \" position: relative; color: red; left: 550px; top:400px; font-size: 16px;\">");
                out.println("Invalid IPN or Password</div>");
                RequestDispatcher rd = request.getRequestDispatcher("login.html");
                rd.include(request, response);
            } else {
                out.println("<h3 style=\" margin-left: 1100px; color: #3577e0;\"> Welcome " + name + " </h3>");
                
                if (Validate.Played(IPN)) {
                    out.println("<form action=\"Rating\" method=\"GET\" style=\"margin-left: 1150px; margin-top: 30px;\">");
                    out.println("<input type=\"submit\" value=\"See Rating\" style= \"font-size:14px; color:#3577e0;border: 2px solid #3577e0; border-radius: 5px; background-color:white;box-shadow: 0 8px 16px 0 rgba(0,0,0,0.2), 0 6px 20px 0 rgba(0,0,0,0.19);\">");
                    out.println("</form>");
                
                }
                
                out.println("<div id = \"MainText\">");
			out.println("<h1 style = \"font-size: 50px; text-align: center; position:relative;\"> Who wants to be MILLIONAIER  </h1>");
		out.println("</div>");
                if (!Validate.Played(IPN)) {
                    out.println("<form action=\"game\" method=\"GET\" style=\"margin-left: 600px; margin-top: 200px;\">");
                    out.println("<input type=\"submit\" name=\"1\" value=\"Play\" style= \"font-size:40px; color:#3577e0;border: 2px solid #3577e0; border-radius: 5px; background-color:white;box-shadow: 0 8px 16px 0 rgba(0,0,0,0.2), 0 6px 20px 0 rgba(0,0,0,0.19);\">");
                    out.println("</form>");
                } 
                
                //response.sendRedirect("Main2.html");
                RequestDispatcher rd = request.getRequestDispatcher("Main2.html");
                rd.include(request, response);
            }
            
            /*if(Validate.checkUser(IPN, password))
            {
                out.println("Welcome User");
                RequestDispatcher rs = request.getRequestDispatcher("Welcome");
                rs.forward(request, response);
            }
            else
            {
                out.println("Username or Password incorrect");
                RequestDispatcher rs = request.getRequestDispatcher("index.html");
                rs.include(request, response);
            }*/

        }
        catch (Exception e) {
            out.println(e + " /n bla bla bla exception here");
        }
       
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}

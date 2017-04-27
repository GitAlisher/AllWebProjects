package Servlet;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
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
    public static String Login;
    public static String password;
    public static String name;
    public static String UserID;
    public static int money = 0;

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        response.setContentType("text/html;charset=UTF-8");
        HttpSession session = request.getSession();
        PrintWriter out = response.getWriter();
        
        try{
            /* TODO output your page here. You may use following sample code. */
            Login = request.getParameter("ipn");
            password = request.getParameter("pw");
            //name = Validate.getName(Login, password);
            if (!Validate.CheckUser(Login, password)) {
                out.println("<div style = \" position: relative; color: red; left: 550px; top:400px; font-size: 16px;\">");
                out.println("Invalid Login or Password</div>");
                RequestDispatcher rd = request.getRequestDispatcher("login.html");
                rd.include(request, response);
            } else {
                name = Validate.getName(Login, password);
                money = Validate.getCash(Login, password);
                UserID = Integer.toString(Validate.getUserId(Login, password));

                session.setAttribute("session_name", name);
                session.setAttribute("session_cash", money);
                session.setAttribute("session_log", Login);
                session.setAttribute("session_pw", password);

                response.sendRedirect("main.jsp");
                /*RequestDispatcher rd = request.getRequestDispatcher("main.jsp");
                rd.include(request, response);*/
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

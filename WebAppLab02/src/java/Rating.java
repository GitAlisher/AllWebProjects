/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import static java.util.Collections.reverseOrder;
import java.util.Comparator;
import static java.util.Comparator.comparing;
import java.util.List;
import javafx.util.Pair;

/**
 *
 * @author Alisher
 */
@WebServlet(name = "Rating", urlPatterns = {"/Rating"})
public class Rating extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException {
        response.setContentType("text/html;charset=UTF-8");
        Statement st;
        ResultSet rs;
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<h3 style=\" margin-left: 1100px; color: #3577e0;\"> Welcome " + login.name + "</h3>");
                //out.println("<div id = \"MainText\">");
            out.println("<h1 style = \"border-top: solid 3px;border-bottom: solid 3px;color: #3577e0;margin-top: 100px;font-size: 50px; text-align: center; position:relative;\"> Who wants to be MILLIONAIER  </h1>");

            st = Validate.connect.createStatement();
            if (login.curSt) 
                st.executeUpdate("INSERT INTO rating VALUES(NULL, '" + login.name + "','" + CheckAns.Score + "');");
            
            rs = st.executeQuery("SELECT * FROM rating");
            final List<Pair<String, Integer>> arr = new ArrayList<>();
            final Comparator<Pair<String, Integer>> c = reverseOrder(comparing(Pair::getValue));
          
            int cnt = 0;
            while (rs.next()) {
                arr.add(new Pair<String, Integer>(rs.getString("Name"),rs.getInt("Score")));
                cnt++;
            }
            Collections.sort(arr, c );
            int[] score = new int[100];
            String[] name = new String[100];
            String str = "";
            out.println("<table style=\"margin-left:600px; border: solid 2px; color: #35770e;\"> <tr> <th> Rating (Name=Score) </th></tr>");
            for (int i = 0; i < cnt; i++) {
                //str = arr.get(i);
                out.println("<tr ><td style=\"margin-left:600px; border: solid 2px; color: #35770e;\"> " + (arr.get(i)) + "</td></tr>");
            }
            out.println("</table>");
            out.println("<a href=\"Main1.html\" style=\" margin-top:100px;margin-left: 600px; color: #3577e0;\"> Log out and Go to Main  </h3>");
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
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(Rating.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(Rating.class.getName()).log(Level.SEVERE, null, ex);
        }
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

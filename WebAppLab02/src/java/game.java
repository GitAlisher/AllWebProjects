
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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Alisher
 */
@WebServlet(urlPatterns = {"/game"})
public class game extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    public static String Question = null;
    public static String A = null;
    public static String B = null;
    public static String C = null;
    public static String D = null;
    public static int ID = 1;
    
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException {
        response.setContentType("text/html;charset=UTF-8");
        Statement st;
        ResultSet rs;
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            Validate.updateParticipate(login.IPN);
            st = Validate.connect.createStatement();
            
            if (ID > 5) {
                login.curSt = true;
                response.sendRedirect("Rating");
            }
            out.println("<h3 style=\" margin-left: 1100px; color: #3577e0;\"> Welcome " + login.name + "</h3>");
                //out.println("<div id = \"MainText\">");
            out.println("<h1 style = \"border-top: solid 3px;border-bottom: solid 3px;color: #3577e0;margin-top: 100px;font-size: 50px; text-align: center; position:relative;\"> Who wants to be MILLIONAIER  </h1>");
		//out.println("</div>");
            
            
            rs = st.executeQuery("SELECT * FROM question WHERE ID =" + ID + ";");
            rs.next();
            Question = rs.getString("Context");
            A = rs.getString("A");
            B = rs.getString("B");
            C = rs.getString("C");
            D = rs.getString("D");
            
            out.println("<p style=\"font-size: 2em;\"> " + Question + "</p><br>");
            out.println("<form action = \"CheckAns\" method=\"POST\" style= \"position:relative; float:left; margin-right: 50px;\">");
                out.println("<input type='submit' value =\"" + A + "\" name=\"Answer\" style=\"font-size:14px; width:250px; height:120px; color:#3577e0; border-radius: 5px; background-color:white;\">");
            out.println("</form>");
             out.println("<form action = \"CheckAns\" method=\"POST\"style= \"position:relative;float:left; margin-right: 50px;\">");
                out.println("<input type='submit' value =\"" + B + "\" name=\"Answer\" style=\"font-size:14px; width:250px; height:120px; color:#3577e0; border-radius: 5px; background-color:white;\">");
            out.println("<form action = \"CheckAns\" method=\"POST\"style= \"position:relative;float:left; margin-right: 50px;\">");
                out.println("<input type='submit' value =\"" + C + "\" name=\"Answer\" style=\"font-size:14px; width:250px; height:120px; color:#3577e0; border-radius: 5px; background-color:white;\">");
            out.println("</form>");
            out.println("<form action = \"CheckAns\" method=\"POST\" style= \"position:relative; float:left; margin-right: 50px; \">");
                out.println("<input type='submit' value =\"" + D + "\" name=\"Answer\" style=\"font-size:14px; width:250px; height:120px; color:#3577e0; border-radius: 5px; background-color:white;\">");
            out.println("</form>");
            //response.sendRedirect("Game.jsp");
            out.println("<h3 style=\" margin-left: 1100px; color: #3577e0;\"> Your Score : " + CheckAns.Score + "</h3>");
            RequestDispatcher rd = request.getRequestDispatcher("Main2.html");
            rd.include(request, response);
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
            Logger.getLogger(game.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(game.class.getName()).log(Level.SEVERE, null, ex);
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

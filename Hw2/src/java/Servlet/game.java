/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Alisher
 */
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
    public static int indi;
    public static int indj;
    public static int win = 0;
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        indi = Integer.parseInt(request.getParameter("id"));
        indj = indi % typeServlet.SZ;
        indi /= typeServlet.SZ;
        try (PrintWriter out = response.getWriter()) {
            if (typeServlet.arr[indi][indj] == 0) {
                typeServlet.arr[indi][indj] = typeServlet.id % 2  + 1;
                typeServlet.id++;
            }
            int cnt = 0;
            for (int i = 0; i < typeServlet.SZ; i++) {
                if (typeServlet.arr[i][i] == 1)
                    cnt++;
            }
            if (cnt == typeServlet.SZ)
                win = 1;
            cnt = 0;
            for (int i = 0; i < typeServlet.SZ; i++) {
                for (int j = 0; j < typeServlet.SZ; j++) {
                    if (typeServlet.arr[i][j] == 1)
                        cnt++;
                }
                if (cnt == typeServlet.SZ) {
                    win = 1;
                    break;
                }
                cnt = 0;
            }
            cnt = 0;
            for (int i = 0; i < typeServlet.SZ; i++) {
                for (int j = 0; j < typeServlet.SZ; j++) {
                    if (typeServlet.arr[j][i] == 1)
                        cnt++;
                }
                if (cnt == typeServlet.SZ) {
                    win = 1;
                    break;
                }
                cnt = 0;
            }
            cnt = 0;
            for (int i = 0; i < typeServlet.SZ; i++) {
                for (int j = 0; j < typeServlet.SZ; j++) {
                    if (i + j == typeServlet.SZ - 1 && typeServlet.arr[j][i] == 1)
                        cnt++;
                }
                if (cnt == typeServlet.SZ) {
                    win = 1;
                    break;
                }
            }
            cnt = 0;
            for (int i = 0; i < typeServlet.SZ; i++) {
                if (typeServlet.arr[i][i] == 1)
                    cnt++;
            }
            if (cnt == typeServlet.SZ)
                win = 2;
            cnt = 0;
            for (int i = 0; i < typeServlet.SZ; i++) {
                for (int j = 0; j < typeServlet.SZ; j++) {
                    if (typeServlet.arr[i][j] == 1)
                        cnt++;
                }
                if (cnt == typeServlet.SZ) {
                    win = 2;
                    break;
                }
                cnt = 0;
            }
            cnt = 0;
            for (int i = 0; i < typeServlet.SZ; i++) {
                for (int j = 0; j < typeServlet.SZ; j++) {
                    if (typeServlet.arr[j][i] == 1)
                        cnt++;
                }
                if (cnt == typeServlet.SZ) {
                    win = 2;
                    break;
                }
                cnt = 0;
            }
            cnt = 0;
            for (int i = 0; i < typeServlet.SZ; i++) {
                for (int j = 0; j < typeServlet.SZ; j++) {
                    if (i + j == typeServlet.SZ - 1 && typeServlet.arr[j][i] == 1)
                        cnt++;
                }
                if (cnt == typeServlet.SZ) {
                    win = 2;
                    break;
                }
            }
            
            if (win != 0)
                response.sendRedirect("win.jsp");
            else
                response.sendRedirect("newjsp.jsp");
            /* TODO output your page here. You may use following sample code. */
           
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

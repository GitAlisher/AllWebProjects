package Servlet;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alisher
 */
import java.sql.*;
import java.lang.*;
import java.util.Arrays;

public class Validate {
    public static Connection connect;
    
    public static boolean CheckUser (String Login, String Password) {
        Statement st;
        ResultSet rs;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/ask","root","");
            st = connect.createStatement();
            rs = st.executeQuery("Select * FROM user");
            
            while (rs.next()) {
                if (rs.getString("login").equals(Login) && rs.getString("password").equals(Password))
                    return true;      
            }
            
            return false;
        } catch(Exception e) {
            return false;
        }
        
    }
     public static int getUserId(String Login,String Password) throws SQLException {
        Statement st;
        ResultSet rs;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/ask","root","");

            st = connect.createStatement();
            rs = st.executeQuery("Select * FROM user WHERE login=\"" + Login + "\" AND password=\"" + Password + "\";");
            rs.next();
            return rs.getInt("id");
        }catch(Exception e) {
            return -1;
        }
    }
    public static String getName(String Login,String Password) throws SQLException {
        Statement st;
        ResultSet rs;
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/ask","root","");

            st = connect.createStatement();
            rs = st.executeQuery("Select * FROM user WHERE login=\"" + Login + "\" AND password=\"" + Password + "\";");
            rs.next();
            return rs.getString("name");
        }catch(Exception e) {
            return "Inside in exception " + e;
        } 
    }
    
    }
  
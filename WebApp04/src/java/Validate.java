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

public class Validate {
    public static Connection connect;
    public static boolean CheckUser (String Login, String Password) {
        Statement st;
        ResultSet rs;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/shopingcart","root","");
            st = connect.createStatement();
            rs = st.executeQuery("Select * FROM users");
            
            while (rs.next()) {
                if (rs.getString("Login").equals(Login) && rs.getString("Password").equals(Password))
                    return true;      
            }
            
            return false;
        } catch(Exception e) {
            return false;
        }
    }
    public static String getName(String Login,String Password) throws SQLException {
        Statement st;
        ResultSet rs;
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/shopingcart","root","");

            st = connect.createStatement();
            rs = st.executeQuery("Select * FROM users WHERE Login=\"" + Login + "\" AND Password=\"" + Password + "\";");
            rs.next();
            return rs.getString("Name");
        }catch(Exception e) {
            return "Inside in exception " + e;
        } 
    }
     public static int getCash(String Login,String Password) {
        Statement st;
        ResultSet rs;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/shopingcart","root","");
            st = connect.createStatement();
            rs = st.executeQuery("Select Money FROM users WHERE Login='" + Login + "' AND Password='" + Password + "'");
            rs.next();
            
            return rs.getInt("Money");
        } catch(Exception e) {
            return 0;
        }
    }
    /*
    public static String getName(String ipn,String password) {
        Statement st;
        ResultSet rs;
        try{

	 //loading drivers for mysql
        Class.forName("com.mysql.jdbc.Driver");

            //creating connection with the database
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/shopingcart","root","");
            connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/shopingcart","root","");
            String IPN = ipn;
            String Password = password;
            //String result = Validate.checkUser(IPN, password);
            //out.println(result);
            st = con.createStatement();
            rs = st.executeQuery("SELECT Login,Password, Name FROM users");
            String result = "";
            while (rs.next()) {
                if (rs.getInt(1)== Integer.parseInt(IPN) && rs.getString(2).equals(Password)) {
                    result = rs.getString(3);
                    break;
                }
            }
            return result;
            
        } catch(Exception e)
        {
            e.printStackTrace();
            return "";
        }                
    }
    public static void setData(String ipn, String password, String name) {
        PreparedStatement ps;
        try{

	 //loading drivers for mysql
            Class.forName("com.mysql.jdbc.Driver");

            //creating connection with the database
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/users","root","");
            //String result = Validate.checkUser(IPN, password);
            //out.println(result);
            ps = con.prepareStatement("INSERT INTO user(IPN, Password, Name) VALUES(?,?,?)");
            ps.setString(1, ipn);
            ps.setString(2, password);
            ps.setString(3, name);
            ps.executeUpdate();
            
        } catch(Exception e) {
          e.printStackTrace();
        }
    }
    public static boolean Played(String ipn) throws SQLException {
        Statement st;
        ResultSet rs;
        try{
            st = connect.createStatement();
            rs = st.executeQuery("SELECT * FROM user WHERE IPN =" + ipn + ";");
            if (rs.next())
                return rs.getBoolean("Participate");
           
            return false;
        } catch (Exception e)
        {
            e.printStackTrace();
            return false;
        }
    }
    public static void updateParticipate(String ipn) {
        Statement st;
        try{
            
            int IP = Integer.parseInt(ipn);
            st = connect.createStatement();
            st.executeUpdate("UPDATE user SET Participate = TRUE WHERE IPN =" + IP + ";");
           
        } catch (Exception e)
        {
            e.printStackTrace();
           
        }
    }
    
    public static boolean checkIPN(String ipn) {
        Statement st;
        ResultSet rs;
        try{

	 //loading drivers for mysql
            Class.forName("com.mysql.jdbc.Driver");

            //creating connection with the database
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/users","root","");
            //String result = Validate.checkUser(IPN, password);
            //out.println(result);
            st = con.createStatement();
            rs = st.executeQuery("SELECT IPN FROM user");
            while (rs.next()) {
                if (rs.getInt(1)== Integer.parseInt(ipn)) {
                    return true;
                }
            }
            return false;
            
        } catch(Exception e)
        {
            e.printStackTrace();
            return false;
        }          
        
    }*/
}

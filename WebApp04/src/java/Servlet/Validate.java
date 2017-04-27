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
     public static int getUserId(String Login,String Password) throws SQLException {
        Statement st;
        ResultSet rs;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/shopingcart","root","");

            st = connect.createStatement();
            rs = st.executeQuery("Select * FROM users WHERE Login=\"" + Login + "\" AND Password=\"" + Password + "\";");
            rs.next();
            return rs.getInt("ID");
        }catch(Exception e) {
            return -1;
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
    public static int getPrise(String BookId) {
        Statement st;
        ResultSet rs;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/shopingcart","root","");
            st = connect.createStatement();
            rs = st.executeQuery("Select Prise FROM product WHERE ID='" + BookId + "'");
            rs.next();
            
            return rs.getInt("Prise");
        } catch(Exception e) {
            return 0;
        }
    }
    public static void addBook(String UserId, String BookId) {
        PreparedStatement ps;
        try{

	 //loading drivers for mysql
            Class.forName("com.mysql.jdbc.Driver");

            //creating connection with the database
            //String result = Validate.checkUser(IPN, password);
            //out.println(result);
            int prise = getPrise(BookId);
            if (login.money < prise) {
                return;
            } else {
                login.money -= prise;
                ps = connect.prepareStatement("INSERT INTO purchase( UserID, ProductID) VALUES(?,?)");
                ps.setString(1, UserId);
                ps.setString(2, BookId);
                ps.executeUpdate();
                ps = connect.prepareStatement("UPDATE users SET Money = ? WHERE ID = ?");
                ps.setInt(1, login.money);
                ps.setString(2, UserId);
                ps.executeUpdate();
            }        
        } catch(Exception e) {
          e.printStackTrace();
        }

    }
    public static void getList(String UserId) {
        Statement st;
        ResultSet rs;
        System.out.println("WE are inside the function getList !!!");
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/shopingcart","root","");
            int INF = 10000000;
            st = connect.createStatement();
            int id = Integer.parseInt(UserId);
            //rs = st.executeQuery("Select p.ProductName, p.Detail, p.Prise FROM product p, purchase pur WHERE pur.UserID='" + UserId + "' pur.ProductID = p.ID");
            rs = st.executeQuery("Select * FROM purchase WHERE UserID='" + id + "';");
            int[] pID = new int[20];
            
            int e = 0;
            for (int i = 0; i < 20; i++) {
                pID[i] = INF;
            }
            while (rs.next()) 
                    pID[e++] = rs.getInt("ProductID");
            
            int q = 0;
            System.out.println("len of pID is equal " + e + " " + pID[0] + " " + pID[1] + " " + pID[2]);
            Arrays.sort(pID);
            System.out.println("len of pID is equal " + e + " " + pID[0] + " " + pID[1] + " " + pID[2]);
            rs = st.executeQuery("Select * FROM product");
            AddBook.lenList = 0;
            System.out.println("q is equal " + q);
            
            while(rs.next() || q != e) {
                if (pID[q] == rs.getInt("ID")) {
                    AddBook.nameB[AddBook.lenList] = rs.getString("ProductName");
                    AddBook.Detail[AddBook.lenList] = rs.getString("Detail");
                    AddBook.Prise[AddBook.lenList] = rs.getInt("Prise");
                    AddBook.lenList++;
                    q++;
                }
            }
            
         
        } catch(Exception e) {
            e.printStackTrace();
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

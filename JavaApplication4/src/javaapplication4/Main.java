/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

/**
 *
 * @author Alisher
 */
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        // TODO code application logic here
        		
		//PrintWriter p = response.getWriter();
		int i = 1;

        Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            String database =
              "jdbc:odbc:Driver={Microsoft Access Driver (*.mdb)};DBQ=C:\\xampp\\C30_P04_EditorDB.mdb;";
            Connection connect = DriverManager.getConnection(database, "", "");
            Statement s = connect.createStatement();

            // create a table
           String query = "SELECT DISTINCT  Reviewers.ReviewerID, Name, Role, Email, BOKinterest, DateAssigned AS LatestRequested, DateReturned AS LatestReturned FROM Reviewers, ReviewerInt, Reviews WHERE (Reviewers.ReviewerID = ReviewerInt.ReviewerID) AND  (Reviewers.ReviewerID = Reviews.ReviewerID) AND (DateAssigned = (SELECT max(DateAssigned) FROM Reviews)) AND BOKinterest = 'Interested' ";

            Statement stmt = connect.createStatement();
			
            ResultSet rs = stmt.executeQuery(query);
            String[] str = new String[1000];
            int e = 0;
            if(rs.next()) {
                while(rs.next()) {
                    String ReviewerID = rs.getString("ReviewerID");
		
                    String Name = rs.getString("Name ");

                    String Role = rs.getString("Role ");

                    String Email = rs.getString("Email ");

                    String BOKinterest = rs.getString("BOKinterest ");

                    String LatestRequested = rs.getString("DateAssigned ");

                    String LatestReturned = rs.getString("DateReturned ");
                    str[e++] = ReviewerID + ' ' + Name + ' ' + Role + ' ' + Email + ' ' + BOKinterest + ' ' + LatestRequested + ' ' + LatestReturned;
                    
                }
    
            }
            
            for (int j = 0; j < e; j++) {
                System.out.println(str[j]);
            }
    }
    
}

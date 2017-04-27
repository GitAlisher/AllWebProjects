<%-- 
    Document   : Detail
    Created on : 13.11.2016, 21:42:16
    Author     : Alisher
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="Servlet.AddBook" %>
<%@page import="Servlet.login" %>
<%@page import="Servlet.Validate" %>


<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="style.css" rel="stylesheet"/>
        <title>JSP Page</title>
    </head>
    <body>
        <div id ="logo">
            BookStore
            <h3 style = "margin-left:950px; margin-right: 30px; font-size: 20px; color: #ffee99; "> <%= session.getAttribute("session_name") %> </h3>
            <h3 style = "margin-left:950px; font-size: 20px; color: #ffee99; "> <%= session.getAttribute("session_cash") %> $ </h3>
            <a href="main.jsp" style = "margin-left:950px; border: solid 1px; border-radius:7px; padding:3px; background-color:#ce831a; font-size: 16px; color: #ffee99;">
                Go back to Main
            </a>
        </div>
        <div id = "main"> 
            <div style="color:#ffee99; margin-top: 60px; margin-right: 40px; border-radius: 8px; ">
            <table>
                <tr>
                    <th>#</th>
                    <th>Book Name</th>
                    <th>Detail</th>
                    <th>Prise</th>
                </tr>
                
                <%
                    //AddBook.lenList = 0;
                    Validate.getList(login.UserID);
                    int len = AddBook.lenList;
                    for (int i = 0; i < len; i++) {%>
                        <tr> 
                            
                            <td> <%= (i + 1)%> </td>
                            <td> <%= AddBook.nameB[i]%> </td>
                            <td> <%= AddBook.Detail[i]%> </td>
                            <td> <%= AddBook.Prise[i]%> </td>
                        </tr>
                <%    }
                %>
            </table>
            </div>
        </div>
    </body>
</html>

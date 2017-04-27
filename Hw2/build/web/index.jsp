<%-- 
    Document   : index
    Created on : 20.10.2016, 14:23:25
    Author     : Alisher
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="Servlet.typeServlet" %>
<%@page import="Servlet.game" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <% for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 15; j++) {
                typeServlet.arr[i][j] = 0;
            }
        }
        typeServlet.id = 0;
        game.indi = 0;
        game.indj = 0;
        typeServlet.SZ = 0;
        game.win = 0;
        %>
    <form action="typeServlet" method="GET">
        <input type="text" name="First" placeholder="Name Player1" required> <br>
        <input type="text" name="Second" placeholder="Name Player2" required> <br>
        <input required type="text" placeholder="Fill size of table " name="Length">
        <input type="submit" value="Submit">
    </form>  

    </body>
</html>

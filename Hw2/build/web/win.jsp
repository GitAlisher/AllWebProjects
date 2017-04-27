<%-- 
    Document   : win
    Created on : 12.11.2016, 21:21:54
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
        <%if (game.win == 1) {%>
            <h1 style="color:#7babf7"> <% out.println(typeServlet.First);%> are Winner!</h1>
        <%} else {%>
             <h1 style="color:#7babf7"> <%out.println(typeServlet.Second);%> are Winner!</h1>
        <%}%>
    </body>
</html>

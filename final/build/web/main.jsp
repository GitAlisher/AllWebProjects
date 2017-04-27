<%-- 
    Document   : main
    Created on : 23.01.2017, 4:07:02
    Author     : Alisher
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="Servlet.login"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Welcome <%= login.name%></h1>
        <a href="ask Someone"> </a>
    </body>
</html>

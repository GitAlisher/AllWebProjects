<%-- 
    Document   : newjsp
    Created on : 13.09.2016, 10:39:02
    Author     : 19539
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" import="java.util.*"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World</h1>
        <%Date date = new Date();
           out.print("<p> Date Now :" + date.toString() + "</p>");
        %>
    </body>
</html>

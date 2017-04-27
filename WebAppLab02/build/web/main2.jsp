<%-- 
    Document   : main2
    Created on : 17.10.2016, 11:09:25
    Author     : Alisher
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="default.Validate" %>
<%@page import="default.login" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="style.css" rel="stylesheet"/>
	<title> Main </title>
    </head>
    <body>
        	
	<div id = "MainText">
            <h1 style = "font-size: 50px; text-align: center; position:relative;"> Who wants to be MILLIONAIER  </h1>
	</div>
        <% if (Validate.Played(login.IPN)) { %>
            <% out.print("<form action=\"game\" method=\"GET\" style=\"margin-left: 600px; margin-top: 200px;\">"); %>
                <% out.print("<input type=\"submit\" name=\"1\" value=\"Play\" style= \"font-size:40px; color:#3577e0; border: 2px solid #3577e0; border-radius: 5px; background-color:white;box-shadow: 0 8px 16px 0 rgba(0,0,0,0.2), 0 6px 20px 0 rgba(0,0,0,0.19);\">");%>
                
            <% out.print("</form>");%>
        <%}%>
        
    </body>
</html>

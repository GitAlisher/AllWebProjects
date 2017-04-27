<%--
    Document   : Game
    Created on : 17.10.2016, 11:29:58
    Author     : Alisher
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="default.Validate" %>
<%@page import="default.login" %>
<%@page import="default.game" %>

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
        <p style="font-size: 2em;"> <% out.print(game.Question); %> </p><br>
             <form action = "CheckAns" method="POST">
                <input type='submit' value ="<% out.print(game.A); %>" name="Answer">
             </form>
             <form action = "ServletAnswer" method="POST">
                <input type='submit' value="<% out.print(game.B); %>" name= "Answer">
             </form>
             <form action = "ServletAnswer" method="POST">
                <input type='submit' value="<% out.print(game.C); %>" name="Answer">
             </form>
             <form action = "ServletAnswer" method="POST">
                <input type='submit' value="<% out.print(game.D); %>" name = "Answer">   
             </form>
             
        
    </body>
</html>

<%-- 
    Document   : index
    Created on : 01.11.2016, 9:28:51
    Author     : 19539
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="Servlet.login;" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <link href="style.css" rel="stylesheet"/>
	<title> Main </title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
    <body>
        <div style = "margin-right:20px; margin-top: 20px;">
            <a href="login.html" style = "float:right; font-size: 20px; color: #ffee99; margin-left:20px;">
		Login
            </a>
            <a href="registr.html" style = "float:right; border: solid 1px; border-radius:7px; padding:3px; background-color:#ce831a; font-size: 16px; color: #ffee99;">
		Registration
            </a>
            <br>
            
	</div>
        <div id ="logo">
            <h1 > BookStore </h1>
            <br>
        </div>
        
        <div id = "main">
            
         <div id = "Book" > 
				<img src ="images/01.jpg" style="width:256px; height:256px;">
				<h2> Miguel de Cervantes </h2>
                
            </div>
            <div id = "Book" > 
				<img src ="images/02.jpg" style="width:256px; height:256px;">
				<h2> Lewis Carroll </h2>
				
            </div>
            <div id = "Book" > 
				<img src ="images/03.jpg" style="width:256px; height:256px;">
				<h2> J. R. R. Tolkien </h2>
              
            </div>
            <div id = "Book" > 
				<img src ="images/04.jpg" style="width:256px; height:256px;">
				<h2> J.K. Rowling </h2>
               
            </div>
            <div id = "Book" > 
				<img src ="images/05.png" style="width:256px; height:256px;">
				<h2> Richard Adams </h2>
                
			</div>
            <div id = "Book" > 
				<img src ="images/book1.jpg" style="width:256px; height:256px;">
				<h2> Shere Hite </h2>
	
            </div>
            <div id = "Book" > 
				<img src ="images/07.jpg" style="width:256px; height:256px;">
				<h2> J. P. Donleavy </h2>
            </div>
			<br>
			<br>
			<br>
			<br>
			<br>
			<br>
			<br>
			<br>
			<br>
			<br>
	</div>
    </body>

</html>

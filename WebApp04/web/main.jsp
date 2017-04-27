<%-- 
    Document   : main
    Created on : 07.11.2016, 13:23:54
    Author     : Alisher
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="Servlet.login;" %>
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
            <a href="Detail.jsp" style = "margin-left:950px; border: solid 1px; border-radius:7px; padding:3px; background-color:#ce831a; font-size: 16px; color: #ffee99;">
                My Purchase
            </a>
        </div>
        <div id = "main"> 
            
            <div id = "Book" > 
		<img src ="images/book1.jpg">
		<h2> Miguel de Cervantes </h2>
                <form action ="AddBook" method="Get">
                    <input type ="submit"  Value ="Buy" style= "width:100px;font-size:20px; color:white; margin-left: 60%;border-radius: 5px; background-color:#ce831a;">
                    <input type="hidden" name="id" value="1">
                </form>
            </div>
            <div id = "Book" > 
		<img src ="images/book.jpg">
		<h2> Lewis Carroll </h2>
                <form action ="AddBook" method="Get">
                    <input type ="submit"  Value ="Buy" style= "width:100px;font-size:20px; color:white; margin-left: 60%;border-radius: 5px; background-color:#ce831a;">
                    <input type="hidden" name="id" value="2">
                </form>
            </div>
            <div id = "Book" > 
		<img src ="images/book1.jpg">
		<h2> J. R. R. Tolkien </h2>
                <form action ="AddBook" method="Get">
                    <input type ="submit"  Value ="Buy" style= "width:100px;font-size:20px; color:white; margin-left: 60%;border-radius: 5px; background-color:#ce831a;">
                    <input type="hidden" name="id" value="3">
                </form>
            </div>
            <div id = "Book" > 
		<img src ="images/book.jpg">
		<h2> J.K. Rowling </h2>
                <form action ="AddBook" method="Get">
                    <input type ="submit"  Value ="Buy" style= "width:100px;font-size:20px; color:white; margin-left: 60%;border-radius: 5px; background-color:#ce831a;">
                    <input type="hidden" name="id" value="4">
                </form>
            </div>
            <div id = "Book" > 
		<img src ="images/book1.jpg">
		<h2> Richard Adams </h2>
                <form action ="AddBook" method="Get">
                    <input type ="submit"  Value ="Buy" style= "width:100px;font-size:20px; color:white; margin-left: 60%;border-radius: 5px; background-color:#ce831a;">
                    <input type="hidden" name="id" value="5">
                </form>
            </div>
            <div id = "Book" > 
		<img src ="images/book.jpg">
		<h2> Shere Hite </h2>
                <form action ="AddBook" method="Get">
                    <input type ="submit" Value ="Buy" style= "width:100px;font-size:20px; color:white; margin-left: 60%;border-radius: 5px; background-color:#ce831a;">
                    <input type="hidden" name="id" value="6">
                </form>
            </div>
            <div id = "Book" > 
		<img src ="images/book1.jpg">
		<h2> J. P. Donleavy </h2>
                <form action ="AddBook" method="Get">
                    <input type ="submit"  Value ="Buy" style= "width:100px;font-size:20px; color:white; margin-left: 60%;border-radius: 5px; background-color:#ce831a;">
                    <input type="hidden" name="id" value="7">
                </form>
            </div>

	</div>
    </body>
</html>

<%-- 
    Document   : login
    Created on : 23.01.2017, 3:28:16
    Author     : Alisher
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="login" method="POST"> 
            <input type="text" placeholder="Enter Login" name="log">
            <input type="password" placeholder="Enter Password" name="pw">
            <input type="submit" value="Submit">
        </form>
    </body>
</html>

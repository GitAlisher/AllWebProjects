<%-- 
    Document   : newjsp
    Created on : 21.10.2016, 0:19:01
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
        <%if (typeServlet.id % 2 == 0) { %>
            <h2 style="color:#7babf7"> <% out.println(typeServlet.First);%></h2>
        <%} else {%>
            <h3 style="color:#c1c4c9"> <% out.println(typeServlet.First);%></h3>
        <%}%>
        <%if (typeServlet.id % 2 == 1) { %>
            <h2 style="color:#7babf7"> <% out.println(typeServlet.Second);%></h2>
        <%} else {%>
            <h3 style="color:#c1c4c9"> <% out.println(typeServlet.Second);%></h3>
        <%}%> 
            <% for (int i = 0; i < typeServlet.SZ; i++) {
                    for (int j = 0; j < typeServlet.SZ; j++) { 
                        %>
                        <form action="game" method="GET" style="float:left">
                        <input type="hidden" name="id" value="<%=(i * typeServlet.SZ + j)%>">
                        <%
                        if (typeServlet.arr[i][j] == 0) {                          
                        %>
                            <input type="submit" value=" ">
                            
                        <%} else if (typeServlet.arr[i][j] == 1) {%>
                            <input type="submit" value="X">
                        <%} else if (typeServlet.arr[i][j] == 2) {%>
                            <input type="submit" value="O">
                        <%}%>
                        </form>
                    <%
                    }
                    out.println("<br> <br>");
                }
            %>                       
            
        
    </body>
</html>

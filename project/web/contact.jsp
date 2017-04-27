<%-- 
    Document   : contact
    Created on : 09.12.2016, 0:54:04
    Author     : Alisher
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="Servlet.AddBook" %>
<%@page import="Servlet.login" %>
<%@page import="Servlet.Validate" %>
<!DOCTYPE html>
<html>
    <head>
          <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="style.css" rel="stylesheet"/>
        <title>Contact Page</title>
    </head>
    <body>
        <div id ="logo">
            <h3 style = "margin-left:950px; margin-right: 30px; font-size: 20px; color: #ffee99; ">Welcome <%= session.getAttribute("session_name") %> </h3>
            <h3 style = "margin-left:950px; font-size: 20px; color: #ffee99; "> Your Cash : <%= session.getAttribute("session_cash") %> $ </h3>
  
            <h1>BookStore </h1>  
           
			<ul class="main-menu">
				<li><a href="main.jsp">Main Menu </a> </li>
				<li><a href="#">Prise list</a>
					<ul class="sub-menu">
						<li><a href="#1">Smth text</a> </li>
						<li><a href="#1">Smth text</a> </li>
						<li><a href="#1">Smth text</a> </li>
					</ul>
				</li>
				<li><a href="#">Catalog</a>
					<ul class="sub-menu">
						<li><a href="#1">Smth text</a> </li>
						<li><a href="#1">Smth text</a> </li>
						<li><a href="#1">Smth text</a> </li>
					</ul>
				</li>
                                <li><a href="Detail.jsp">My Purchase </a> </li>
				<li><a href="#">History</a> </li>
				<li><a href="contact.jsp" style="border-right:none;">Contact</a> </li>
				
			</ul>

        </div>
            <div id = "main" style="height:100%; z-index:-1;"> 
			
            <h1>Contact </h1>
				<div >
					<ul>
						<li><h3>Mobile phone : 87055556575</h3></li>
						<li><h3>Mobile phone : 87055556576</h3></li>
						<li><h3>E-mail : BookStore@gmail.com</h3></li>
						<li><h3>Fax : (615)-825 33 47 15</h3></li>
						<li><h3>In the FaceBook : FaceBook\BookStore.com </h3></li>
					</ul>
				</div>
			<br>
			<br>
			<br>
			<h1> BookStore On the Map </h1>
			<div id="map" style="width:600px;height:500px;background:#ffee99; border-radius:5px;"></div>

			<script>
				function myMap() {
					var mapCanvas = document.getElementById("map");
					var myCenter = new google.maps.LatLng(43.235182826845325, 76.90970957279205); 
					var mapOptions = {center: myCenter, zoom: 15};
					var map = new google.maps.Map(mapCanvas,mapOptions);
					var marker = new google.maps.Marker({
						position: myCenter,
						animation: google.maps.Animation.BOUNCE
					});
					marker.setMap(map);
				}
					
			</script>

			<script src="https://maps.googleapis.com/maps/api/js?key=AIzaSyCqoD_2nylK7WODBpvSIJPdv_VKUrG5jXM&callback=myMap"> </script>
			<br>
			<br>
			<br>
			<br>
			<br>
		</div>

    </body>
</html>

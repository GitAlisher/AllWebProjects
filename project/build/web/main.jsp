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
        <title>Main Page</title>
        	<script>
			// Get the modal
			var modal1 = document.getElementById('id01');
			var modal2 = document.getElementById('id02');
			var modal3 = document.getElementById('id03');
			var modal4 = document.getElementById('id04');
			var modal5 = document.getElementById('id05');
			var modal6 = document.getElementById('id06');
			var modal7 = document.getElementById('id07');
			// When the user clicks anywhere outside of the modal, close it
			window.onclick = function(event) {
				if (event.target == modal1) {
					modal1.style.display = "none";
				} else if (event.target == modal2) {
					modal2.style.display = "none";
				} else if (event.target == modal3) {
					modal3.style.display = "none";
				} else if (event.target == modal4) {
					modal4.style.display = "none";
				} else if (event.target == modal5) {
					modal5.style.display = "none";
				} else if (event.target == modal6) {
					modal6.style.display = "none";
				} else if (event.target == modal7) {
					modal7.style.display = "none";
				}
			}
		</script>
                <style>
			/* Full-width input fields */
			input[type=text], input[type=password] {
				width: 100%;
				padding: 12px 20px;
				margin: 8px 0;
				display: inline-block;
				border: 1px solid #ccc;
				box-sizing: border-box;
			}


			/* Extra styles for the cancel button */
			.cancelbtn {
				width: auto;
				padding: 10px 18px;
				background-color: #f44336;
			}

			/* Center the image and position the close button */
			.imgcontainer {
				text-align: center;
				position: relative;
			}

			img.avatar {
				width: 300px;
				height: 256px;
				border-radius: 5px;
			}

			.container {
				padding: 0px;
			}

			span.psw {
				float: right;
				padding-top: 16px;
			}

			/* The Modal (background) */
			.modal {
				display: none; /* Hidden by default */
				position: fixed; /* Stay in place */
				z-index: 1; /* Sit on top */
				left: 400px;
				top: 50px;
				width: 700px; /* Full width */
				height: 500px; /* Full height */
				overflow: auto; /* Enable scroll if needed */
				background-color: rgb(0,0,0); /* Fallback color */
				background-color: rgba(0,0,0,0.4); /* Black w/ opacity */
				padding-top: 10px;
			}

			/* Modal Content/Box */
			.modal-content {
				background-color: #fefefe;
				margin: 5% auto 15% auto; /* 5% from the top, 15% from the bottom and centered */
				border: 1px solid #888;
				width: 80%; /* Could be more or less, depending on screen size */
			}

			/* The Close Button (x) */
			.close {
				position: absolute;
				right: 25px;
				top: 0;
				color: #000;
				font-size: 35px;
				font-weight: bold;
			}

			.close:hover,
			.close:focus {
				color: red;
				cursor: pointer;
			}

			/* Add Zoom Animation */
			.animate {
				-webkit-animation: animatezoom 0.6s;
				animation: animatezoom 0.6s
			}

			@-webkit-keyframes animatezoom {
				from {-webkit-transform: scale(0)} 
				to {-webkit-transform: scale(1)}
			}
				
			@keyframes animatezoom {
				from {transform: scale(0)} 
				to {transform: scale(1)}
			}

			/* Change styles for span and cancel button on extra small screens */
			@media screen and (max-width: 300px) {
				span.psw {
				   display: block;
				   float: none;
				}
				.cancelbtn {
				   width: 100%;
				}
			}
		</style>
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
        <div id = "main" style="height:100%"> 
            
            <div id = "Book" > 
			<img src ="images/01.jpg" style="width:256px; height:256px;">
				<h2> Miguel de Cervantes </h2>
                <form action ="AddBook" method="Get">
                    <input type ="submit"  Value ="Buy" style= "width:100px;font-size:20px; color:white; margin-left: 60%;border-radius: 5px; background-color:#ce831a;">
                    <input type="hidden" name="id" value="1">
                </form>
                <button onclick="document.getElementById('id01').style.display='block'" style="width:100px;font-size:20px; color:white; margin-left: 60%;border-radius: 5px; background-color:#ce831a;"> Detail </button>

				<div id="id01" class="modal">
					<div class="imgcontainer">
						<span onclick="document.getElementById('id01').style.display='none'" class="close" title="Close Modal">&times;</span>
						<img src="images/001.jpg" alt="Avatar" class="avatar">
					</div>
					
					<div style="padding:20px;margin-left: 100px; margin-top: 20px; margin-right: 100px; border: solid 1px; border-radius: 7px; color:#ffee99;">
						<br>Author Miguel de Cervantes
						<br> Name of Book Don Quixote
						<br> Original language Spanish
						<br>Approximate Sales 500 millions 
						<br>
						<br>
					</div>
				</div>
				
            </div>
            <div id = "Book" > 
                <img src ="images/02.jpg" style="width:256px; height:256px;">
                    <h2> Lewis Carroll </h2>
                <form action ="AddBook" method="Get">
                    <input type ="submit"  Value ="Buy" style= "width:100px;font-size:20px; color:white; margin-left: 60%;border-radius: 5px; background-color:#ce831a;">
                    <input type="hidden" name="id" value="2">
                </form>            
				<button onclick="document.getElementById('id02').style.display='block'" style="width:100px;font-size:20px; color:white; margin-left: 60%;border-radius: 5px; background-color:#ce831a;"> Detail </button>

				<div id="id02" class="modal">
					<div class="imgcontainer">
						<span onclick="document.getElementById('id02').style.display='none'" class="close" title="Close Modal">&times;</span>
						<img src="images/002.jpg" alt="Avatar" class="avatar">
					</div>
					
					<div style="padding:20px;margin-left: 100px; margin-top: 20px; margin-right: 100px; border: solid 1px; border-radius: 7px; color:#ffee99;">
						<br>Author Lewis Carroll
						<br> Name of Book Alice in Wonderland
						<br> Original language English
						<br>Approximate Sales 100 million
						<br>
						<br>
					</div>
				</div>
            </div>
            <div id = "Book" > 
                <img src ="images/03.jpg" style="width:256px; height:256px;">
                <h2> J. R. R. Tolkien </h2>
                <form action ="AddBook" method="Get">
                    <input type ="submit"  Value ="Buy" style= "width:100px;font-size:20px; color:white; margin-left: 60%;border-radius: 5px; background-color:#ce831a;">
                    <input type="hidden" name="id" value="3">
                </form>
                <button onclick="document.getElementById('id03').style.display='block'" style="width:100px;font-size:20px; color:white; margin-left: 60%;border-radius: 5px; background-color:#ce831a;"> Detail </button>

				<div id="id03" class="modal">
					<div class="imgcontainer">
						<span onclick="document.getElementById('id03').style.display='none'" class="close" title="Close Modal">&times;</span>
						<img src="images/003.jpg" alt="Avatar" class="avatar">
					</div>
					
					<div style="padding:20px;margin-left: 100px; margin-top: 20px; margin-right: 100px; border: solid 1px; border-radius: 7px; color:#ffee99;">
						<br> Author J. R. R. Tolkien
						<br> Name of Book The Hobbit
						<br> Original language English
						<br>Approximate Sales 100 million
						<br>
						<br>
					</div>
				</div>
            </div>
            <div id = "Book" > 
                <img src ="images/04.jpg" style="width:256px; height:256px;">
                <h2> J.K. Rowling </h2>
                <form action ="AddBook" method="Get">
                    <input type ="submit"  Value ="Buy" style= "width:100px;font-size:20px; color:white; margin-left: 60%;border-radius: 5px; background-color:#ce831a;">
                    <input type="hidden" name="id" value="4">
                </form>
                <button onclick="document.getElementById('id04').style.display='block'" style="width:100px;font-size:20px; color:white; margin-left: 60%;border-radius: 5px; background-color:#ce831a;"> Detail </button>

				<div id="id04" class="modal">
					<div class="imgcontainer">
						<span onclick="document.getElementById('id04').style.display='none'" class="close" title="Close Modal">&times;</span>
						<img src="images/004.jpg" alt="Avatar" class="avatar">
					</div>
					
					<div style="padding:20px;margin-left: 100px; margin-top: 20px; margin-right: 100px; border: solid 1px; border-radius: 7px; color:#ffee99;">
						<br> Author J.K. Rowling
						<br> Name of Book Harry Potter 
						<br> Original language English
						<br>Approximate Sales 300 million
						<br>
						<br>
					</div>
				</div>
            </div>
            <div id = "Book" > 
                <img src ="images/05.png" style="width:256px; height:256px;">
                <h2> Richard Adams </h2>
                <form action ="AddBook" method="Get">
                    <input type ="submit"  Value ="Buy" style= "width:100px;font-size:20px; color:white; margin-left: 60%;border-radius: 5px; background-color:#ce831a;">
                    <input type="hidden" name="id" value="5">
                </form>
                <button onclick="document.getElementById('id05').style.display='block'" style="width:100px;font-size:20px; color:white; margin-left: 60%;border-radius: 5px; background-color:#ce831a;"> Detail </button>

				<div id="id05" class="modal">
					<div class="imgcontainer">
						<span onclick="document.getElementById('id05').style.display='none'" class="close" title="Close Modal">&times;</span>
						<img src="images/005.jpg" alt="Avatar" class="avatar">
					</div>
					
					<div style="padding:20px;margin-left: 100px; margin-top: 20px; margin-right: 100px; border: solid 1px; border-radius: 7px; color:#ffee99;">
						<br> Author Richard Adams
						<br> Name of Book Watership Down
						<br> Original language English
						<br>Approximate Sales 500 million
						<br>
						<br>
					</div>
				</div>            
			</div>
            <div id = "Book" > 
                <img src ="images/book1.jpg" style="width:256px; height:256px;">
                <h2> Shere Hite </h2>
                <form action ="AddBook" method="Get">
                    <input type ="submit"  Value ="Buy" style= "width:100px;font-size:20px; color:white; margin-left: 60%;border-radius: 5px; background-color:#ce831a;">
                    <input type="hidden" name="id" value="6">
                </form>
				<button onclick="document.getElementById('id06').style.display='block'" style="width:100px;font-size:20px; color:white; margin-left: 60%;border-radius: 5px; background-color:#ce831a;"> Detail </button>

				<div id="id06" class="modal">
					<div class="imgcontainer">
						<span onclick="document.getElementById('id06').style.display='none'" class="close" title="Close Modal">&times;</span>
						<img src="images/book.jpg" alt="Avatar" class="avatar">
					</div>
					
					<div style="padding:20px;margin-left: 100px; margin-top: 20px; margin-right: 100px; border: solid 1px; border-radius: 7px; color:#ffee99;">
						<br> Author Shere Hite
						<br> Name of Book The Hite Report
						<br> Original language English
						<br>Approximate Sales 700 million
						<br>
						<br>
					</div>
				</div>  
            </div>
            <div id = "Book" > 
                <img src ="images/07.jpg" style="width:256px; height:256px;">
                <h2> J. P. Donleavy </h2>
                <form action ="AddBook" method="Get">
                    <input type ="submit"  Value ="Buy" style= "width:100px;font-size:20px; color:white; margin-left: 60%;border-radius: 5px; background-color:#ce831a;">
                    <input type="hidden" name="id" value="7">
                </form>
                <button onclick="document.getElementById('id07').style.display='block'" style="width:100px;font-size:20px; color:white; margin-left: 60%;border-radius: 5px; background-color:#ce831a;"> Detail </button>

				<div id="id07" class="modal">
					<div class="imgcontainer">
						<span onclick="document.getElementById('id07').style.display='none'" class="close" title="Close Modal">&times;</span>
						<img src="images/007.png" alt="Avatar" class="avatar">
					</div>
					
					<div style="padding:20px;margin-left: 100px; margin-top: 20px; margin-right: 100px; border: solid 1px; border-radius: 7px; color:#ffee99;">
						<br> Author J. P. Donleavy
						<br> Name of Book The Ginger Man
						<br> Original language English
						<br>Approximate Sales 300 million
						<br>
						<br>
					</div>
				</div>  
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

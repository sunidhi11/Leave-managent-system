<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@page 
	import="java.util.*" 
	import="java.sql.*"
	import="sis.com.*"
	import="sis.com.controller.*" 
	import="sis.com.dao.*"
	import="sis.com.dao.impl.*"
	import="sis.com.daoFactory.*"
	import="sis.com.util.*"
	import="sis.com.bo.*"
	 
%>    

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<meta http-equiv='Content-Type' content='text/html; charset=UTF-8' />
	<meta name="author" content="Seema Dewangan">
	<meta name="author" content="Sunidhi Garg">
	<meta name="author" content="Monika Jaiswal">
	<meta name="author" content="Shaurya Manhar">
	<meta name="description" content="Hostel Management System for institute based on J2EE">
	<meta name="keywords" content="hostel,system,management,java,j2ee,girl hostel,boys hostel,attendance,leave">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
	<link href="https://fonts.googleapis.com/css?family=Abel|Anton|Exo+2|Josefin+Sans|Noto+Sans|Open+Sans|PT+Sans" rel="stylesheet"> 
	<link href="https://fonts.googleapis.com/css?family=Roboto" rel="stylesheet"> 
	<link rel="stylesheet" href="css/main.css">
</head>
<style>
.nav-sg li{
	display: inline;
}
</style>
<body data-spy="scroll" data-target=".navbar" data-offset="150">
				<div class="container" style="position: relative;font-family: Arial;width:100%;">
					<img src="images//ii.png" alt="Nature" style="width:100%;-webkit-filter: blur(2px); filter: blur(5px);">
						<div class="container text-block">
							<div class="logo col-md-8" style="float:left;margin:10	px 0px;">
								<img class="img-responsive" src="images//nitrr.gif" style="float: left;width:150pxl;height:138px;padding:2px;margin: 2px;">
									<h2> National Institute of Technology, Raipur</h2>
									<!-- <h2>à¤°à¤¾à¤·à¥à¤à¥à¤°à¥à¤¯ à¤ªà¥à¤°à¥à¤¦à¥à¤¯à¥à¤à¤¿à¤à¥ à¤¸à¤à¤¸à¥à¤¥à¤¾à¤¨, à¤°à¤¾à¤¯à¤ªà¥à¤° </h2> -->
									<!-- <h2>à¤°à¤¾à¤·à¥à¤à¥à¤°à¥à¤¯ à¤ªà¥à¤°à¥à¤¦à¥à¤¯à¥à¤à¤¿à¤à¥ à¤¸à¤à¤¸à¥à¤¥à¤¾à¤¨ à¤°à¤¾à¤¯à¤ªà¥à¤°</h2> -->
									<h2>  
									राष्ट्रीय प्रौद्योगिकी संस्थान ,रायपुर
									</h2>
								</div>
							</div>
						</div>
						<nav class="navbar navbar-default nav-sm " data-spy="affix" data-offset-top="200">
							<div class="container-fluid">
								<!-- Brand and toggle get grouped for better mobile display -->
								<div class="navbar-header">
									<button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
										<span class="sr-only">Toggle navigation</span>
										<span class="icon-bar"></span>
										<span class="icon-bar"></span>
										<span class="icon-bar"></span>
									</button>
								</div>
								<!-- Collect the nav links, forms, and other content for toggling -->
								<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
									<ul class="nav navbar-nav">
										<li class="active">
											<a href="Home.jsp">
												<span class="glyphicon glyphicon-home">&nbsp;HOME 
												<span class="sr-only">(current)</span>
											</a>
										</li>
										<li>
											<a href="stuform1.jsp">
												<span class="glyphicon glyphicon-user">&nbsp;REGISTER
											</a>
										</li>
										<!-- <li>
										 <a href="review.jsp">REVIEWS</a>
											
										</li> -->
										
										<li>
											<a href="contact.jsp"><span class="glyphicon glyphicon-user"></span>&nbsp;CONTACT</a>
										</li>
										<li>
											<a href="map.jsp"><span class="glyphicon glyphicon-globe"></span>&nbsp;MAP</a>
										</li>
									</ul>
						<%
						Boolean studentLoginCheck=false;
						Boolean adminLogin=false;
						Boolean parentLoginCheck=false;

						if(session.getAttribute("studentLoginCheck")!=null){
							studentLoginCheck=(Boolean)session.getAttribute("studentLoginCheck");
						}//if
						if(session.getAttribute("adminLogin")!=null){
							adminLogin=(Boolean)session.getAttribute("adminLogin");
						}//if
						if(session.getAttribute("parentLoginCheck")!=null){
							parentLoginCheck=(Boolean)session.getAttribute("parentLoginCheck");
						}
						if(studentLoginCheck==false&&adminLogin==false&&parentLoginCheck==false){
						%>
						<ul class="nav navbar-nav navbar-right">
							<!-- <li><a href="#">Link</a></li> -->
							<li class="dropdown">
								<a href="" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">LOG IN<span class="caret"></span></a>
								<ul class="dropdown-menu" style="color:white;">
									<li>
										<a href="studentLogin.jsp">STUDENT</a>
									</li>
									<li>
										<a href="parent_login.jsp">PARENT</a>
									</li>
									<li role="separator" class="divider"></li>
									<li>
										<a href="admin_login.jsp">FACULTY</a>
									</li>
								</ul>
							</li>
						</ul>
						<%}//if
						else{%>
						<ul class="nav navbar-nav navbar-right">
							<!-- <li><a href="#">Link</a></li> -->
							<li class="dropdown">
								<a href="" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false"><span class="glyphicon glyphicon-log-out"></span></a>
								<ul class="dropdown-menu" style="color:white;">
									<li><%if(studentLoginCheck==true){%>
										<a href="LogOutController?admin=0&student=1&parent=0">Log Out</a>
										<%}if(adminLogin==true){%>
										<a href="LogOutController?admin=1&student=0&parent=0">Log Out</a>
										<%}else{%>
										<a href="LogOutController?admin=0&student=0&parent=1">Log Out</a>
										<%}%>
							</li>
						</ul>
						<%-- <ul class="nav navbar-nav navbar-right nav-sg" style="">
						<span style="font-size: 16px;color:#0340ed;">
							<li>HostelId: <%=session.getAttribute("hostelId") %></li>
							<br>
							<li>Name: <%=session.getAttribute("studentName") %></li>
						</span>
							<li><%=session.getAttribute("hostel") %></li>
						</ul> --%>
						<%} %>
					</div>
					<!-- /.navbar-collapse -->
				</div>
				<!-- /.container-fluid -->
			</nav>


<!-- START CONTAINER FROM HERE -->
<!-- ADD TITLE ON YOUR PAGE -->

<%-- USE <jsp:include page="header.jsp" /> --%>


<!-- CONTAINER START -->
<!-- <div class="container container-sm border" style=""> -->
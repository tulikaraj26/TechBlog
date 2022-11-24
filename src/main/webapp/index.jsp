<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@page import="java.sql.*,com.tech.helper.ConnectionProvider"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSP Page</title>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">

<link href="CSS/style.css" rel="stylesheet" type="text/css" />
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">

<style>
.banner-background {
	clip-path: polygon(30% 0%, 70% 0%, 100% 0, 100% 91%, 67% 100%, 28% 92%, 0 100%, 0 0);
}
</style>

</head>
<body>
	<!-- navbar -->

	<%@include file="normal_navbar.jsp"%>

	<!-- banner -->

	<div class="container-fluid p-0 m-0 ">

		<div class="jumbotron  primary-background text-white banner-background">
			<div class="container">
				<h3 class="display-3">Welcome to TechBlog</h3>
				<p>Welcome to technical blog, world of technology A programming
					language is a system of notation for writing computer programs Most
					programming languages are text-based formal languages</p>

				<p>There are three types of programming languages: machine
					language, assembly language, and high-level language. Machine
					language is easier for the computer to understand but harder for
					the programmer to understand.</p>

				<button class="btn btn-outline-light btn-lg">
					<span class="fa fa-user-plus"></span> Start ! its Free
				</button>
				<a href="login_page.jsp"  class="btn btn-outline-light btn-lg">
					<span class="fa fa-user-circle fa-spin"></span> Login
				</a>
			</div>

		</div>
	</div>

	<!-- -cards -->

	<div class="container">

		<div class="row mb-2">

			<div class="col-md-4">
				<!--1st col  -->
				<div class="card">
					<div class="card-body">
						<h5 class="card-title">Java Programming</h5>
						<p class="card-text">Java is a popular programming language.
							Java is used to develop mobile apps, web apps, desktop apps,
							games and much more.</p>
						<a href="#" class="btn btn-primary primary-background text-white">Read
							More</a>
					</div>
				</div>
			</div>

			<div class="col-md-4">
				<!--2nd col  -->
				<div class="card">
					<div class="card-body">
						<h5 class="card-title">Java Programming</h5>
						<p class="card-text">Java is a popular programming language.
							Java is used to develop mobile apps, web apps, desktop apps,
							games and much more.</p>
						<a href="#" class="btn btn-primary primary-background text-white">Read
							More</a>
					</div>
				</div>
			</div>

			<div class="col-md-4">
				<!--3rd col  -->
				<div class="card">
					<div class="card-body">
						<h5 class="card-title">Java Programming</h5>
						<p class="card-text">Java is a popular programming language.
							Java is used to develop mobile apps, web apps, desktop apps,
							games and much more.</p>
						<a href="#" class="btn btn-primary primary-background text-white">Read
							More</a>
					</div>
				</div>
			</div>

		</div>

		<div class="row">

			<div class="col-md-4">
				<!--1st col  -->
				<div class="card">
					<div class="card-body">
						<h5 class="card-title">Java Programming</h5>
						<p class="card-text">Java is a popular programming language.
							Java is used to develop mobile apps, web apps, desktop apps,
							games and much more.</p>
						<a href="#" class="btn btn-primary primary-background text-white">Read
							More</a>
					</div>
				</div>
			</div>

			<div class="col-md-4">
				<!--2nd col  -->
				<div class="card">
					<div class="card-body">
						<h5 class="card-title">Java Programming</h5>
						<p class="card-text">Java is a popular programming language.
							Java is used to develop mobile apps, web apps, desktop apps,
							games and much more.</p>
						<a href="#" class="btn btn-primary primary-background text-white">Read
							More</a>
					</div>
				</div>
			</div>

			<div class="col-md-4">
				<!--3rd col  -->
				<div class="card">
					<div class="card-body">
						<h5 class="card-title">Java Programming</h5>
						<p class="card-text">Java is a popular programming language.
							Java is used to develop mobile apps, web apps, desktop apps,
							games and much more.</p>
						<a href="#" class="btn btn-primary primary-background text-white">Read
							More</a>
					</div>
				</div>
			</div>
		</div>

	</div>



	<!-- -javascript- -->

	<script src="https://code.jquery.com/jquery-3.6.1.min.js"
		integrity="sha256-o88AwQnZB+VDvE9tvIXrMQaPlFFSUTR+nldQm1LuPXQ="
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js"
		integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js"
		integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
		crossorigin="anonymous"></script>

	<script src="js/myjs.js" type="text/javascript"></script>

</body>
</html>
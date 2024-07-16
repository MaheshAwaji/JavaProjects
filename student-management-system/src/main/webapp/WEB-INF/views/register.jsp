<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false"%>
<!doctype html>
<html lang="en">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">

<!-- Bootstrap CSS -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">

<title>Form</title>
</head>
<body>

	<div class="container mt-5">
		<div class="text-center">
			<h1>${Header}</h1>
			<p>${desc}</p>
		</div>
		<form action="register" method="post">
			<div class="mb-3 ">
				<label for="exampleInputEmail1" class="form-label">Roll
					Number</label> <input type="text" class="form-control"
					id="exampleInputEmail1" aria-describedby="emailHelp"
					name="rollnumber" placeholder="Enter Roll Number ">
			</div>
			<div>
				<label for="exampleInputEmail1" class="form-label">Email
					address</label> <input type="email" class="form-control"
					id="exampleInputEmail1" aria-describedby="emailHelp" name="email"
					placeholder="Enter email ">
			</div>
			<div class="mb-3">
				<label for="username" class="form-label">Age</label> <input
					type="text" class="form-control" id="age"
					aria-describedby="userHelp" name="age" placeholder="Enter age">
			</div>
			<div class="mb-3">
				<label for="username" class="form-label">Username</label> <input
					type="text" class="form-control" id="username"
					aria-describedby="userHelp" name="username" placeholder="username">
			</div>

			<div class="mb-3">
				<label for="password" class="form-label">Password</label> <input
					type="password" class="form-control" id="password" name="password"
					placeholder="Enter password">
			</div>

			<div class="text-center">
				<button type="submit" class="btn btn-primary">Register</button>
			</div>
		</form>

	</div>
</body>
</html>
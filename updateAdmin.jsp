<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="UTF-8">
<title>Update Your Details</title>

<link
	href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	rel="stylesheet" id="bootstrap-css">
<script
	src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
<script
	src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<link rel="stylesheet" type="text/css" href="styles/bootstrap.min.css">

</head>
<body>
	<nav class="navbar navbar-expand-lg navbar-dark bg-primary"
		style="margin-bottom:90px;"> <a class="navbar-brand" href="#">Vehicle
		Reservation System</a>
	<button class="navbar-toggler" type="button" data-toggle="collapse"
		data-target="#navbarColor01" aria-controls="navbarColor01"
		aria-expanded="false" aria-label="Toggle navigation">
		<span class="navbar-toggler-icon"></span>
	</button>
	<div class="collapse navbar-collapse" id="navbarColor01">
		<ul class="navbar-nav mr-auto">
			<li class="nav-item"><a class="nav-link" href="home.jsp">Home</a></li>
			<li class="nav-item"><a class="nav-link" href="create.jsp">Create</a></li>
			<li class="nav-item"><a class="nav-link" href="search.jsp">Search</a></li>
			<li class="nav-item"><a class="nav-link" href="updateVehicle.jsp">Update</a></li>
		</ul>
	</div>
	<form action="#">
		<button type="submit" class="btn btn-outline-secondary">Logout</button>
	</form>
	</nav>
	<div class="container">

		<h2>Update Your Details</h2>
		<form action="/editEmployee" class="needs-validation" novalidate>
			<div class="form-group">
				<label for="uname">Employee Id:</label> <input type="text"
					maxlength="6" class="form-control" id="eno" placeholder="Your Id"
					name="eno" required>
			</div>
			<div class="form-group">
				<label for="uname">First Name:</label> <input type="text"
					class="form-control" id="fname" placeholder="Your first name"
					name="fname" required>
			</div>
			<div class="form-group">
				<label for="uname">Last Name:</label> <input type="text"
					class="form-control" id="lname" placeholder="Your last name"
					name="lname" required>
			</div>
			<div class="form-group">
				<label for="uname">Age:</label> <input type="text"
					class="form-control" id="age" placeholder="Your Age" name="age"
					required>
				<div class="valid-feedback"></div>
				<div class="invalid-feedback">Please fill out this field.</div>
			</div>
			<div class="form-group">
				<label for="uname">Gender:</label> <input type="text"
					class="form-control" id="gen" placeholder="Your Gender" name="gen"
					required>
			</div>
			<div class="form-group">
				<label for="uname">Contact Number:</label> <input type="text"
					class="form-control" id="con" placeholder="Your Contact Number"
					name="con" required>
				<div class="valid-feedback"></div>
				<div class="invalid-feedback">Please fill out this field.</div>
			</div>
			<div class="form-group">
				<label for="uname">Email Id:</label> <input type="text"
					class="form-control" id="eml" placeholder="Your Email Id"
					name="eml" required>
				<div class="valid-feedback"></div>
				<div class="invalid-feedback">Please fill out this field.</div>
			</div>
			<div class="form-group">
				<label for="uname">Password:</label> <input type="text"
					class="form-control" id="pwd" placeholder="Your Password"
					name="pwd" required>
				<div class="valid-feedback"></div>
				<div class="invalid-feedback">Please fill out this field.</div>
			</div>
			<div class="form-group">
				<label for="uname">Branch:</label> <input type="text"
					class="form-control" id="branch" placeholder="Enter Branch"
					name="branch" required>
				<div class="valid-feedback"></div>
				<div class="invalid-feedback">Please fill out this field.</div>
			</div>
			<button type="submit" class="btn btn-primary">Update</button>
		</form>
	</div>

	<script>
		// Disable form submissions if there are invalid fields
		(function() {
			'use strict';
			window.addEventListener('load',
					function() {
						// Get the forms we want to add validation styles to
						var forms = document
								.getElementsByClassName('needs-validation');
						// Loop over them and prevent submission
						var validation = Array.prototype.filter.call(forms,
								function(form) {
									form.addEventListener('submit', function(
											event) {
										if (form.checkValidity() === false) {
											event.preventDefault();
											event.stopPropagation();
										}
										form.classList.add('was-validated');
									}, false);
								});
					}, false);
		})();
	</script>

</body>
</html>
​

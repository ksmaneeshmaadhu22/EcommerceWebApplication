<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Register</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
<link rel="stylesheet" type="text/css" href="styles.css">
</head>
<body style="background-color: #ffd919">
	<nav class="navbar navbar-light" style="background-color: #0081e9">
		<div class="container-fluid">
			<span class="navbar-brand mb-0 h1" style="height: 10vh"></span>
		</div>
	</nav>

	<form action="register" method="post">
		<br>
		<div class="d-flex flex-column">
			<div style="margin-left: 17%; margin-top: 1%">
				<h1>Create Account</h1>
			</div>
			<br> 
			<div class="mb-4 row w-50 align-self-center">
				<label for="uname" class="col-sm-2 col-form-label">Username</label>
				<div class="col-sm-10 align-self-center">
					<input type="text" class="form-control" id="uname" required name="username">
				</div>
			</div>
			<div class="mb-4 row w-50 align-self-center">
				<label for="name" class="col-sm-2 col-form-label">Name</label>
				<div class="col-sm-10 align-self-center">
					<input type="text" class="form-control" id="name" required name="name">
				</div>
			</div>
			<div class="mb-4 row w-50 align-self-center">
				<label for="email" class="col-sm-2 col-form-label">Email</label>
				<div class="col-sm-10 align-self-center">
					<input type="text" class="form-control" id="email" required name="emailid">
				</div> 
			</div>
			<div class="mb-4 row w-50 align-self-center">
				<label for="password" class="col-sm-2 col-form-label">Password</label>
				<div class="col-sm-10 align-self-center">
					<input type="password" class="form-control" id="password" required name="password">
				</div>
			</div>
			<div class="mb-4 row w-50 align-self-center">
				<label for="mobile" class="col-sm-2 col-form-label">Mobile</label>
				<div class="col-sm-10 align-self-center">
					<input type="text" class="form-control" id="mobile" name="mobilenumber">
				</div>
			</div>
			<div class="mb-4 row w-50 align-self-center">
				<label for="addr" class="col-sm-2 col-form-label">Address</label>
				<div class="col-sm-10 align-self-center">
				<textarea class="form-control" id="addr" rows="3" required name="address"></textarea>
				</div>
			</div>
			<div class="mb-3 mt-3 w-50 row align-self-center">
				<button type="submit" class="btn btn-primary col-sm-2"
					style="width: 10vw; margin-left: 28%">Register</button>
				<div class="col-sm-10" style="width: 40%;">
					<a href="login" style="float:right">Already Registered? Login</a>
				</div>
			</div>
		</div>
	</form>

</body>
</html>
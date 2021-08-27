<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login</title>
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
	<form action="login" method="post">
	<div class="row w-100">
	<h1 class="col" style="display:flex; align-items:center; justify-content: center;">STAY HOME & SHOP ONLINE</h1>
	<div class="col" style="margin-top: 5%; width:35%;">
	<fieldset class="border border-dark border-4 p-2 ">
		<br>
		<div class="d-flex flex-column">
			<div style="margin-left: 12%; margin-top: 1%">
				<h1>Login</h1>
				<h6 style="color: red; margin-left: 30%">${message}</h3>
			</div>
			<div class="mb-4 row w-50 align-self-center">
				<label for="uname" class="col-sm-2 col-form-label">Username</label>
				<div class="col-sm align-self-center" style="margin-left: 10%;">
					<input type="text" style="width:100%" class="form-control" id="uname" required name="username">
				</div>
				
			</div>
			<div class="mb-4 row w-50 align-self-center">
				<label for="password" class="col-sm-2 col-form-label">Password</label>
				<div class="col-sm align-self-center" style="margin-left: 10%;">
					<input type="password" style="width:100%" class="form-control" required id="password"
						name="password">
				</div>
			</div>
			<div class="mb-3 mt-3 w-50 row align-self-center">
				<button type="submit" class="btn btn-primary col-sm-2"
					style="width: 7vw; margin-left: 1%">Login</button>
				<div class="col-sm-10" style="width: 60%;">
					<a href="register">Don't have account? Create here</a>
				</div>
			</div>
		</div>
		</fieldset>
		</div>
		</div>
	</form>

</body>
</html>
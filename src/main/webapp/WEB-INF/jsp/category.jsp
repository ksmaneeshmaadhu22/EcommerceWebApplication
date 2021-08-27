<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Categories</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
<link rel="stylesheet" type="text/css" href="styles.css">
</head>
<body style="background-color: #ffd919">
	<nav class="navbar navbar-expand-lg navbar-light"
		style="background-color: #0081e9;">
		<div class="d-flex justify-content-end" id="navbarSupportedContent"
			style="margin-left: 75%">
			<ul class="navbar-nav ">
				<li class="nav-item"><a class="nav-link active" href="/">Contact</a></li>
				<li class="nav-item"><a class="nav-link active" href="/login">Logout</a></li>
			</ul>
		</div>
		<div class="container-fluid">
			<span class="navbar-brand mb-0 h1" style="height: 10vh"></span>
		</div>
	</nav>


	<br>
	<div class="d-flex flex-column">
		<div style="margin-left: 17%; margin-top: 1%">
			<h1>Categories</h1>
		</div>
		<br>
		<ul class="mb-3"
			style="margin-left: 18%; font-size: 20px; font-weight: bold; font-style: italic">
			<li style="margin-bottom: 1%"><a href="/mobile">${category[0].getCategoryName()}</a></li>
			<li style="margin-bottom: 1%"><a href="/laptop">${category[1].getCategoryName()}</a></li>
			<li style="margin-bottom: 1%"><a href="/furniture">${category[2].getCategoryName()}</a></li>
			<li style="margin-bottom: 1%"><a href="/ac">${category[3].getCategoryName()}</a></li>
			<li style="margin-bottom: 1%"><a href="/toys">${category[4].getCategoryName()}</a></li>
		</ul>
	</div>
</body>
</html>

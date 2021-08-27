<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Toys</title>
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
				<li class="nav-item"><a class="nav-link active"
					href="/category">Categories</a></li>
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
			<h1>TOYS</h1>
		</div>
		<div style="margin-left: 10%;">
			<fieldset class="border border-dark border-5 p-2 m-4 w-75">
				<div class="row">
					<div
						class="col d-flex justify-content-start flex-column align-items-center">
						<div class="mt-3">
							<img
								src="https://rukminim1.flixcart.com/image/416/416/kn0n6a80/remote-control-toy/h/k/j/4-channel-mini-racing-rc-car-miss-chief-original-imagfs82s9kh9x9k.jpeg?q=70"
								style="width: 15vw; height: 25vh">
						</div>
					</div>
					<div class="col align-self-center">
						<div class="mt-2">
							<h4>${product[0].getProductName()}</h4>
						</div>
						<div>
							<h1>₹${product[0].getPrice()}</h1>
						</div>

						<p>${product[0].getProductDesc()}</p>
					</div>
					<div class="col align-self-center">
						<form action="success">
							<input type="hidden" name="name"
								value=${product[0].getProductName()}> <input
								type="hidden" name="price" value=${product[0].getPrice()}>
							<button type="submit" class="btn btn-primary btn-lg"
								style="margin-left: 40%">Buy Now</button>
						</form>

					</div>
				</div>
			</fieldset>
		</div>

	</div>
	<div style="margin-left: 10%;">
		<fieldset class="border border-dark border-5 p-2 m-4 w-75">
			<div class="row">
				<div
					class="col d-flex justify-content-start flex-column align-items-center">
					<div class="mt-3">
						<img
							src="https://rukminim1.flixcart.com/image/416/416/kqse07k0/outdoor-toy/m/9/m/play-tent-house-for-kids-in-school-theme-miss-chief-original-imag4pv8d8hvwwdf.jpeg?q=70"
							style="width: 15vw; height: 25vh">
					</div>
				</div>
				<div class="col align-self-center">
					<div class="mt-2">
						<h4>${product[1].getProductName()}</h4>
					</div>
					<div>
						<h1>₹${product[1].getPrice()}</h1>
					</div>
					<p>${product[1].getProductDesc()}</p>
				</div>
				<div class="col align-self-center">
					<form action="success">
						<input type="hidden" name="name"
							value=${product[1].getProductName()}> <input
							type="hidden" name="price" value=${product[1].getPrice()}>
						<button type="submit" class="btn btn-primary btn-lg"
							style="margin-left: 40%">Buy Now</button>
					</form>
				</div>
			</div>
		</fieldset>
	</div>
	</div>
</body>
</html>

<html>
<head>
<title>Filter Page</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css"
	integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk"
	crossorigin="anonymous">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/css/style.css" />

</head>

<body>

	<div class="container">
		<div class="header">
			<label class="text">Get Your Perfect Bike or Car at
				affordable Price</label>
		</div>

		<div class="filter-container">
			<form method="POST" action="${pageContext.request.contextPath}/page">
				<select class="filter-search-box" name="states" required>
					<option value="all">All States</option>
					<option value="Delhi">Delhi</option>
					<option value="Hyd">HyderaBad</option>
					<option value="Mumbai">Mumbai</option>
				</select> <select class="filter-search-box" name="vehicle" required>
					<option value="">Select Vehicles</option>
					<option value="Car">Car</option>
					<option value="Bike">Bike</option>
				</select> <input type="submit" value="Search" />
			</form>
		</div>
		<div class="footer">
			<p>
				Designed By <a href="https://www.github.com/khatri09">Ankit
					Khatri</a>
			</p>
			<p>Copyright khatri@2020-09</p>
		</div>

	</div>

</body>

</html>
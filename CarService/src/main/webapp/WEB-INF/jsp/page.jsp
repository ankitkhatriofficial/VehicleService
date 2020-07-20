<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>Filtered Page</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css"
	integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk"
	crossorigin="anonymous">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/css/style2.css" />
</head>

<body>

	<div class="container">

		<div class="header">
			<form action="/page" method="POST">
				<select class="filter-search-box" name="states" required>
					<option value="all">All States</option>
					<option value="Delhi">Delhi</option>
					<option value="Hyd">HyderaBad</option>
					<option value="Mumbai">Mumbai</option>
				</select> <select class="filter-search-box" name="vehicle" required>
					<option value="" disabled>Select Vehicles</option>
					<option value="Car">Car</option>
					<option value="Bike">Bike</option>
				</select> <input type="submit" value="search">
			</form>
		</div>


		<div class="main">
			<c:choose>
				<c:when test="${status == 1}">

					<c:forEach items="${vehicles}" var="v">
						<div class="object-wrapper">
							<div class="img-wrapper">
								<img src="${v.imgURL}">
							</div>
							<div class="desc">
								<div class="row">
									<div class="col">
										<p>vehicle Type: ${v.vehicleModel}</p>
									</div>
									<div class="col">
										<p>Bike Name: ${v.vehicleName}</p>
									</div>
								</div>
								<div class="row">
									<div class="col">Deposit: ${v.vehicleDeposit}</div>
									<div class="col">Rent/PerDay: ${v.vehicleRent}</div>
								</div>
								<div class="row">
									<div class="col">City: ${v.city}</div>
								</div>
							</div>
						</div>
					</c:forEach>
				</c:when>
				<c:otherwise>
					<h3>Our Service is not here...</h3>
				</c:otherwise>
			</c:choose>
		</div>

		<h5>
			<a href="${pageContext.request.contextPath}/">Back to Home</a>
		</h5>

	</div>

</body>
</html>
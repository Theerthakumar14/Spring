<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="t" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<style type="text/css">
body {
	background-image:
		url('https://freerangestock.com/sample/140720/perfect-blue-sky-background--with-fluffy-clouds.jpg');
	background-position: center;
	background-attachment: fixed;
	background-size: 100%, 100%;
}

img {
	display: block;
	margin-right: auto;
}

h1 {
	text-align: left;
	font-family: cursive;
	color: red;
	padding: 10px;
	border
}

div {
	text-align: left;
	font-size: 15px;
	padding: 10px;
}

.error {
	color: red;
	padding-left: 20px;
}

.button {
	font-size: 15px;
	background-color: green;
	color: white;
	border: 5px solid;
	padding-top: 5px;
}

table, th, td {
	border: 1px solid black;
	color: red;
	border-color: green;
	text-align: center;
	background-color: pink;
}
</style>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<header>
	<h1>welcome to spring mvc</h1>
	</header>
	<img alt="" src="https://i.ytimg.com/vi/cJKQdzopuco/maxresdefault.jpg"
		width="300px" height="250px">
	<div>
		<form action="mobile.do" method="post">
			<pre>
MobileName:<input type="text" name="name">  <span class="error"> ${ErrorWarningMobileName}</span><br>
MobileBrand:<input type="text" name="brand"> <span class="error"> ${ErrorWarningMobileBrand}</span><br>
MobileRam:<input type="text" name="ram"><span class="error">${ErrorWarningMobileRam}</span><br>
MobilePrice:<input type="text" name="price"><span class="error">${ErrorWarningMobilePrice}</span><br>
<input type="submit" value="submit" class="button">
			</pre>
		</form>

	</div>
	<h3>Search mobile by name</h3>
	<div>
		<form action="searchMobile.do">
			<label>Enter mobile name to search</label> <input type="text"
				name="name"><span class="error">${ errorMessage}</span><br>
			<input type="submit" value="search" class="button">
		</form>
	</div>

	<div>
		<table>
			<tr>
				<th>MobileName</th>
				<th>MobileBrand</th>
				<th>MobileRam</th>
				<th>MobilePrice</th>
			</tr>
			<tr>
				<td>${name }</td>
				<td>${brand }</td>
				<td>${ram }</td>
				<td>${price }</td>
			</tr>
		</table>
	</div>

	<div>
		<h2>
			<a href="MobileDetails.do">ViewAllMobileDetails</a>
		</h2>
		<table>
			<tr>
				<th>Name</th>
				<th>brand</th>
				<th>ram</th>
				<th>price</th>
			</tr>

			<t:forEach var="mobile" items="${ mobilelist}">


				<tr>
					<td>${mobile.name}</td>
					<td>${mobile.brand }</td>
					<td>${mobile.ram }</td>
					<td>${mobile.price }</td>
				</tr>


			</t:forEach>
		</table>
	</div>
	<footer>
	<p>xworkz.in All rights reserved</p>
	</footer>
</body>

</html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Mappamondo Web</title>
</head>

<body>

	<a href="ListContinentServlet">
		<button>indietro</button>
	</a>


	<h1>Nazioni</h1>


	<style>
table, th, td {
	border: 1px solid black;
}
</style>
</head>
<body>

	<table>
		<tr>
			<th>Lista delle Nazioni</th>


		</tr>
		<c:forEach items="${countryList}" var="country">
			<tr>
				<td>
					<p>
						&nbsp &nbsp ${country.name} &nbsp <a
							href="ListCityServlet?country_code=${country.code}">Visualizza
							Città</a> &nbsp &nbsp
					</p>
				</td>
			</tr>
		</c:forEach>


	</table>
</body>
</html>
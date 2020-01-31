<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Mappa Mondo Web</title>
</head>

<body>
	<h1>Mappamondo Web</h1>


	<style>
table, th, td {
	border: 1px solid black;
}
</style>
</head>
<body>
	<table>
		<tr>
			<th>Lista dei Continenti</th>

		</tr>

		<c:forEach items="${listaContinenti}" var="listContinent">
			<tr>
				<td>
					<p>
						&nbsp &nbsp ${listContinent}  nbsp
						<a href="${listContinent}">Visualizza
							Nazioni</a> &nbsp &nbsp

					</p>
				</td>
			</tr>
		</c:forEach>
		<!-- <p>
						&nbsp &nbsp ${listContinent} &nbsp <a
							href="ListCountryServlet?name_cont=${listContinent}">Visualizza
							Nazioni</a> &nbsp &nbsp
	  </p> -->


	</table>
</body>
</html>
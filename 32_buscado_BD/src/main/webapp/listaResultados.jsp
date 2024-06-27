<%@page import="model.Resultado"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    import="model.Resultado, java.util.List"%>
<!DOCTYPE html>
<html>
<head>

<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" >
</head>
<body>
	<h2>Productos por id ${param.idResultado} </h2>
	<table border="1">
		<tr>
			<th>Url</th>
			<th>Temática</th>
			<th>Descripción</th>
		</tr>
		
			<tr>
				<td>${requestScope.resultado.url}</td>
				<td>${requestScope.resultado.categoria}</td>
				<td>${requestScope.resultado.descripcion}</td>
			</tr>
		
				
	</table>
	<a href="FrontController?operation=toInicio">Volver a home"</a>
</body>
</html> 


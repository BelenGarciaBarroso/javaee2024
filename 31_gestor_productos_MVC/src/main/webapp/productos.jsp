<%@page import="model.Producto"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    import="model.Producto, java.util.List"%>
<!DOCTYPE html>
<html>
<head>

<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" >
</head>
<body>
	<h2>Productos de ${param.categoria} </h2>
	<table border="1">
		<tr>
			<th>Nombre</th>
			<th>Precio</th>
		</tr>
		<c:forEach var="pr" item="${requestScope.productos}">
			<tr>
				<td>${pr.nombre}</td>
				<td>${pr.precio}</td>
			</tr>
		</c:forEach>
				
	</table>
	<a href="FrontController=operation=toInicio">Volver a home"</a>
</body>
</html> 


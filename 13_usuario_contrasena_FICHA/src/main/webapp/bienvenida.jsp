<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="model.Ficha,service.AutenticacionService"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<center>
		<%-- 
		Recuperamos el atributo de petición ficha y mostramos sus datos
		--%>
		<%Ficha ficha=(Ficha)request.getAttribute("ficha"); %>
		<h2>Usuario: <%=ficha.getUsuario() %></h2>
		<h2>Email: <%=ficha.getEmail() %></h2>
		<h2>Edad: <%=ficha.getEdad() %></h2>
		
		
		
		<br>
		<a href='login.html'>Volver</a>
	</center>

</body>
</html>
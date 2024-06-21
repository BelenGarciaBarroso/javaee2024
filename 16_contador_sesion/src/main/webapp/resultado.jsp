<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- Rescatamos el contador del servlet -->
	<%int cont=(Integer)session.getAttribute("cont");%>
	<center>
		<h1>Has entrador <%=cont %> veces</h1>
		<br>
		<a href="entrada.html">VOLVER</a>
	</center>
</body>
</html>
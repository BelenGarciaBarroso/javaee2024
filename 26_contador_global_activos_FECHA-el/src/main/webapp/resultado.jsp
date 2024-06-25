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
	<%int global=(Integer)application.getAttribute("global");%>
	<%int activos=(Integer)application.getAttribute("activos");%>
	<center>
		<h1>Has entrador ${sessionScope.cont } veces</h1>
		<br>
		<h1> Nº de veces accedidas totales ${applicationScope.global }</h1>
		<br>
		<h1> Nº sesiones activas ${applicationScope.activos}</h1>
		<br>
		<h2>Fecha de su última visita: ${cookie.fechaVisita.value}</h2>
		<br>
		<a href="entrada.html">VOLVER</a>
	</center>
</body>
</html>
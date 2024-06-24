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
		<h1>Has entrador <%=cont %> veces</h1>
		<br>
		<h1> Nº de veces accedidas totales <%=global %></h1>
		<br>
		<h1> Nº sesiones activas <%=activos %></h1>
		<br>
		<%String fecha="";
		 Cookie todas[]=request.getCookies();
		 if(todas!=null){
		 	for(Cookie ck:todas){
		 		if(ck.getName().equals("fechaVisita")){
		 			fecha=ck.getValue();
		 		}
		 	}
		 }%>		
		<h2>Fecha de su última visita: <%=fecha%></h2>
		<h1>Fecha de la última conexion: <%=fecha %></h1>
		<br>
		<a href="entrada.html">VOLVER</a>
	</center>
</body>
</html>
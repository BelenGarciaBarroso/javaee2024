<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="model.Resultado, java.util.List"%>

    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<c:forEach var="r" items="${requestScope.resultados}">
			<h2><a href="${r.url}">${r.url}</a></h2>
			<h4>${r.descripcion}</h4>
			<hr>
		
	</c:forEach>
	<br>
	<a href="FrontController?operation=toInicio">Volver</a>
</body>
</html>
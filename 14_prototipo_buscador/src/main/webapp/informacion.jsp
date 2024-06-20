<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="model.Resultado,java.util.List"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<center>
		<% List<Resultado> resultados=(List<Resultado>)request.getAttribute("resultado");%>
		<% if (resultados.size()>0 && resultados!=null) {%>
			<% for (Resultado r:resultados) {%>
				<h2><a href="<%=r.getUrl()%>"><%=r.getUrl()%></a></h2>
				<h4><%=r.getDescripcion() %></h4>
				<hr>
			<%} %>
		<%} %>
		
	
	</center>

</body>
</html>
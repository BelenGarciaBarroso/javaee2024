<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<center>
		<%int numero=Integer.parseInt(request.getParameter("numero"));%>
		<h1>Tabla del  <%=numero%></h1>
		<table border="1">
		<%for (int a=1;a<=10;a++) { %>
			<tr>
				<td><%=a%> x <%=numero%></td>
				<td><%=a*numero %></td>
			</tr>
		<%}%>
		</table>
		<br>
			<a href='numero.html'>Volver</a>
	
	</center>

</body>
</html>
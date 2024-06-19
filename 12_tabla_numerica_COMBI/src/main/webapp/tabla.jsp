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
		<%for (int a=1;a<=10;a++) { %>
			<tr>
				<td><%=a%> x <%=Integer.parseInt(request.getParameter("numero"))%></td>
				<td><%=a*Integer.parseInt(request.getParameter("numero")) %></td>
			</tr>
		<%}%>
		<br>
			<a href='numero.html'>Volver</a>
	
	</center>

</body>
</html>
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
		<h2>TALBA DEL 1 AL 10</h2>
		<table border='1'>
		<%for (int j=1; j<=10;j++) {%>
				<tr>
					<%for (int a=1;a<=10;a++) {%>
						<td><%=j*a%></td>
					<%}%>
				</tr>
				
		<%}%>
	
	

</body>
</html>
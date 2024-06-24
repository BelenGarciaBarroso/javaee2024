<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<center>
		<img src="himalaya.jpg" width="200" height="100" >
		<br>
		<br>
		<h1> <a href="ContadorServlet.java?opcion=like"> <img src="megusta.png" width= ></a>
		&nbsp;&nbsp;&nbsp;&nbsp;
		<a href="ContadorServlet.java?opcion=noLike"> <img src="NOmegusta.png"></a></h1>
		<br>
			<h1><%=application.getAttribute("like")!=null?application.getAttribute("like"):0 %>
			&nbsp;&nbsp;&nbsp;&nbsp;
			<%=application.getAttribute("noLike")!=null?application.getAttribute("noLike"):0 %></h1>
		
	
	</center>


</body>
</html>
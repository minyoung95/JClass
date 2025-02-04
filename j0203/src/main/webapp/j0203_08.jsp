<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title></title>
	</head>
	<body>
		<%
			out.println("서버 : "+request.getServerName()+"<br/>");
			out.println("ip주소 : "+request.getRemoteAddr()+"<br/>");
			out.println("url : "+request.getRequestURL()+"<br/>"); // 전체주소
			out.println("uri : "+request.getRequestURI()+"<br/>"); // 서버이름 뺀 나머지 주소
		%>
	
	</body>
</html>
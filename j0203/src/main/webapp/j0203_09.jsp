<%@page import="java.net.URLEncoder"%>
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
			String name = URLEncoder.encode(request.getParameter("name"),"utf-8"); // URLEncoder.encode : 인코딩
			String sage = request.getParameter("age");
			int age = Integer.parseInt(sage);
			
			if(age>=20){
				response.sendRedirect("success.jsp?age="+age+"&name="+name); // sendRedirect : 다른 페이지로 보냄
			}else{
				response.sendRedirect("fail.jsp?age="+age+"&name="+name); // age와 name 데이터를 fail.jsp에 보냄
				// "홍길동"이 "홍길동"으로 바뀌어 "홍%EA%B8%B8%EB%8F%99"과 같이 URL 인코딩되어 응답 헤더에 포함됩니다. << 에러 : 인코딩을 해주어야함
			}
		
		%>
	
	</body>
</html>
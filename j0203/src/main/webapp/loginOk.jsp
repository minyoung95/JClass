<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>모든쿠키 확인</title>
	</head>
	<body>
		<h2>쿠키정보 확인하기</h2>
		<%
			Cookie[] cookies = request.getCookies();
			if(cookies != null){
				for(int i=0;i<cookies.length;i++){
					out.println("쿠키이름 : "+cookies[i].getName()+", 쿠키값 : "+cookies[i].getValue()+"<br/>");
				}
			}
		%>
		<button onclick="javascript:location.href='j0203_11.jsp'">메인페이지</button>
	</body>
</html>
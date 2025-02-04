<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>list 출력</title>
	</head>
	<body>
		<h2>데이터값 출력</h2>
		<div>count값 : ${param.count}</div>
		<hr>
		<c:forEach items="${list}" var="member" varStatus="vs"> <!-- 리스트를 받을땐 items list하나하나를 member에 넣어줌 -->
			<div>아이디 ${vs.index+1} : ${member.id}, 이름 : ${member.name}</div>
		</c:forEach>
	</body>
</html>
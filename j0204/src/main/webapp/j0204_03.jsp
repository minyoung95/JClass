<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>해당값 반복</title>
	</head>
	<body>
		<!-- 1~10 -->
		<c:forEach begin="${param.st}" end="${param.ed}" step="1" var="i">
			<div>${i}</div>
		</c:forEach>
	</body>
</html>
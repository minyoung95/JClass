<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!-- 변수,흐름제어(for,if,switch),변수출력 -->
<!DOCTYPE html>
<html>
	<head>
	<meta charset="UTF-8">
	<title>jstl</title>
	</head>
	<body>
	<% String sid = "aaa"; %>
	<div>스크립트릿 사용 id : <%= sid %></div>
	
	<c:set var="id" value="aaa"/> <!-- 변수선언 var(변수명),value(변수값) -->
	<div>jstl 변수값 : ${id}</div> <!-- 변수출력 -->
	
	<%--
	<% if(id.equals("bbb"){ %>
	<div>id는 bbb입니다.</div>
	<% } else { %>
	<div>id는 bbb가 아닙니다..</div>
	<% } %>
	 --%>
	 
	<c:if test="${id=='bbb'}"> <!-- if문 c: jstl태그, $: el태그-->
		<div>id는 bbb입니다.</div>
	</c:if>
	<c:if test="${id!='bbb'}">
	<div>id는 bbb가 아닙니다. id는 ${id}입니다.</div>
	</c:if>
	
	<hr>
	
	<%--
	<% for(int i=1;i<=10;i++) { %>
		<div>i변수값 : </div>
	<% } %>
	--%>
	
	<c:forEach begin="1" end="10" step="1" var="i"> <!-- for문 -->
		<div>i변수값 : ${i}</div>
	</c:forEach>
	
	<hr>
	
	<c:set var="score" value="89"/>
	<c:choose> <!-- switch -->
	<c:when test="${score>=90}"> <!-- case -->
		<div>성적 : A</div>
	</c:when>
	<c:when test="${score>=80}">
		<div>성적 : B</div>
	</c:when>
	<c:when test="${score>=70}">
		<div>성적 : C</div>
	</c:when>
	<c:when test="${score>=60}">
		<div>성적 : D</div>
	</c:when>
	<c:otherwise> <!-- default -->
		<div>성적 : F</div>
	</c:otherwise>
	</c:choose>	
	</body>
</html>
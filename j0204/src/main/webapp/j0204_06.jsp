<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>페이지</title>
		<style>
			h2{text-align: center;}
			table,th,td{border:1px solid black; border-collapse: collapse;}
			table{width: 900px; margin: 10px auto; text-align: center;}
			th,td{height: 40px;}
		</style>
	</head>
	<body>
		<h2>리스트 출력</h2>
		<table>
			<tr>
				<td>아이디</td>
				<td>이름</td>
				<td>취미</td>
			</tr>
			<c:forEach items="${list}" var="mem">
			<tr>
				<td>${mem.id}</td>
				<td>${mem.name}</td>
				<td>${mem.hobby}</td>
			</tr>
			</c:forEach>
		</table>
		
		<hr>
		
		<h2>홍길동 회원정보</h2>
		<form action="">
		<label>아이디</label>
		<input type="text" name="id" value="${list[0].id}"><br/>
		<label>이름</label>
		<input type="text" name="name" value="${list[0].name}"><br/>
		<label>취미</label><br/>
		<input type="checkbox" name="hobby" value="game" <c:if test="${fn:contains(list[0].hobby,'게임')}">checked</c:if>>
		<label for="game">게임</label>
		<input type="checkbox" name="hobby" value="golf" <c:if test="${fn:contains(list[0].hobby,'골프')}">checked</c:if>>
		<label for="golf">골프</label>
		<input type="checkbox" name="hobby" value="sing" <c:if test="${fn:contains(list[0].hobby,'노래')}">checked</c:if>>
		<label for="sing">노래</label>
		<input type="checkbox" name="hobby" value="book" <c:if test="${fn:contains(list[0].hobby,'독서')}">checked</c:if>>
		<label for="book">독서</label>
		<input type="checkbox" name="hobby" value="run" <c:if test="${fn:contains(list[0].hobby,'조깅')}">checked</c:if>>
		<label for="run">조깅</label>
		<input type="checkbox" name="hobby" value="piano" <c:if test="${fn:contains(list[0].hobby,'피아노')}">checked</c:if>>
		<label for="piano">피아노</label>
		<input type="checkbox" name="hobby" value="guiter" <c:if test="${fn:contains(list[0].hobby,'기타')}">checked</c:if>>
		<label for="guiter">기타</label>
		<input type="checkbox" name="hobby" value="soccer" <c:if test="${fn:contains(list[0].hobby,'축구')}">checked</c:if>>
		<label for="soccer">축구</label>
		<input type="checkbox" name="hobby" value="tennis" <c:if test="${fn:contains(list[0].hobby,'테니스')}">checked</c:if>>
		<label for="tennis">테니스</label>
		<input type="checkbox" name="hobby" value="swim" <c:if test="${fn:contains(list[0].hobby,'수영')}">checked</c:if>>
		<label for="swim">수영</label>
		</form>
	</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>jsp태그</title>
		<style>
			table,th,td{border: 1px solid black; border-collapse: collapse;}
			table{width: 800px; margin: 10px auto;}
			th, td{width: 150px; height: 40px;}
		</style>
	</head>
	<body>
		<%-- jsp 태그들은 소스들이 노출되지 않음 --%>
		<%-- jsp 주석 --%>
		<%!
			int no = 10;
			String name = "홍길동";
			int age = 20;
			String address = "서울 영등포구 여의도동";
		%> <!-- 선언식 : 공통으로 사용 가능 -->
		
		<table>
			<tr>
				<th>제목</th>
				<th>내용</th>
			</tr>
			<tr>
				<td>학번</td>	
				<td><%= no %></td>	<!-- 표현식 : (= out.println(no)) -->
			</tr>
			<tr>
				<td>이름</td>	
				<td><% out.println(name); %></td> <!-- 스크립트릿 : java 코드를 사용할 수 있게 해줌 -->
			</tr>
		</table>
	</body>
</html>
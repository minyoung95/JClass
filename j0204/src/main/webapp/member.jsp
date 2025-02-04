<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>회원가입</title>
	</head>
	<body>
		<h2>회원가입</h2>
		<form action="j0204_07.jsp" method="post">
			<label>아이디</label>
			<input type="text" name="id"><br/>
			<label>패스워드</label>
			<input type="text" name="pw"><br/>
			<label>이름</label>
			<input type="text" name="name"><br/>
			<label>전화번호</label>
			<input type="text" name="tel"><br/>
			<label>성별</label><br/>
			<input type="radio" name="gender" id="man" value="man">
			<label for="man">남자</label>
			<input type="radio" name="gender" id="woman" value="woman">
			<label for="woman">여자</label>
			<label>취미</label><br/>
			<input type="checkbox" name="hobby" value="piano">
			<label for="piano">피아노</label>
			<input type="checkbox" name="hobby" value="guiter">
			<label for="guiter">기타</label>
			<input type="checkbox" name="hobby" value="soccer">
			<label for="soccer">축구</label>
			<input type="checkbox" name="hobby" value="tennis">
			<label for="tennis">테니스</label>
			<input type="checkbox" name="hobby" value="swim">
			<label for="swim">수영</label>
			<br/>
			<input type="submit" value="가입완료">
		</form>
	</body>
</html>
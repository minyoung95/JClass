<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>쿠키저장</title>
	</head>
	<body>
		<!-- 쿠키저장하기 쿠키이름 : cook_id , 값 : 입력데이터 id -->
		<%
			String cookN = request.getParameter("id");
			String cookV = request.getParameter("pw");
			String[] saveId = request.getParameterValues("saveId");
			
			if(saveId!=null){
				Cookie cookie = new Cookie("cook_id",cookN);
				cookie.setMaxAge(60*60*24*365);
				response.addCookie(cookie);
		%>
			<div><%= saveId[0] %> 이 저장되었습니다.</div>
			<%}else{
				Cookie[] cookies = request.getCookies();
				for(Cookie cookie: cookies){
					if(cookie.getName().equals("cook_id")){
						cookie.setMaxAge(0);
						response.addCookie(cookie);
					}
				}
			%>	
			<div>쿠키에 저장되어 있는 cook_id가 삭제되었습니다.</div>
			<%}%>
			
		%>
		<br/>
		<button onclick="javascript:location.href='loginOk.jsp'">이동하기</button>
	</body>
</html>
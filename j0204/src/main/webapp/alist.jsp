<%@page import="com.java.www.Mem"%>
<%@page import="com.java.www.Member"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>ArrayList 생성</title>
	</head>
	<body>
		<%
			String[] id = {"aaa","bbb","ccc","ddd","eee"
					,"fff","ggg","hhh","iii","jjj"};
			String[] name = {"홍길동","유관순","이순신","강감찬","김구"
					,"홍길자","홍길순","김유신","을지문덕","신사임당"};
			String[] hobby = {"게임,노래,축구","골프,독서,조깅","수영","독서,조깅,노래,축구",
					"조깅,축구,기타,게임","노래,피아노","축구,게임,기타","기타","테니스,독서","피아노"};
			ArrayList<Mem> list = new ArrayList();
			for(int i=0;i<10;i++){
				list.add(new Mem(id[i],name[i],hobby[i]));
			}
			
			session.setAttribute("list", list);
			
			// input박스에서 데이터를 넘길때 request > request.getParameter();
		%>
		<form action="j0204_06.jsp">
			<label>값</label>
			<input type="text" name="count">
			<input type="submit" value="전송">
		</form>
	</body>
</html>
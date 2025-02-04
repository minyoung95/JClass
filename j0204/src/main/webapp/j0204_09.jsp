<%@page import="javax.naming.InitialContext"%>
<%@page import="javax.naming.Context"%>
<%@page import="javax.sql.DataSource"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>데이터베이스 연결</title>
	</head>
	<body>
	<!-- board 데이터 출력 -->
	<%!
		Connection conn;
		PreparedStatement pstmt;
		ResultSet rs;
		DataSource ds;
	
	%>
	
	
	<%
		try{
			
			Context ctx = new InitialContext();
			Context envContext =(Context)ctx.lookup("java:/comp/env");
			ds = (DataSource)envContext.lookup("jdbc/Oracle21");
			String sql = "select * from employees";
			conn = ds.getConnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			out.println("db 접속 <br/>");
			
			while(rs.next()){
				int bno = rs.getInt("bno");
				String btitle = rs.getString("btitle");
				String bcontent = rs.getString("bcontent");
				String id = rs.getString("id");
				int bgroup = rs.getInt("bgroup");
				int bstep = rs.getInt("bstep");
				int bindent = rs.getInt("bindent");
				int bhit = rs.getInt("bhit");
			}
			
		}catch(Exception e){e.printStackTrace();
		}finally{
			try{
				if(rs!=null) rs.close();
				if(pstmt!=null) pstmt.close();
				if(conn!=null) conn.close();
				
			}catch(Exception e2){e2.printStackTrace();}
		}
	%>
	
	<table>
		<tr>
			<th>번호</th>
			<th>제목</th>
			<th>내용</th>
			<th>아이디</th>
			<th>그룹</th>
			<th>스탭</th>
			<th>인덴트</th>
			<th>조회수</th>
		</tr>
		<tr>
			<th>${bno}</th>
			<th>${btitle}</th>
			<th>${bcontent}</th>
			<th>${id}</th>
			<th>${bgroup}</th>
			<th>${bstep}</th>
			<th>${bindent}</th>
			<th>${bhit}</th>
		</tr>
	</table>
	
	</body>
</html>
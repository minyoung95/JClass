<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%!
		Connection conn;
		PreparedStatement pstmt;
		ResultSet rs;
	%>
	<%
		// 페이지에 노출
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String uid = "ora_user";
		String upw = "1111";
		String sql = "select * from employees";
		
		try{
			Class.forName(driver);
			conn = DriverManager.getConnection(url,uid,upw);
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			out.println("db접속");
			
			while(rs.next()){
				String employee_id = rs.getString("employee_id");
				String emp_name = rs.getString("emp_name");
				out.println("사번/이름 : "+employee_id+"/"+emp_name+"<br/>");
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			try{
				if(rs!=null) rs.close();
				if(pstmt!=null) pstmt.close();
				if(conn!=null) conn.close();
			}catch(Exception e){
				
			}
		}
	%>

</body>
</html>
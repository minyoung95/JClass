package com.naver.www;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/HelloW")
public class HelloW extends HttpServlet {
       
	protected void doAction(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doAction 호출");
		
		// 프로그램 구현
		response.setContentType("text/html;charset=utf-8");
		request.setCharacterEncoding("utf-8"); // 한글 깨짐방지 (server.xml > Connector URIEncoding="utf-8")
		PrintWriter writer = response.getWriter();
		writer.println("<html>");
		writer.println("<head><title>servlet page</title></head>");
		writer.println("<body>");
		writer.println("<h2>servlet page open</h2>");
		writer.println("</body>");
		writer.println("</html>");
		writer.close();
		
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("doGet 호출");
		doAction(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPost 호출");
		doAction(request,response);
	}

}

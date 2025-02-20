package com.naver.www;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/StuCom")
public class StuCom extends HttpServlet {

	protected void doAction(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet 호출");
		
		int no = Integer.parseInt(request.getParameter("stuNo"));
		String name = request.getParameter("name");
		int kor = Integer.parseInt(request.getParameter("kor"));
		int eng = Integer.parseInt(request.getParameter("eng"));
		int math = Integer.parseInt(request.getParameter("math"));
		int total = kor+eng+math;
		double avg = total/3.0;
		
		System.out.println("학번 : "+no);
		System.out.println("이름 : "+name);
		System.out.println("국어 : "+kor);
		System.out.println("영어 : "+eng);
		System.out.println("수학 : "+math);
		System.out.println("합계 : "+total);
		System.out.println("평균 : "+avg);

		response.setContentType("text/html;charset=utf-8"); 
		request.setCharacterEncoding("utf-8"); // 한글인코딩
		
		PrintWriter writer = response.getWriter();
		writer.println("<html>");
		writer.println("<head>");
		writer.println("<title>학생성적</title>");
		writer.println("</head>");
		writer.println("<body>");
		writer.println("<h2>학생성적</h2>");
		writer.printf("<h4>학번 : %d</h4>",no);
		writer.printf("<h4>이름 : %s</h4>",name);
		writer.printf("<h4>국어 : %d</h4>",kor);
		writer.printf("<h4>영어 : %d</h4>",eng);
		writer.printf("<h4>수학 : %d</h4>",math);
		writer.printf("<h4>합계 : %d</h4>",total);
		writer.printf("<h4>평균 : %.2f</h4>",avg);
		writer.println("</body>");
		writer.println("</html>");
		writer.close();
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet 호출");
		doAction(request,response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPost 호출");
		doAction(request,response);
	}

}

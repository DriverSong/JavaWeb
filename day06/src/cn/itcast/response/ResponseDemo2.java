package cn.itcast.response;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ResponseDemo2")
public class ResponseDemo2 extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		test2(response);
		
	}

	private void test2(HttpServletResponse response) throws IOException {
		//告知response使用utf-8码表
//		response.setCharacterEncoding("UTF-8");
		
		//告知浏览器用utf-8码表
//		response.setHeader("content-type", "text/html;charset=utf-8");
		response.setContentType("text/html;charset=utf-8");
		String data = "中国";
		PrintWriter out = response.getWriter();
		out.write(data);
	}
	
	private void test1(HttpServletResponse response) throws IOException {
		//告知response使用utf-8码表
		response.setCharacterEncoding("UTF-8");
		
		//告知浏览器用utf-8码表
		response.setHeader("content-type", "text/html;charset=utf-8");
		String data = "中国";
		PrintWriter out = response.getWriter();
		out.write(data);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}

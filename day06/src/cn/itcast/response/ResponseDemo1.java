package cn.itcast.response;

import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ResponseDemo1")
public class ResponseDemo1 extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		test1(response);	
	}

	
	private void test2(HttpServletResponse response) throws IOException, UnsupportedEncodingException {
		//		response.getWriter().append("Served at: ").append(request.getContextPath());
				//html中 <meta>头可以模拟一个http响应头
//				response.setHeader("Content-type", "text/html;charset=UTF-8");
				
				String data = "中国";
				OutputStream out = response.getOutputStream();
				out.write("<meta http-equiv='content-type' content='text/html;charset=UTF-8'>".getBytes());
				out.write(data.getBytes("utf-8"));
	}
	
	private void test1(HttpServletResponse response) throws IOException, UnsupportedEncodingException {
		//		response.getWriter().append("Served at: ").append(request.getContextPath());
				//程序以什么码表输出，则应告诉浏览器以什么码表打开
				response.setHeader("Content-type", "text/html;charset=UTF-8");
				
				String data = "中国";
				OutputStream out = response.getOutputStream();
		//		out.write(data.getBytes("utf-8"));
				out.write(data.getBytes("utf-8"));
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
		
	}

}

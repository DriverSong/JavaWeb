package cn.itcast.request;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/RequestDemo4")
public class RequestDemo4 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		test2(request);
		
	}

	private void test2(HttpServletRequest request) throws UnsupportedEncodingException {
		//只对POST有效
		request.setCharacterEncoding("UTF-8");
		String username = request.getParameter("username");
		System.out.println(username);
	}

	private void test1(HttpServletRequest request) throws UnsupportedEncodingException {
		//只对GET有效
		String username = request.getParameter("username");
		username = new String(username.getBytes("ISO8859-1"), "UTF-8");
		System.out.println(username);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}

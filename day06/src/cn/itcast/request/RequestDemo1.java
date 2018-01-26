package cn.itcast.request;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/RequestDemo1")
public class RequestDemo1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//URI
		System.out.println(request.getRequestURI());
		//URL
		System.out.println(request.getRequestURL());
		//请求行部分参数名字
		System.out.println("------------------------");
		System.out.println(request.getQueryString());
		//客户机ip
		System.out.println(request.getRemoteAddr());
		//客户机主机名
		System.out.println(request.getRemoteHost());
		//客户机端口
		System.out.println(request.getRemotePort());
		System.out.println("------------------------");
		//服务器ip
		System.out.println(request.getLocalAddr());
		//服务器主机
		System.out.println(request.getLocalName());
		System.out.println("------------------------");
		//客户机请求方式
		System.out.println(request.getMethod());
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}

package cn.itcast.response;

import java.io.IOException;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ResponseDemo5")
public class ResponseDemo5 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		test3(request, response);
		
	}
	//实际开发中，会使用jsp进行输出，此时跳转操作就不能靠写response头来传输给浏览器了，而应该通过html的meta头进行设置
	private void test3(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		
		String message = "<meta http-equiv='refresh' content='3;url=/day06/index.jsp'>本页面将在3秒后跳转，若无响应，请点击<a href=''>超链接</a>";
		this.getServletContext().setAttribute("message", message);
		
		this.getServletContext().getRequestDispatcher("/print.jsp").forward(request, response);
		
	}
	//实际开发中，并不会使用这种输出方式，浏览器的输出信息，大多采用jsp进行输出
	private void test2(HttpServletResponse response) throws IOException {
		response.setContentType("text/html;charset=UTF-8");
		
		response.setHeader("refresh", "3;url='/day06/index.jsp'");
		response.getWriter().write("本页面将在3秒后跳转，若无响应，请点击<a href=''>超链接</a>");
	}

	private void test1(HttpServletResponse response) throws IOException {
		response.setHeader("refresh", "3");
		String data = new Random().nextInt(10000) + "";
		response.getWriter().write(data);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}

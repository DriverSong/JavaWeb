package cn.itcast;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 Servletcontext域：
 1.这是一个容器；
 2.说明了这个容器的作用范围，也就是应用程序范围 
 3.
 */

//通过servletcontext实现ServletDemo5和ServletDemo6的数据共享
@WebServlet("/ServletDemo6")
public class ServletDemo6 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String value = (String) this.getServletContext().getAttribute("data");
		System.out.println(value);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}

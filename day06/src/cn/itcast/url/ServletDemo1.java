package cn.itcast.url;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ServletDemo1")
public class ServletDemo1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//关于地址的选择
		/*
		 * 1.首先，先写下“/”（斜杠）
		 * 2.考虑改地址是给服务器使用还是给浏览器使用
		 * 	1)若给服务器，则“/”即代表当前web应用（我们要访问的是该web应用下的各个web资源）
		 * 	2)若给浏览器，则“/”即代表浏览器浏览的网站（我们要访问的是该网站下的各种web应用）
		 * 
		 * 3.获取url资源，用"/"；硬盘上资源用"\"
		 */
		
		//1
		request.getRequestDispatcher("/form.html").forward(request, response);
		
		//2
		response.sendRedirect("/day06/form.html");
		
		//3
		this.getServletContext().getRealPath("/form.html");
		
		//4
		this.getServletContext().getResourceAsStream("/public/foot.jsp");
		
		//5
		/*
		  <a href="/day06/public/foot.jsp">超链接</a>
		  
		  <form action="/day06/public/foot.jsp">
		  
		  </form>
		  
		 
		 */
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}

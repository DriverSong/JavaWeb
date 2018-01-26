package cn.itcast;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//使用ServletContext进行转发
/**
 * Servlet implementation class ServletDemo8
 */
@WebServlet("/ServletDemo8")
public class ServletDemo8 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String data = "aaaaa";
		
		//数据传输
		this.getServletContext().setAttribute("data", data);
		
		RequestDispatcher rDispatcher =  this.getServletContext().getRequestDispatcher("/1.jsp");//设定转发路径为1.jsp
		rDispatcher.forward(request, response);//实现转发
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

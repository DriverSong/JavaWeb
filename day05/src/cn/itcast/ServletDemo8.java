package cn.itcast;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//ʹ��ServletContext����ת��
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
		
		//���ݴ���
		this.getServletContext().setAttribute("data", data);
		
		RequestDispatcher rDispatcher =  this.getServletContext().getRequestDispatcher("/1.jsp");//�趨ת��·��Ϊ1.jsp
		rDispatcher.forward(request, response);//ʵ��ת��
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

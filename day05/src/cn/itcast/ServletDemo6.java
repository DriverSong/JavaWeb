package cn.itcast;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 Servletcontext��
 1.����һ��������
 2.˵����������������÷�Χ��Ҳ����Ӧ�ó���Χ 
 3.
 */

//ͨ��servletcontextʵ��ServletDemo5��ServletDemo6�����ݹ���
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

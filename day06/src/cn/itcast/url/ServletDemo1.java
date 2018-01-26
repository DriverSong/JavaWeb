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
		//���ڵ�ַ��ѡ��
		/*
		 * 1.���ȣ���д�¡�/����б�ܣ�
		 * 2.���Ǹĵ�ַ�Ǹ�������ʹ�û��Ǹ������ʹ��
		 * 	1)��������������/��������ǰwebӦ�ã�����Ҫ���ʵ��Ǹ�webӦ���µĸ���web��Դ��
		 * 	2)�������������/��������������������վ������Ҫ���ʵ��Ǹ���վ�µĸ���webӦ�ã�
		 * 
		 * 3.��ȡurl��Դ����"/"��Ӳ������Դ��"\"
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
		  <a href="/day06/public/foot.jsp">������</a>
		  
		  <form action="/day06/public/foot.jsp">
		  
		  </form>
		  
		 
		 */
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}

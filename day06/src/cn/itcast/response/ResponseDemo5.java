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
	//ʵ�ʿ����У���ʹ��jsp�����������ʱ��ת�����Ͳ��ܿ�дresponseͷ�������������ˣ���Ӧ��ͨ��html��metaͷ��������
	private void test3(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		
		String message = "<meta http-equiv='refresh' content='3;url=/day06/index.jsp'>��ҳ�潫��3�����ת��������Ӧ������<a href=''>������</a>";
		this.getServletContext().setAttribute("message", message);
		
		this.getServletContext().getRequestDispatcher("/print.jsp").forward(request, response);
		
	}
	//ʵ�ʿ����У�������ʹ�����������ʽ��������������Ϣ��������jsp�������
	private void test2(HttpServletResponse response) throws IOException {
		response.setContentType("text/html;charset=UTF-8");
		
		response.setHeader("refresh", "3;url='/day06/index.jsp'");
		response.getWriter().write("��ҳ�潫��3�����ת��������Ӧ������<a href=''>������</a>");
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

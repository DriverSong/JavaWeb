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
		//�����в��ֲ�������
		System.out.println("------------------------");
		System.out.println(request.getQueryString());
		//�ͻ���ip
		System.out.println(request.getRemoteAddr());
		//�ͻ���������
		System.out.println(request.getRemoteHost());
		//�ͻ����˿�
		System.out.println(request.getRemotePort());
		System.out.println("------------------------");
		//������ip
		System.out.println(request.getLocalAddr());
		//����������
		System.out.println(request.getLocalName());
		System.out.println("------------------------");
		//�ͻ�������ʽ
		System.out.println(request.getMethod());
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}

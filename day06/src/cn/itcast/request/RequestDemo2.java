package cn.itcast.request;

import java.io.IOException;
import java.util.Enumeration;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/RequestDemo2")
public class RequestDemo2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//法一
		System.out.println("---------------------");
		String name = request.getParameter("username");
		System.out.println(name);
		
		//法二
		System.out.println("---------------------");
		String[] names = request.getParameterValues("username");
		for(int i = 0; names.length!=0 && i<names.length; i++){
			System.out.println(names[i]);
		}
		
		//法三
		System.out.println("---------------------");
		Enumeration e = request.getParameterNames();
		while (e.hasMoreElements()) {
			String name1 = (String) e.nextElement();
			String value1 = request.getParameter(name1);
			System.out.println(name1 + "=" + value1);
			
		}
		
		//法四
//		System.out.println("---------------------");
//		Map<String, String[]> map = request.getParameterMap();
//		BeanU
		
	}
	//获取头相关方法
	private void test1(HttpServletRequest request) {
		String value = request.getHeader("Accept-Encoding");
		System.out.println("Accept-Encoding" + "=" + value);
		System.out.println("-----------------------------");
		
		Enumeration e = request.getHeaders("Accept-Encoding");
		while(e.hasMoreElements()){
			System.out.println("Accept-Encoding" + "=" + e.nextElement());			
		}
		System.out.println("-----------------------------");
		
		Enumeration e1 = request.getHeaderNames();
		while(e1.hasMoreElements()){
			 String name = (String)e1.nextElement();
			 String value1 = request.getHeader(name);
			 System.out.println(name + "=" + value1);
		}
		System.out.println("-----------------------------");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}

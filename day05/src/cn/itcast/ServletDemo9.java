package cn.itcast;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//servletcontext��ȡproperties��Դ�ļ�
@WebServlet("/ServletDemo9")
public class ServletDemo9 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		test3();
	}
	//��ȡdb1.properties
	private void test1() throws IOException {
		InputStream in = this.getServletContext().getResourceAsStream("/WEB-INF/classes/db1.properties");
		Properties props = new Properties();//map�ļ�����
		props.load(in);
		
		String url = props.getProperty("url");
		String username = props.getProperty("username");
		String password = props.getProperty("password");
		System.out.println(url);
		System.out.println(password);
		System.out.println(username);
	}
	
	//��ȡdb2.properties
		private void test2() throws IOException {
			InputStream in = this.getServletContext().getResourceAsStream("/WEB-INF/classes/cn/itcast/db2.properties");
			Properties props = new Properties();//map�ļ�����
			props.load(in);
			
			String url = props.getProperty("url");
			String username = props.getProperty("username");
			String password = props.getProperty("password");
			System.out.println(url);
			System.out.println(password);
			System.out.println(username);
		}
		
		//��ȡdb3.properties
		private void test3() throws IOException {
			InputStream in = this.getServletContext().getResourceAsStream("/db3.properties");
			Properties props = new Properties();//map�ļ�����
			props.load(in);
			
			String url = props.getProperty("url");
			String username = props.getProperty("username");
			String password = props.getProperty("password");
			System.out.println(url);
			System.out.println(password);
			System.out.println(username);
		}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}

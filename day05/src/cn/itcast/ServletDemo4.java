package cn.itcast;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//servletcontextʾ��
@WebServlet("/ServletDemo4")
public class ServletDemo4 extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public ServletDemo4() {
        super();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//��servlet��һ��
		ServletContext context = this.getServletConfig().getServletContext();
		//��servlet������
		ServletContext context2 = this.getServletContext();
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}

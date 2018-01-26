package cn.itcast.request;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//forwardÏ¸½Ú£ºjava.lang.IllegalStateException: Cannot forward after response has been committed
@WebServlet("/RequestDemo6")
public class RequestDemo6 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String data = "aaaa";
		
		PrintWriter writer = response.getWriter();
		writer.write(data);
		writer.close();
		
		request.getRequestDispatcher("/document5.jsp").forward(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}

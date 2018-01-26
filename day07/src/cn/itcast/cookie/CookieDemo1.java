package cn.itcast.cookie;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.Response;

import org.apache.jasper.tagplugins.jstl.core.Out;

import javafx.scene.chart.PieChart.Data;
import sun.security.provider.certpath.ResponderId;

//代表网站首页
@WebServlet("/CookieDemo1")
public class CookieDemo1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		
		PrintWriter out = response.getWriter();
		out.print("您上次访问时间是：");
		
		//获取cookie并显示
		Cookie cookies[] = request.getCookies();
		
		for(int i=1; cookies != null && i<cookies.length; i++){
			if (cookies[i].getName().equals("lastAccessTime")) {
				out.print(cookies[i].getValue());
				long cookieValue = Long.parseLong(cookies[i].getValue());
				Date date = new Date(cookieValue);
				out.print(date.toString());
			}
		}
		
		//返回当前时间
		Cookie cookie = new Cookie("lastAccessTime", System.currentTimeMillis()+"");
		cookie.setMaxAge(1*30*24*3600);
		cookie.setPath("/day07");
		
		response.addCookie(cookie);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}

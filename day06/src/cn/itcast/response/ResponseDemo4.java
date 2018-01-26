package cn.itcast.response;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//������ͼƬ
@WebServlet("/ResponseDemo4")
public class ResponseDemo4 extends HttpServlet {
	
	public static final int WIDTH = 120;	
	public static final int HEIGTH = 25;	 
	
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//����ͼƬ��ʹ��BufferedImage����
		BufferedImage image = new BufferedImage(WIDTH, HEIGTH, BufferedImage.TYPE_INT_RGB);
		
		Graphics g = image.getGraphics();
		
		//1.���ñ���ɫ
		setBackGround(g);
		
		//2.���ñ߿�
		setBorder(g);
		
		//3.��������
		drawRandomLine(g);
		
		//4.д�����
		drawRandomNum((Graphics2D)g);
		
		//5.�����������ͼƬ��ʽ��
		response.setContentType("image/jpeg");
		
		//6.��ͼ�θ������
		ImageIO.write(image, "jpg", response.getOutputStream());
		
//		//�õ�����·��
//		String realpath = this.getServletContext().getRealPath("/ServletDemo4");
//		System.out.println(realpath);
		
//		//�õ���Ե�ַ
//		String Path= request.getRequestURI();
//		System.out.println(Path);
		
	}

	private void drawRandomNum(Graphics2D g) {
		g.setColor(Color.RED);
		g.setFont(new Font("TimeNewRoman", Font.BOLD, 20));
		
		int offset = WIDTH/4;
		for (int i = 0; i < 4; i++) {
			//[\u4e00-\u9fa5]unix�ַ��к����������
//			char c = '��';
//			char d = '\u4e00';
//			System.out.println(c);
//			System.out.println(d);
//			int num = new Random()
			int degree = new Random().nextInt(60)-30;
			String c = new Integer(new Random().nextInt(9)).toString();
			g.rotate(degree*Math.PI/180, 10+offset*i, 12.5);
			g.drawString(c, 10+offset*i, 22);
			g.rotate(-degree*Math.PI/180, 10+offset*i, 12.5);
		}

	}

	private void drawRandomLine(Graphics g) {
		g.setColor(Color.BLUE);
		for (int i = 0; i < 5; i++) {
			int x = new Random().nextInt(HEIGTH);
			int y = new Random().nextInt(HEIGTH);
			
			g.drawLine(0, x, WIDTH, y);
		}
		
	}

	private void setBorder(Graphics g) {
		g.setColor(Color.BLACK);
		g.drawRect(0, 0, WIDTH, HEIGTH);
	}

	private void setBackGround(Graphics g) {
		g.setColor(Color.WHITE);
		g.fillRect(1, 1, WIDTH-2, HEIGTH-2);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}

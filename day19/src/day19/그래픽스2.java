package day19;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

class MyFrame2 extends JFrame{
	MyPanel p = new MyPanel();
	
	public MyFrame2() {
		setSize(500,500);
		setLocation(200,200);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		add(new MyPanel2());
	}
}

class MyPanel2 extends JPanel{
	public void paintComponent(Graphics g) {
		g.setColor(Color.BLUE);
		g.fillRect(200, 200, 50, 50);
		
		g.setColor(Color.RED);
		g.fillOval(50, 200, 50, 50);
		
		g.setColor(Color.green);
		g.fillArc(150, 0, 100, 100, 90, 180);
	 
		g.setColor(Color.BLACK);
		g.setFont(new Font("굴림체", Font.BOLD, 20));
		g.drawString("Hello!", 300, 100);
		          // (문자열, x, y)
		int[] x = {400, 400, 250}; // 인덱스가 같은 것들이 한 점
		int[] y = {400, 150, 250};
		// 다각형
		g.drawPolygon(x,y,3); // (x좌표들의 배열, y좌표들의 배열, 점의 수)
		// 색상이 채워진 다각형
		g.fillPolygon(x,y,3);
	}
}

public class 그래픽스2 {
	public static void main(String[] args) {
		new MyFrame2();
	}
}

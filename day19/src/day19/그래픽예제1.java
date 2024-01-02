package day19;

import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

class MyPanel1 extends JPanel{
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawOval(100, 100, 100, 100);
		g.drawLine(150, 200, 150, 300);
		g.drawLine(150, 300, 200, 400);
		g.drawLine(150, 220, 100, 320);
		g.drawLine(150, 220, 200, 320);
	}
	
}

class MyFrame1 extends JFrame{
	public MyFrame1() {
		setSize(500,500);
		setLocation(200,200);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(new MyPanel1());
	}
}

public class 그래픽예제1 {

	public static void main(String[] args) {
		new MyFrame1();
	}

}

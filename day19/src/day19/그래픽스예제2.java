package day19;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

class MyFrame3 extends JFrame{
	MyPanel p = new MyPanel();
	
	public MyFrame3() {
		setSize(500,500);
		setLocation(200,200);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		add(new MyPanel3());
	}
}

class MyPanel3 extends JPanel{
	public void paintComponent(Graphics g) {
		g.setColor(Color.yellow);
		g.fillOval(150, 100, 200, 200);
		
		
	}
}
public class 그래픽스예제2 {

	public static void main(String[] args) {
		new MyFrame3();
	}

}

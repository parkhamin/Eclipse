package day19;

import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

// JLabel과 JPanel -> 여러가지 도형을 그리거나 이미지를 넣을 수 있음
// 그림과 관련된 클래스 -> Graphics클래스 Graphics2D, Graphics3D
class MyPanel extends JPanel{
	
	@Override
	public void paintComponent(Graphics g) {
		// JPanel의 paintComponet()메서드를 재정의
		super.paintComponent(g);
		
		// 선 그리기(x1, y1, x2, y2)
		g.drawLine(100, 100, 200, 200); // 점 2개의 x,y 좌표
		// 사각형 그리기(x, y,  width, height)
		g.drawRect(200, 200, 150, 150);
		// 원의 외접하는 사각형(x, y, width, height)
		g.drawOval(200, 200, 150, 150);
		// 외접하는 사각형의 (x, y, 가로, 세로, 시작 각도, 그리는 각도)
		g.drawArc(150, 0, 100, 100, 10, 180);
	}
	
}

class MyFrame extends JFrame{
	MyPanel p = new MyPanel();
	
	public MyFrame() {
		setSize(500,500);
		setLocation(200,200);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(p);
	}
}

public class 그래픽스1 {

	public static void main(String[] args) {
		new MyFrame();
	}

}

package day15;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;

class MyFrame1 extends JFrame{
	JPanel p = new JPanel(); // 벽지와 같은 클래스
	// 컨테이너 클래스 -> 다른 컴포넌트를 add할 수 있음
	// 컨테이너 클래스지만 프레임에 add할 수 있음
	
	public MyFrame1() {
		setSize(500,400);
		setLocation(1200,100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		add(p); // add(컴포넌트 또는 컨테이너)
		p.setBackground(Color.red);
		// Color클래스 -> 색상을 표현하기 위한 클래스
		// 색상이 상수로 지정됨
		System.out.println(Color.red);
		// red green blue 각각을 0~255값의 조합으로 색상을 지정
	}
}

public class GUI3 {

	public static void main(String[] args) {
		new MyFrame1();

	}

}

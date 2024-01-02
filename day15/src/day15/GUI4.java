package day15;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class MyFrame2 extends JFrame{
	JPanel p = new JPanel();
	JLabel l1 = new JLabel(); // 레이블 -> 텍스트를 표시하기 위한 컴포너트 클래스
	JLabel l2 = new JLabel("레이블2"); // 생성자에서 표시될 텍스트를 지정할 수 있음
	Font f = new Font("바탕체", Font.BOLD|Font.ITALIC, 30);
	// Font를 지정하는 클래스 -> 생성자(글자체, (스타일)진하게|이탤릭, 크기)
	
	public MyFrame2() {
		setSize(500,400);
		setLocation(1200,100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		add(p);
		p.setBackground(Color.CYAN);
		
		p.add(l1);
		l1.setText("레이블1"); // 레이블에 표시될 텍스트를 지정
		p.add(l2);
		l2.setForeground(Color.blue); // 글자색을 변경
		l2.setBackground(Color.white); // 배경색을 변경
		l2.setOpaque(true); // 패널과 달리 레이블은 Opaque 필드값을 true로 변경해야 배경색이 바뀜
		l2.setFont(f);
		
		String s = l1.getText();
		System.out.println(s);
	}
}

public class GUI4 {

	public static void main(String[] args) {
		new MyFrame2();
	}

}

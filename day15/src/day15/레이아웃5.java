package day15;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

// absolute Layout
// -> 컴포넌트의 크기와 위치를 프로그래머가 직접 지정

class MyFrame9 extends JFrame{
	JPanel p = new JPanel();
	JButton b1 = new JButton("동");
	JButton b2 = new JButton("서");
	JButton b3 = new JButton("남");
	
	public MyFrame9() {
		//setSize(500,400);
		//setLocation(1920-500,0);
		setBounds(10,20,500,400); // setBounds == setSize + setLocation
		    //    x  y  가로  세로
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		setLayout(null); // absolute 레이아웃으로 지정하는 방법
		
		add(b1); b1.setSize(100,50); b1.setLocation(10,50);
		add(b2); b2.setBounds(300, 100, 200, 200);
		add(b3); b3.setBounds(300, 30, 100, 50);
	}
}

public class 레이아웃5 {

	public static void main(String[] args) {
		new MyFrame9();  

	}

}

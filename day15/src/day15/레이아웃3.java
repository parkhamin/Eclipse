package day15;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

// GridLayout
// -> 행과 열의 수를 지정하여 격자무늬(바둑판)로 컴포넌트를 배치

class MyFrame7 extends JFrame{
	JButton b1 = new JButton("동");
	JButton b2 = new JButton("서");
	JButton b3 = new JButton("남");
	JButton b4 = new JButton("북");
	JButton b5 = new JButton("중앙");
	
	public MyFrame7() {
		setSize(500,400);
		setLocation(1920-500,0);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
							// 생성자(행의 수, 열의 수)
		//setLayout(new GridLayout(2,3));
		//setLayout(new GridLayout(3,2));
		//setLayout(new GridLayout(3,0)); 
		//행 또는 열의 크기만 지정하는 것도 가능
		setLayout(new GridLayout(0,3));
		
		add(b1); add(b2); add(b3); add(b4); add(b5);
	}
}

public class 레이아웃3 {
	public static void main(String[] args) {
		new MyFrame7();

	}

}

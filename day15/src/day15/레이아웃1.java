package day15;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

// Layout(배치관리자) 클래스
// -> 컴포넌트들이 컨테이너에 어떤 모양으로 위치시킬지를 지정하는 클래스
// -> Awt 패키지의 속한 클래스들을 그대로 사용

// BorderLayout
// -> 컴포넌트를 컨테이너의 동,서,남,북,중앙으로 나누어 배치
// -> 프레임의 기본 레이아웃

class MyFrame5 extends JFrame{
	JButton b1 = new JButton("동");
	JButton b2 = new JButton("서");
	JButton b3 = new JButton("남");
	JButton b4 = new JButton("북");
	JButton b5 = new JButton("중앙");
	
	public MyFrame5() {
		setSize(500,400);
		setLocation(1920-500,0);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		// 만약 위치를 지정하지 않을 경우, 기본값은 중앙
		add(b1, BorderLayout.EAST); // LINE_END
		add(b2, BorderLayout.WEST); // LINE_START
		add(b3, BorderLayout.SOUTH); //PAGE_END
		add(b4, BorderLayout.NORTH); //PAGE_START
		add(b5, BorderLayout.CENTER);
		
	}
}

public class 레이아웃1 {

	public static void main(String[] args) {
		new MyFrame5();

	}

}

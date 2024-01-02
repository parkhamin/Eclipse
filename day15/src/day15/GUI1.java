package day15;

import javax.swing.JFrame;

// CLI(Command Line Interface)
// -> 콘솔창에서 명령어를 입력해서 실행하는 프로그램 인터페이스

// GUI(Graphic User Interface)
// -> 그래픽 사용자 인터페이스
// -> 아이콘(그래픽적인 요소)과 마우스를 사용하는 프로그램 인터페이스

// AWT(Abstract Windows Toolkit)
// -> windows 운영체제의 코드를 활용한 패키지
// ex) Frame, Panel, Button, ...

// Swing
// -> 자바 자체의 코드를 활용한 패키지
// -> 클래스명 앞에 J가 붙은
// ex) JFrame, JPanel, JButton, ...

public class GUI1 {
	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(300,200);
		f.setLocation(500,100);
		
		f.setTitle("내 생의 첫 프레임");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);

	}

}

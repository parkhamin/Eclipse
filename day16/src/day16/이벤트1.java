package day16;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

// 이벤트 처리 -> 이벤트 리스너 인터페이스를 구현하는 클래스를 작성

// 이벤트 처리방법 1
// : 이벤트 리스너 인터페이스를 구현하는 클래스를 프레임 클래스와 별도로 작성
class MyListener implements ActionListener{
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton)e.getSource();
		// e.getSource() -> 이벤트가 발생한 컴포넌트의 id를 리턴
		// (컴포넌트) -> 이벤트가 발생한 컴포넌트의 클래스로 형변환
		// 컴포넌트가 다양하기 때문(ex. 버튼, 텍스트 필드, ...)
		
		b.setText("누른 후");
		b.setEnabled(false); // 버튼 비활성화
	}
}

class MyFrame1 extends JFrame{
	JButton b = new JButton("누르기 전");
	MyListener m1 = new MyListener();
	
	public MyFrame1() {
		setSize(300,200);
		setLocation(0,0);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setLayout(new FlowLayout());
		
		add(b);
		b.addActionListener(m1); // 버튼에 액션리스너 추가
	}
}

public class 이벤트1 {
	public static void main(String[] args) {
		new MyFrame1();
	}
}

package day17;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

// 이벤트 처리방법4
// : 리스너 인터페이스를 무명 클래스로 작성
// : 윈도우 빌더에서 코드를 자동 생성하는 방식

class MyFrame1 extends JFrame {
	JButton b = new JButton("누르기 전");

	public MyFrame1() {
		setSize(300, 200);
		setLocation(0, 0);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setLayout(new FlowLayout());

		add(b);

		b.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				b.setText("누른 후");
				b.setEnabled(false);
			}
		});
	}
}

public class 이벤트4 {

	public static void main(String[] args) {
		new MyFrame1();
	}

}

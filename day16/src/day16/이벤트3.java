package day16;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

// 이벤트 처리방법3
// : 컨테이너 클래스에서 직접 리스너 인터페이스를 구현

                                //1) 리스너 인터페이스 구현
class MyFrame3 extends JFrame implements ActionListener{
	JButton b = new JButton("누르기 전");

	public MyFrame3() {
		setSize(300,200);
		setLocation(0,0);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setLayout(new FlowLayout());
		
		add(b);
		//3) 컴포넌트에 리스너 add
		b.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		//2) actionPerformed()메서드에서 할 일 작성
		b.setText("누른 후");
		b.setEnabled(false);
	}
}

public class 이벤트3 {

	public static void main(String[] args) {
		new MyFrame3();

	}

}

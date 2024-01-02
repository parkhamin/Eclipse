package day16;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

// 이벤트 처리방법 1의 단점 -> 컴포넌트에 접근하기 위한 별도의 코드가 필요

// 이벤트 처리방법 2
// : 리스터 인터페이스를 컨테이너 내부 클래스로 작성
// : 별도의 클래스로 만드는 것에 비해 컴포넌트들에 접근하기가 용이

class MyFrame2 extends JFrame{
	JButton b = new JButton("누르기 전");
	MyListener m1 = new MyListener();
	
	public MyFrame2() {
		setSize(300,200);
		setLocation(0,0);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setLayout(new FlowLayout());
		
		add(b);
		//b.addActionListener(m1); // 버튼에 액션리스너 추가
		//3) 이벤트가 발생할 컴포넌트에 리스너클래스의 인스턴스를 add
		b.addActionListener(new MyListener());
	}
	//1) 리스너 인터페이스를 구현하는 클래스를 만들고
	class MyListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			//2) actionPerformed()메서드에다 이벤트 발생시 하고싶은 일들을 작성
			//JButton b = (JButton)e.getSource();

			b.setText("누른 후");
			b.setEnabled(false); // 버튼 비활성화
		}
	}
}

public class 이벤트2 {
	public static void main(String[] args) {
		new MyFrame2();
	}
}

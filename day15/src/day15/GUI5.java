package day15;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

class MyFrame3 extends JFrame{
	JPanel p = new JPanel();
	JButton b1 = new JButton(); // 클릭 이벤트를 발생하는 컴포넌트
	JButton b2 = new JButton("버튼2"); // 텍스트를 지정하는 생성자
	
	public MyFrame3() {
		setSize(500,400);
		setLocation(1200,100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		add(p);
		p.add(b1);
		b1.setText("버튼1"); // 버튼의 표시될 텍스트 지정
		p.add(b2);
		System.out.println(b2.getText());
	}
}

public class GUI5 {

	public static void main(String[] args) {
		new MyFrame3();

	}

}

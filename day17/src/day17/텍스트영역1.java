package day17;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JTextArea;

class MyFrame3 extends JFrame implements ActionListener{
	// text area : 텍스트를 여러줄 입력할 수 있는 컴포넌트
	// -> text field와 달리 Enter를 입력해도 Action 이벤트가 발생하지 않음
	JTextArea ta1 = new JTextArea(); // 기본생성자
	JTextArea ta2 = new JTextArea(10,10); // 행과 열을 지정하는 생성자
	JTextArea ta3 = new JTextArea("초기값", 10,20); // 초기에 표시될 텍스트와 행과 열을 지정하는 생성자

	public MyFrame3() {
		setSize(300, 600);
		setLocation(200, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setLayout(new FlowLayout());
		
		add(ta1); add(ta2); add(ta3);
		ta1.setColumns(20); // 열의 개수 지정
		ta1.setRows(10); // 행의 개수 지정
		System.out.println(ta3.getText());
		ta2.setText("텍스트");
		
		ta2.setEnabled(false);
		ta3.setEditable(false);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String s = ta1.getText();
	}
}

public class 텍스트영역1 {

	public static void main(String[] args) {
		new MyFrame3();
	}
}

package day17;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

class MyFrame2 extends JFrame implements ActionListener{
	// text field -> 텍스트를 입력할 수 있는 한 줄짜리 컴포넌트
	// -> 커서를 옮기고 Enter키를 치면 ActionEvent가 발생함
	JTextField tf1 = new JTextField(); // 기본생성자
	JTextField tf2 = new JTextField(20); // 열을 지정한 생성자
	JTextField tf3 = new JTextField("초기값",20); // 처음 표시될 문자열과 열을 지정
	JButton b = new JButton("버튼");
	
	public MyFrame2() {
	;	setSize(300,300);
		setLocation(200,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setLayout(new FlowLayout());
		
		add(tf1); add(tf2); add(tf3); add(b);
		tf1.setColumns(20); // 텍스트 필드의 열을 지정
		tf1.setText("텍스트"); // 텍스트 필드의 표시될 텍스트를 지정
		System.out.println(tf1.getText()); // 텍스트 필드의 작성된 텍스트를 가져옴
		//tf2.setEnabled(false);
		//tf3.setEditable(false);
		
		b.requestFocus();
		// 컴포넌트.requestFocus() -> 컴포넌트로 이벤트 포커스를 옮김.		
		tf1.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String s = tf1.getText();
	}
}

public class 텍스트필드1 {
	public static void main(String[] args) {
		new MyFrame2();
	}

}

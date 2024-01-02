package day18;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

class MyFrame1 extends JFrame implements ActionListener{
	JTextArea ta = new JTextArea(10,25);
	JButton b = new JButton("현재시간");
	Font f = new Font("굴림체",Font.BOLD,20);
	
	public MyFrame1() {
		add(ta, BorderLayout.NORTH);
		add(b, BorderLayout.SOUTH);
		
		ta.setFont(f); 
		
		setSize(300,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		ta.setEnabled(false);
		
		b.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Date d = new Date();
		SimpleDateFormat f = new SimpleDateFormat("yyyy년 MM월 dd일 E요일 H시 m분 s초");
		String s = f.format(d);
		if(ta.getText().equals("")) ta.setText(s);
		else ta.setText(ta.getText()+"\n"+s);
	}
}

public class 이벤트예제12 {

	public static void main(String[] args) {
		new MyFrame1();
	}

}

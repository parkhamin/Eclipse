package day17;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

class MyFrame5 extends JFrame implements ActionListener{
	JTextField tf = new JTextField();
	JTextArea ta = new JTextArea();
	Font f1 = new Font("consolas", Font.BOLD, 20);
	Font f2 = new Font("consolas", Font.BOLD|Font.ITALIC, 30);
	
	public MyFrame5() {
		setSize(300,300);
		setLocation(200,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		add(tf, BorderLayout.NORTH);
		add(ta, BorderLayout.CENTER);
		tf.setFont(f1);
		ta.setFont(f2);
		tf.addActionListener(this);
		ta.setEditable(false);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String a = tf.getText();
		String s = ta.getText();
		ta.setText(a+"\n"+s);
		tf.setText("");
	}
}

public class 이벤트예제8 {

	public static void main(String[] args) {
		new MyFrame5();
	}
}

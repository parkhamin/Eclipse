package day17;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

class MyFrame6 extends JFrame implements ActionListener {
	JTextField tf = new JTextField();
	JTextArea ta = new JTextArea();
	JButton b = new JButton("Save");

	Font f1 = new Font("굴림", Font.BOLD, 20);
	Font f2 = new Font("굴림", Font.BOLD | Font.ITALIC, 30);

	String path = "C:\\Users\\parkh\\Desktop\\javatest\\";

	public MyFrame6() {
		setSize(300, 300);
		setLocation(200, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);

		add(tf, BorderLayout.NORTH);
		add(ta, BorderLayout.CENTER);
		add(b, BorderLayout.SOUTH);
		tf.setFont(f1);
		ta.setFont(f2);
		b.setFont(f1);
		b.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		b.setEnabled(false);
		tf.setEnabled(false);
		ta.setEnabled(false);

		String fname = path + tf.getText() + ".txt";
		try {
			FileWriter fw = new FileWriter(fname);
			PrintWriter pw = new PrintWriter(fw);
			pw.println(ta.getText());
			pw.close();
		} catch (IOException e1) {
			System.out.println("저장실패");
		}
	}
}

public class 이벤트예제9 {
	public static void main(String[] args) {
		new MyFrame6();
	}
}

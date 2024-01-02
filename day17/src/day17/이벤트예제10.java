package day17;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.StringTokenizer;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

class MyFrame7 extends JFrame implements ActionListener {
	JLabel l = new JLabel("금지단어");
	JTextField tf1 = new JTextField(19);
	JTextField tf2 = new JTextField(25);
	JTextArea ta = new JTextArea(12, 25);
	Font f = new Font("굴림체", Font.BOLD, 15);
	ArrayList<String> al = new ArrayList<String>();

	public MyFrame7() {
		setSize(300, 500);
		setLocation(200, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setLayout(new FlowLayout());
		add(l); add(tf1); add(tf2); add(ta);
		l.setFont(f); tf1.setFont(f); tf2.setFont(f); ta.setFont(f);
		ta.setEditable(false);
		
		tf2.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String s = tf1.getText();
		StringTokenizer st = new StringTokenizer(s, ", ");
		while (st.hasMoreTokens())
			al.add(st.nextToken());
		
		String b = ta.getText();
		String a = tf2.getText();
		if(al.contains(a)) a="금지단어입니다.";
		
		if(b.equals("")) ta.setText(a);
		else	ta.setText(b+"\n"+a);
		
		tf2.setText("");
	}
}

public class 이벤트예제10 {
	public static void main(String[] args) {
		new MyFrame7();
	}
}

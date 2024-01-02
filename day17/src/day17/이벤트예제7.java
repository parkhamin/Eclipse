package day17;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

class MyFrame4 extends JFrame{
	JTextField tf1 = new JTextField(20);
	JTextField tf2 = new JTextField(20);
	JTextField tf3 = new JTextField(20);
	JTextField tf4 = new JTextField(20);
	JButton b =new JButton("합치기");
	
	public MyFrame4() {
		setSize(300,300);
		setLocation(200,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setLayout(new FlowLayout());
		
		add(tf1); add(tf2); add(tf3); add(b); add(tf4);
		tf4.setEditable(false);
		
		b.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String s1 = tf1.getText();
				String s2 = tf2.getText();
				String s3 = tf3.getText();
				tf4.setText(s1+" "+s2+" "+s3);
				tf1.setText("");
				tf2.setText("");
				tf3.setText("");
			}
		});
	}
}

public class 이벤트예제7 {

	public static void main(String[] args) {
		new MyFrame4();
	}

}

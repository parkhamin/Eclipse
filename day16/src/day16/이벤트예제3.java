package day16;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

class MyFrame5 extends JFrame implements ActionListener{
	JButton b = new JButton("0");
	JPanel p = new JPanel();
	
	public MyFrame5() {
		add(p);
		p.add(b);
		setSize(300,300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//b.setFont(new Font("굴림체",Font.BOLD,30));
		b.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String a = b.getText();
		int c = Integer.parseInt(a);
		c++;
		a = c+"";
		b.setText(a);
	}
}
public class 이벤트예제3 {

	public static void main(String[] args) {
		new MyFrame5();

	}

}

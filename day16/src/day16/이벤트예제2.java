package day16;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

class MyFrame4 extends JFrame implements ActionListener {
	JPanel p = new JPanel();
	JButton b1 = new JButton("Red");
	JButton b2 = new JButton("Blue");
	JButton b3 = new JButton("Yellow");

	public MyFrame4() {
		p.add(b1);
		p.add(b2);
		p.add(b3);
		add(p);

		setSize(300, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == b1)
			p.setBackground(Color.red);
		if (e.getSource() == b2)
			p.setBackground(Color.blue);
		if (e.getSource() == b3)
			p.setBackground(Color.yellow);

	}
}

public class 이벤트예제2 {

	public static void main(String[] args) {
		new MyFrame4();

	}

}

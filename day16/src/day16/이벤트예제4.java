package day16;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

class MyFrame6 extends JFrame implements ActionListener {

	JLabel l = new JLabel("0");
	JButton b1 = new JButton("+");
	JButton b2 = new JButton("-");

	public MyFrame6() {
		setLayout(new FlowLayout());
		add(l);
		add(b1);
		add(b2);
		setSize(300, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		b1.addActionListener(this);
		b2.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		int a = Integer.parseInt(l.getText());
		if (e.getSource() == b1)
			l.setText((a + 1) + "");
		if (e.getSource() == b2)
			l.setText((a - 1) + "");
	}

}

public class 이벤트예제4 {
	public static void main(String[] args) {
		new MyFrame6();
	}
}

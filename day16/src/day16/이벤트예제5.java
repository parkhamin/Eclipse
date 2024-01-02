package day16;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;

class MyFrame7 extends JFrame implements ActionListener {
	JButton b1 = new JButton("크게");
	JButton b2 = new JButton("작게");
	JButton b3 = new JButton("이동");

	public MyFrame7() {
		add(b1);
		add(b2);
		add(b3);
		setLayout(new FlowLayout());
		setSize(500, 500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == b1) {
			int a = this.getWidth() * 2;
			int b = this.getHeight() * 2;
			this.setSize(a, b);
		}
		if (e.getSource() == b2) {
			int a = this.getWidth() / 2;
			int b = this.getHeight() / 2;
			this.setSize(a, b);
		}
		if (e.getSource() == b3) {
			// 1920x1080
			Random r = new Random();
			int x = r.nextInt(1920-this.getWidth());
			int y = r.nextInt(1080-this.getHeight());
			this.setLocation(x,y);
		}
	}
}

public class 이벤트예제5 {
	public static void main(String[] args) {
		new MyFrame7();
	}

}

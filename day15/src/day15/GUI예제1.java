package day15;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class MyFrame4 extends JFrame {
	JPanel p = new JPanel();
	JLabel l = new JLabel("어제의 실패와 내일의 성공 사이에는 오늘의 기회가 있다.");
	JButton b = new JButton("change");

	public MyFrame4() {
		setSize(1000, 500);
		// 1920x1080
		setLocation((1920 - 1000) / 2, (1080 - 500) / 2);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);

		p.add(l);
		p.add(b);
		add(p);

		p.setBackground(Color.cyan);
		l.setFont(new Font("바탕체", Font.BOLD, 30));
		l.setForeground(Color.white);
		
	}
}

public class GUI예제1 {

	public static void main(String[] args) {
		new MyFrame4();

	}

}

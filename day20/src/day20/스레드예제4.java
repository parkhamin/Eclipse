package day20;

import java.awt.Color;
import java.awt.Font;
import java.util.Calendar;

import javax.swing.JFrame;
import javax.swing.JLabel;

class MyFrame2 extends JFrame {
	JLabel l = new JLabel("00:00:00");

	public MyFrame2() {
		setSize(800, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setLayout(null);
		add(l);
		l.setBounds(50, 50, 700, 200);
		l.setBackground(Color.black);
		l.setOpaque(true);

		l.setForeground(Color.green);
		l.setFont(new Font("굴림체", Font.BOLD, 100));
		l.setVerticalAlignment(JLabel.CENTER); // 세로방향으로 가운데 정령
		l.setHorizontalAlignment(JLabel.CENTER);
		
		
		new MyThread().start();
	}

	class MyThread extends Thread {
		@Override
		public void run() {
			while (true) {
				Calendar ca = Calendar.getInstance();
				String apm = ca.get(Calendar.AM_PM) == 1 ? "오후" : "오전";
				int h = ca.get(Calendar.HOUR);
				int m = ca.get(Calendar.MINUTE);
				int s = ca.get(Calendar.SECOND);

				String time = String.format("%s %2d:%02d:%02d", apm, h, m, s);
				l.setText(time);
				
				try {
					sleep(1000);
				} catch (InterruptedException e) {
				}
			}
		}
	}
}

public class 스레드예제4 {
	public static void main(String[] args) {
		new MyFrame2();
	}
}

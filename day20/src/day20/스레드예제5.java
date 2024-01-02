package day20;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

class MyFrame3 extends JFrame implements ActionListener {
	JButton start = new JButton("START");
	JButton stop = new JButton("STOP");
	JButton reset = new JButton("RESET");
	JLabel l = new JLabel("00:00:00");
	MyThread th;
	int ms=0, sec=0, min=0;

	public MyFrame3() {
		setSize(800, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setLayout(null);
		add(start);
		start.setBounds(650, 10, 100, 30);
		add(stop);
		stop.setBounds(550, 10, 100, 30);
		add(reset);
		reset.setBounds(450, 10, 100, 30);
		add(l);
		l.setBounds(50, 50, 700, 200);
		l.setBackground(Color.black);
		l.setOpaque(true);
		l.setForeground(Color.green);
		l.setFont(new Font("굴림체", Font.BOLD, 120));
		l.setHorizontalAlignment(JLabel.CENTER);
		l.setVerticalAlignment(JLabel.CENTER);
		
		stop.setEnabled(false);
		reset.setEnabled(false);
		
		start.addActionListener(this);
		stop.addActionListener(this);
		reset.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton) e.getSource();
		if (b == start) {
			th = new MyThread();
			th.start();
			start.setEnabled(false);
			stop.setEnabled(true);
		}
		if (b == stop) {
			th.stop();
			start.setEnabled(false);
			reset.setEnabled(true);
		}
		if (b == reset) {
			ms = sec = min = 0;
			String s = String.format("%02d:%02d.%02d", min,sec,ms);
			l.setText(s);
			
			start.setEnabled(true);
			reset.setEnabled(false);
		}
	}
	class MyThread extends Thread{
		@Override
		public void run() {
			while(true) {
				ms++;
				if(ms==100) {
					sec++; ms=0;
				}
				if(sec==60) {
					min++; sec =0;
				}
				if(min == 60) {
					min=0;
				}
				String s = String.format("%02d:%02d.%02d", min,sec,ms);
				l.setText(s);
				try {
					sleep(10);
				} catch (InterruptedException e) {
					
				}
			}
		}
	}
}

public class 스레드예제5 {
	public static void main(String[] args) {
		new MyFrame3();
	}
}

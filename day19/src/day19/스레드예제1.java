package day19;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

class MyFrame8 extends JFrame implements Runnable, ActionListener{
	JLabel l = new JLabel();
	JButton start = new JButton("start");
	JButton stop = new JButton("stop");
	int x= 10; // 레이블의 x좌표
	Thread th;
	
	public MyFrame8() {
		setSize(500,200);
		setLocation(300,100);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLayout(null);
		add(start); start.setBounds(10, 10, 80, 30); 
		add(stop); stop.setBounds(95, 10, 80, 30);
		add(l); l.setBounds(10, 100, 50, 50);
		l.setBackground(Color.BLUE);
		l.setOpaque(true);
		
		start.addActionListener(this);
		stop.addActionListener(this);
	}

	@Override
	public void run() {
		while(true) {
			x+=20;
			l.setLocation(x,100);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
			}
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==start) {
			th = new Thread(this);
			th.start();
		}
		if(e.getSource()==stop) th.stop();
	}
}

public class 스레드예제1 {
	public static void main(String[] args) {
		new MyFrame8();
	}

}

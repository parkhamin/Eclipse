package day20;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

class MyFrame extends JFrame implements MouseListener{
	JLabel l1 = new JLabel();
	JLabel l2 = new JLabel();
	int l1_x = 0; int l2_x =0;
	int l1_y = 20; int l2_y = 80;
	
	
	
	public MyFrame() {
		setSize(600,200);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLayout(null);
		add(l1); add(l2);
		l1.setBounds(0, 20, 50, 50);
		l2.setBounds(0, 80, 50, 50);
		
		l1.setBackground(Color.red);
		l2.setBackground(Color.blue);
		l1.setOpaque(true);
		l2.setOpaque(true);
		
		l1.addMouseListener(this);
		l2.addMouseListener(this);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		if(e.getSource()==l1) {
			MyThread1 th1 = new MyThread1();
			th1.start();
		}
		if(e.getSource()==l2) {
			MyThread2 th2 = new MyThread2();
			th2.start();
		}
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	// 스레드를 만드는 방법
	// 1) Thread 클래스를 상속하는 클래스 작성
	//    (또는 Runnable 인터페이스를 구현하는 클래스 작성)
	// 2) run() 메서드에 하고 싶은 일 작성
	// 3) 내가 만든 Thread 클래스의 인스턴스 생성
	// 4) 인스턴스.start() 호출
	class MyThread1 extends Thread{
		@Override
		public void run() {
			while(l1_x<500) {
				l1_x += 10;
				l1.setLocation(l1_x,l1_y);
				try {
					sleep(300);
				} catch (InterruptedException e) {
				
				}
			}
		}
	}
	class MyThread2 extends Thread{
		@Override
		public void run() {
			while(l2_x<500) {
				l2_x += 10;
				l2.setLocation(l2_x,l2_y);
				try {
					sleep(300);
				} catch (InterruptedException e) {
				
				}
			}
		}
	}
}

public class 스레드예제2 {
	public static void main(String[] args) {
		new MyFrame();
	}
}

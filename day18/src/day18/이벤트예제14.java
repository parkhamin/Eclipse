package day18;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

class MyFrame4 extends JFrame implements MouseListener{
	JPanel p = new JPanel();
	int count=0;
	
	public MyFrame4() {
		setSize(300,200);
		setLocation(300,100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		add(p);
		p.setBackground(Color.white);
		this.addMouseListener(this);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
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
		count++;
		p.setBackground(Color.white);
	}

	@Override
	public void mouseExited(MouseEvent e) {
		Color c=null;
		if(count%3==1) c = Color.red;
		if(count%3==2) c = Color.blue;
		if(count%3==0) c = Color.yellow;
		p.setBackground(c);
	}
}

public class 이벤트예제14 {

	public static void main(String[] args) {
		new MyFrame4();
	}

}

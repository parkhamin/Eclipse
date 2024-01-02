package day18;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

class MyFrame7 extends JFrame implements ActionListener, KeyListener {
	JPanel p = new JPanel();
	JButton up = new JButton("▲");
	JButton down = new JButton("▼");
	JButton left = new JButton("◀");
	JButton right = new JButton("▶");
	int x = 220, y=220;
	int bwidth=50, bheight=50;
	
	public MyFrame7() {
		setSize(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setLocation(300,100);
		
		setLayout(null);
		add(p);
		p.setBounds(x, y, 30, 30);
		p.setBackground(Color.black);
		
		add(up); add(down); add(left); add(right);
		
		up.setBounds(370,  250, bwidth, bheight);
		down.setBounds(370,  350, bwidth, bheight);
		left.setBounds(320,  300, bwidth, bheight);
		right.setBounds(420,  300, bwidth, bheight);
		
		this.addKeyListener(this);
		up.addActionListener(this);
		down.addActionListener(this);
		left.addActionListener(this);
		right.addActionListener(this);
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		int keycode = e.getKeyCode();
		switch (keycode) {
		case KeyEvent.VK_UP: y -= 30; break;
		case KeyEvent.VK_DOWN: y += 30; break;
		case KeyEvent.VK_LEFT: x += 30; break;
		case KeyEvent.VK_RIGHT: x -= 30; break;
		}
		p.setLocation(x,y);
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton)e.getSource();
		if(b==up) y -=30;
		if(b==down) y+=30;
		if(b==right) x+=30;
		if(b==left) x-=30;
		p.setLocation(x,y);
		this.requestFocus(); // 프레임으로 포커스를 이동
	}
}

public class 이벤트예제15 {

	public static void main(String[] args) {
		new MyFrame7();
	}
}

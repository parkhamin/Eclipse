package day16;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class MyFrame extends JFrame implements ActionListener{
	JPanel p = new JPanel();
	JLabel l = new JLabel();
	JButton b1 = new JButton("▲");
	JButton b2 = new JButton("▶");
	JButton b3 = new JButton("◀");
	JButton b4 = new JButton("▼");
	int x=150;
	int y=150;
	
	public MyFrame() {
		setSize(500,500);
		setLocation(0,0);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		setLayout(new BorderLayout());
		add(p, BorderLayout.CENTER);
		add(b1, BorderLayout.NORTH);
		add(b2, BorderLayout.EAST);
		add(b3, BorderLayout.WEST);
		add(b4, BorderLayout.SOUTH);
		p.add(l);
		p.setLayout(null);
		l.setBounds(150, 150, 50, 50);
		l.setBackground(Color.BLUE);
		l.setOpaque(true);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton b =(JButton)e.getSource();
		if(b == b1 ) y = y-10;
		if(b == b2 ) x = x+10;
		if(b == b3 ) x = x-10;
		if(b == b4 ) y = y+10;
		l.setLocation(x,y);
	}
}

public class GUI6 {

	public static void main(String[] args) {
		new MyFrame();
	}

}

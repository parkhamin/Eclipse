package day21;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

class MyFrame6 extends JFrame implements ActionListener{
	JMenuBar mb = new JMenuBar(); // 메뉴바 -> 메뉴가 표시될 막대기
	
	JMenu m1 = new JMenu("파일"); // 메뉴
	JMenu m2 = new JMenu("편집");
	JMenu m3 = new JMenu("소스");
	
	JMenuItem item1= new JMenuItem("새로 만들기"); // 메뉴 속에 포함될 항목
	JMenuItem item2= new JMenuItem("파일 열기");
	
	JPanel p = new JPanel();
	
	public MyFrame6(){
		setSize(400,300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		add(mb, BorderLayout.NORTH); 
		mb.add(m1); mb.add(m2); mb.add(m3);
		
		m1.add(item1); m1.add(item2);
		
		add(p, BorderLayout.CENTER);
		
		item1.addActionListener(this); // 메뉴 아이템에 리스너 추가
		item2.addActionListener(this); // 메뉴바나 메뉴에 추가하지 말 것
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == item1) p.setBackground(Color.blue);
		if(e.getSource() == item2) p.setBackground(Color.red);
	}
}
public class 메뉴바1 {
	public static void main(String[] args) {
		new MyFrame6();
	}
}

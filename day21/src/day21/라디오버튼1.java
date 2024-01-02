package day21;

import java.awt.Color;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

class MyFrame3 extends JFrame implements ItemListener{
	JPanel p = new JPanel();
	JRadioButton ra1 = new JRadioButton(); // 기본생성자
	JRadioButton ra2 = new JRadioButton("blue"); // 텍스트를 지정하는 생성자
	JRadioButton ra3 = new JRadioButton("yellow", true); // 처음에 선택
	
	ButtonGroup bg = new ButtonGroup(); // 라디오 버튼 그룹
	
	public MyFrame3() {
		setSize(300,200);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		add(p);
		
		ra1.setText("red");
		bg.add(ra1); bg.add(ra2); bg.add(ra3);
		
		p.add(ra1); p.add(ra2); p.add(ra3);
		
		ra1.addItemListener(this);
		ra2.addItemListener(this);
		ra3.addItemListener(this);
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		// 선택되었으면 true 리턴
		if(ra1.isSelected() ) p.setBackground(Color.red);
		if(ra2.isSelected() ) p.setBackground(Color.blue);
		if(ra3.isSelected() ) p.setBackground(Color.yellow);
	}
}

public class 라디오버튼1 {
	public static void main(String[] args) {
		new MyFrame3();
	}
}

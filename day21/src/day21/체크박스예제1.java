package day21;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

class MyFrame2 extends JFrame implements ItemListener{
	JPanel p = new JPanel();
	JCheckBox ch1 = new JCheckBox("사과"); // 기본생성자
	JCheckBox ch2 = new JCheckBox("바나나"); // 표시될 텍스트를 지정하는 생성자
	JCheckBox ch3 = new JCheckBox("체리");
	JCheckBox ch4 = new JCheckBox("오렌지");
	JCheckBox ch5 = new JCheckBox("포도");
	JCheckBox ch6 = new JCheckBox("배");
	JTextArea ta = new JTextArea();
	
	public MyFrame2() {
		setSize(300,200);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		add(p);
		p.add(ch1); p.add(ch2); p.add(ch3); p.add(ch4); p.add(ch5); p.add(ch6);
		p.add(ta);
		ch1.addItemListener(this);
		ch2.addItemListener(this);
		ch3.addItemListener(this);
		ch4.addItemListener(this);
		ch5.addItemListener(this);
		ch6.addItemListener(this);
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		
	}
}

public class 체크박스예제1 {
	public static void main(String[] args) {
		new MyFrame2();
	}
}


package day21;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

class MyFrame1 extends JFrame implements ItemListener{
	JPanel p = new JPanel();
	JCheckBox ch1 = new JCheckBox(); // 기본생성자
	JCheckBox ch2 = new JCheckBox("blue"); // 표시될 텍스트를 지정하는 생성자
	JCheckBox ch3 = new JCheckBox("yellow");
	JTextArea ta = new JTextArea();
	
	public MyFrame1() {
		setSize(300,200);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		add(p);
		p.add(ch1); p.add(ch2); p.add(ch3);
		ch1.setText("red");
		p.add(ta);
		ch1.addItemListener(this);
		ch2.addItemListener(this);
		ch3.addItemListener(this);
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		String s = "";
		   // 이벤트가 발생한 컴포넌트를 확인하는 메서드
		if(e.getSource()==ch1) {
			if(e.getStateChange()==1) s = s+"\n"+"red 선택";
			   // 체크박스가 체크가 되면 1을 리턴
			ta.setText(s);
		}
		if(e.getSource()==ch2) {
			if(e.getStateChange()==1) s = s+"\n"+"blue 선택";
			   // 체크박스가 체크가 되면 1을 리턴
			ta.setText(s);
		}
		if(e.getSource()==ch3) {
			if(e.getStateChange()==1) s = s+"\n"+"yellow 선택";
			   // 체크박스가 체크가 되면 1을 리턴
			ta.setText(s);
		}
	}
}

public class 체크박스1 {
	public static void main(String[] args) {
		new MyFrame1();
	}
}

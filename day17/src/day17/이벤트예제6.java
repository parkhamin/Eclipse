package day17;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

//1) 리스너 클래스를 프레임 클래스와 별도로 작성
//2) 리스너 클래스를 프레임 클래스의 낸부 클래스로 작성
//3) 프레임 클래스가 리스너 인터페이스를 직접 구현
class MyFrame0 extends JFrame{
	JPanel p = new JPanel();
	JButton b = new JButton("change");
	int count = 0;
	
	public MyFrame0() {
		setSize(300,300);
		setLocation(200,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		add(p);
		p.add(b);
		b.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==b) count++;
				if(count%3 ==1) p.setBackground(Color.RED);
				if(count%3 ==2) p.setBackground(Color.BLUE);
				if(count%3 ==0) p.setBackground(Color.YELLOW);
				
			}
			
		});
	}
	// 이벤트가 발생했을 때 자동으로 호출(call)되는 메서드 -> call back(콜백) 메서드
	
}

public class 이벤트예제6 {

	public static void main(String[] args) {
		new MyFrame0();

	}

}

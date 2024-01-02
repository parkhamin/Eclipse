package day15;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
// BoxLayout
// -> FlowLayout과 같이 가로방향으로 나열할 수도 있고, 세로방향으로 나열할 수 있는 레이아웃
// -> 프레임의 레이아웃으로 지정할 수는 없고, 패널의 레이아웃으로만 지정가능

class MyFrame8 extends JFrame{
	JPanel p = new JPanel();
	JButton b1 = new JButton("동");
	JButton b2 = new JButton("서");
	JButton b3 = new JButton("남");
	JButton b4 = new JButton("북");
	JButton b5 = new JButton("중앙");
	
	public MyFrame8() {
		setSize(500,400);
		setLocation(1920-500,0);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
		this.add(p);       // .BoxLayout(패널명, 방향지정)
		//p.setLayout(new BoxLayout(p, BoxLayout.X_AXIS)); // LINE_AXIS
		p.setLayout(new BoxLayout(p, BoxLayout.Y_AXIS)); // PAGE_AXIS
		
		p.add(b1); p.add(b2); p.add(b3); p.add(b4); p.add(b5);
		
	}
}

public class 레이아웃4 {

	public static void main(String[] args) {
		new MyFrame8();
	}

}

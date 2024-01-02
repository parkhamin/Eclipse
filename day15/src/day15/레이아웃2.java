package day15;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

// FlowLayout
// -> 컴포넌트를 일렬렬로 add한 순서대로 나열하며 배치
// -> 가운데, 왼쪼그 오른쪽 정렬이 가능
// -> Panel의 기본 레이아웃

class MyFrame6 extends JFrame {
	JPanel p = new JPanel();
	JButton b1 = new JButton("동");
	JButton b2 = new JButton("서");
	JButton b3 = new JButton("남");
	JButton b4 = new JButton("북");
	JButton b5 = new JButton("중앙");

	public MyFrame6() {
		setSize(500,400);
		setLocation(1920-500,0);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		// setLayout(레이아웃 클래스의 인스턴스)
		// -> 컨테이너의 레이아웃을 지정
		//setLayout(new FlowLayout());
		//setLayout(new FlowLayout(FlowLayout.CENTER));
		// 가운데로 정렬(기본값)
		//setLayout(new FlowLayout(FlowLayout.LEFT)); // LEADING
		// 오른쪽으로 정렬
		setLayout(new FlowLayout(FlowLayout.RIGHT)); // TRAILING
		
		add(b1); add(b2); add(b3); add(b4); add(b5);
		
		//add(p);
		//p.add(b1); p.add(b2); p.add(b3); p.add(b4); p.add(b5);
	}
}

public class 레이아웃2 {

	public static void main(String[] args) {
		new MyFrame6();

	}

}

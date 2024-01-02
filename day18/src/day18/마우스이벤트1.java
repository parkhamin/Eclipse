package day18;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

// 마우스이벤트 -> MouseListener 인터페이스를 구현
// 마우스 버튼 클릭했을 때 -> mouseClicked()
// 마우스 버튼 누르고 있을 때 -> mousePressed()
// 마우스 버튼 눌렀다 뗄 때 -> mouseReleased()
// 마우스 포인트가 컨테이너 영역 안으로 들어갔을 때 -> mouseEntered()
// 마우스 포인트가 컨테이너 영역 밖으로 나갔을 때 -> mouseExited()

class MyFrame3 extends JFrame implements MouseListener{
	JPanel p = new JPanel();
	JLabel l = new JLabel();
	
	public MyFrame3() {
		setSize(500,500);
		setLocation(200,100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		setLayout(null);
		add(p);
		add(l);
		p.setBounds(220, 220, 30, 30);
		p.setBackground(Color.black);
		l.setBounds(350, 20, 100, 30);
		
		this.addMouseListener(this);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		int x = e.getX(); // 마우스의 위치 x좌표를 반환
		int y = e.getY(); // 마우스의 위치 y좌표를 반환
		l.setText("x="+x+" ,y="+y);
		p.setLocation(x-20, y-40);
	
	}

	@Override
	public void mousePressed(MouseEvent e) {
		p.setBackground(Color.RED);
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		p.setBackground(Color.BLACK);
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		p.setSize(50,50);
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		p.setSize(10,10);
	}
}

public class 마우스이벤트1 {

	public static void main(String[] args) {
		new MyFrame3();
	}

}

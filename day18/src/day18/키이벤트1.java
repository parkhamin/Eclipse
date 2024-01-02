package day18;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

// 액션이벤트 -> ActionListener
// 마우스이벤트 -> MouseListener
// 키 -> KeyListener
// KeyTyped() -> 어떤 키가 눌렸는지에 따라서 할 일 작성
// KeyPressed() -> 키를 누르고 있을 때 할 일 작성
// KeyRealesed() -> 키를 눌렀다 뗐을 때 할 일 작성

class MyFrame5 extends JFrame implements KeyListener {
	JPanel p = new JPanel();
	int x = 220;
	int y = 220; // 패널의 좌표를 저장할 필드

	public MyFrame5() {
		setSize(500, 500);
		setLocation(200, 100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);

		setLayout(null);
		add(p);
		p.setBounds(x, y, 30, 30);
		p.setBackground(Color.black);
		this.addKeyListener(this);
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// keyTyped()에서는 키코드 사용불가 -> 유니코드가 있는 키만 처리가능
		char key = e.getKeyChar(); // 키의 유니코드를 리턴
		System.out.println(key+" "+ (key+0));
		switch(key) {
		case '8': y-= 20;
		case '2': y+= 20;
		case '6': x+= 20;
		case '4': x-= 20;
		}
		p.setLocation(x,y);
	}

	@Override
	public void keyPressed(KeyEvent e) {
		int key = e.getKeyCode(); // 키의 코드(상수값)를 리턴
		System.out.println(key);
		switch (key) {
		case KeyEvent.VK_UP:
			y -= 20;
			break;
		case KeyEvent.VK_DOWN:
			y += 20;
			break;
		case KeyEvent.VK_RIGHT:
			x += 20;
			break;
		case KeyEvent.VK_LEFT:
			x -= 20;
			break;
		}
		p.setLocation(x, y);
	}

	@Override
	public void keyReleased(KeyEvent e) {
		int key = e.getKeyCode();
		System.out.println(key);
		switch (key) {
		case KeyEvent.VK_W:
			y -= 20;
			break;
		case KeyEvent.VK_S:
			y += 20;
			break;
		case KeyEvent.VK_D:
			x += 20;
			break;
		case KeyEvent.VK_A:
			x -= 20;
			break;
		}
		p.setLocation(x, y);
	}
}

public class 키이벤트1 {

	public static void main(String[] args) {
		new MyFrame5();
	}

}

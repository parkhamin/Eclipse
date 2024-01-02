package day18;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JTextArea;

class MyFrame6 extends JFrame implements KeyListener{
	JTextArea ta = new JTextArea();

	public MyFrame6() {
		setSize(500, 500);
		setLocation(200, 100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		add(ta);
		ta.addKeyListener(this);

	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		int key = e.getKeyCode();
		char keychar =e.getKeyChar();
		
		System.out.println("Alt키: "+e.isAltDown());
		System.out.println("Ctrl키: "+e.isControlDown());
		System.out.println("Shift키: "+e.isShiftDown());
		System.out.println(key+" "+keychar);
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}

public class 키이벤트2 {
	public static void main(String[] args) {
		new MyFrame6();
	}
}

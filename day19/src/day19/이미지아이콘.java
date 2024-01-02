package day19;

import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

class MyFrame5 extends JFrame{
	String path= "C:\\Users\\parkh\\Desktop\\javatest\\룽지.jpg";
	ImageIcon icon = new ImageIcon(path);
	// ImageIcon클래스를 사용하여 레이블에 이미지를 넣을 수 있음
	// 단, 레이블 크기를 실제 이미지보다 작게 할 경우, 이미지가 잘림,
	
	JLabel l1 = new JLabel();
	JLabel l2 = new JLabel(icon);
	
	
	public MyFrame5() {
		setSize(500,500);
		setLocation(200,200);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		
		l1.setIcon(icon);
		
		add(l1); l1.setBounds(0,0,200,200);
		add(l2); l2.setBounds(0,250,300,200);
	}
}
public class 이미지아이콘 {

	public static void main(String[] args) {
		new MyFrame5();
	}

}

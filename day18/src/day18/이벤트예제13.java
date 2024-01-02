package day18;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

class MyFrame2 extends JFrame implements ActionListener{
	JTextArea ta = new JTextArea();
	JButton b = new JButton("현재시간으로 저장");
	Font f = new Font("굴림체",Font.BOLD,20);
	
	public MyFrame2() {
		add(ta, BorderLayout.NORTH);
		add(b, BorderLayout.SOUTH);
		
		ta.setFont(f); 
		b.setFont(f);
		setSize(300,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		b.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String path = "C:\\Users\\parkh\\Desktop\\javatest\\";
		Date d = new Date();
		SimpleDateFormat f = new SimpleDateFormat("yyyy년MM월dd일E요일H시");
		String filename = f.format(d)+".txt";
		try {
			FileWriter fw = new FileWriter(path+filename);
			fw.write(ta.getText());
			fw.close();
		}catch(IOException el){
			System.out.println("저장실패");
		}
	}
}
public class 이벤트예제13 {

	public static void main(String[] args) {
		new MyFrame2();
	}

}

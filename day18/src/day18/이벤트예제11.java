package day18;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

class MyFrame extends JFrame{
	JTextField tf = new JTextField();
	JTextArea ta = new JTextArea();
	String path ="C:\\Users\\parkh\\Desktop\\javatest\\";
	ArrayList<String> al = new ArrayList<String>();
	
	public MyFrame() {
		setSize(500,500);
		setLocation(200,100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		add(tf, BorderLayout.NORTH);
		add(ta, BorderLayout.CENTER);
		
		ta.setEditable(false);
		tf.requestFocus();
		try {filetolist();}
		catch(IOException e) {System.out.println("불러오기 실패");}
		
		tf.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String a = ta.getText();
				String b = tf.getText();
				if(al.contains(b)) b = "금지단어입니다";
				
				if(a.equals("")) ta.setText(b);
				else	ta.setText(b+"\n"+a);
				tf.setText("");
			}
		});
	}
	
	void filetolist() throws IOException{
		FileReader fr =new FileReader(path);
		BufferedReader br = new BufferedReader(fr);
		Scanner in = new Scanner(br);
		//while(fin.hasNext()) 
	}
}
public class 이벤트예제11 {

	public static void main(String[] args) {
		new MyFrame();

	}

}

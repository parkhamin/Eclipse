package day19;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

class MyFrame4 extends JFrame{
	MyPanel p = new MyPanel();
	
	public MyFrame4() {
		setSize(500,500);
		setLocation(200,200);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		add(new MyPanel4());
	}
}

class MyPanel4 extends JPanel{
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		String path= "C:\\Users\\parkh\\Desktop\\javatest\\룽지.jpg";
		
		File file = new File(path); // 1) 파일 인스턴스를 생성
		BufferedImage img = null;
		try {
			img = ImageIO.read(file); // 2) 버퍼드 이미지 인스턴스 생성
		}catch(IOException e) {
			System.out.println("이미지 불러오기 실패");
		}
		//g.drawImage(img, 10, 10, null); // 이미지 원본크기로 크기 지정
		g.drawImage(img, 10, 10, 400, 300, this);
		// (버퍼드이미지인스턴스, x, y, 가로길이, 세로길이, null 또는 this)
	}
}
public class 그래픽스3 {
	public static void main(String[] args) {
		new MyFrame4();
	}

}

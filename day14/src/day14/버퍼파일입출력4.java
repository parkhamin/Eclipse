package day14;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class 버퍼파일입출력4 {

	public static void main(String[] args) throws IOException {
		String path = "C:\\Users\\parkh\\Desktop\\javatest\\";
		
		FileWriter fw = new FileWriter(path+"c.txt"); // 문자 문자열은 write
		PrintWriter pw = new PrintWriter(fw);
		// 버퍼를 이용한 텍스트파일 출력 클래스
		// 생성자의 인자로 FileWriter의 인스턴스를 기입
		
		pw.print("홍길동");
		pw.println(30);
		pw.println(180.5);
		
		pw.printf("%s %d %.1f\n", "홍길서", 25, 176.4);
		
		pw.close();
		

	}

}

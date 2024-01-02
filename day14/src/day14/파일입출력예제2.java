package day14;

import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class 파일입출력예제2 {

	public static void main(String[] args) {
		String path = "C:\\Users\\parkh\\Desktop\\javatest";
		String s = "";
		try {
			FileReader fr = new FileReader(path+"홍길동.txt");
			while(true) {
				int ch = fr.read();
				if(ch==-1) break;
				s = s + (char)ch;
			}
			
		} catch (IOException e) {
			System.out.println("파일 읽기 실패");
		}
		System.out.println(s);
		StringTokenizer st = new StringTokenizer(s);
		System.out.println("이름: "+st.nextToken());
		System.out.println("전화: "+st.nextToken());
		System.out.println("나이: "+st.nextToken());
		
		
		
	}

}

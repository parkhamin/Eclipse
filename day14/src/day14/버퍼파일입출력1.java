package day14;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

// bufferS

public class 버퍼파일입출력1 {

	public static void main(String[] args) throws IOException {
		String path = "C:\\Users\\parkh\\Desktop\\javatest\\";
		FileReader fr = new FileReader(path+"a.txt");
		BufferedReader br = new BufferedReader(fr);
		// FileReader로 스트림 생성 후
		// FileReader의 인스턴스를 BufferedReader의 생성자의 인자로 함

		while(true) {
			String s = br.readLine(); // 파일에서 한 줄씩 읽어와 문자열을 리턴
			if(s==null) break;
			System.out.println(s); // 더 이상 읽어올 라인이 없을 경우 null을 리턴
		}
		fr.close();
	}
}

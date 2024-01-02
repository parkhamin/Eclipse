package day13;

import java.io.FileWriter;
import java.io.IOException;

// 텍스트 파일 입출력 -> .txt 텍스트파일에서 유니코드를 읽어오거나 쓰는 것
// 바이너리(일반) 파일 입출력 -> 이미지, 음악 등 이진수를 읽고 쓰는 것

public class 파일입출력1 {
	public static void main(String[] args) throws IOException {
	// 텍스트 파일 출력
		FileWriter fw = new FileWriter("a.txt");
		// 텍스트 파일과 출력 스트림을 생성
		// 생성자의 파일이 없는 경우 새로 만듦
		
		fw.write('가');
		fw.write("나");
		fw.write("다라마");
		
		fw.close(); // 제대로 write를 하려면 스트림을 닫아야 함.
	}
}

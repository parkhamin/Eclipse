package day15;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class 일반파일입출력1 {

	public static void main(String[] args) throws IOException {
		String path = "C:\\Users\\parkh\\Desktop\\javatest\\";
		
		// 바이너리(일반)파일 입력 스트림
		FileInputStream fr = new FileInputStream(path+"다운로드.jpg");
		FileOutputStream fw = new FileOutputStream(path+"소녀시대.jpg");
		// 바이너리(일반)파일 출력 스트림을 생성 -> 1바이트씩 offset을 이동하며 write
		
		while(true) {
			int a = fr.read();
			if(a==-1) break;
			fw.write(a);
		}
		
		fr.close();
		fw.close();
		
	}

}

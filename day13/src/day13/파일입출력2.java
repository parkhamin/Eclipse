package day13;

import java.io.FileWriter;
import java.io.IOException;

public class 파일입출력2 {
	public static void main(String[] args) throws IOException {
		String path = "C:\\Users\\parkh\\Desktop\\";
		FileWriter fw = new FileWriter(path+"박하민.txt");
		
		fw.write("수업끝");
		fw.close();
	}
}

package day14;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class 버퍼파일입출력예제3 {

	public static void main(String[] args) throws IOException {
		String path = "C:\\Users\\parkh\\Desktop\\javatest\\";
		FileReader fr = new FileReader(path+"홍길동.txt");
		FileWriter fw = new FileWriter(path+"홍길동-복사본1.txt");
		while(true) {
			int ch = fr.read();
			if(ch==-1) break;
			fw.write(ch);
		}
		fr.close();
		fw.close();
		
		fr = new FileReader(path+"홍길동.txt");
		BufferedReader br = new BufferedReader(fr);
		
		fw = new FileWriter(path+"홍길동-복사본2.txt");
		PrintWriter pw = new PrintWriter(fw);
		
		while(true) {
			String s = br.readLine();
			if(s==null)break;
			pw.println(s);
		}
		br.close();
		pw.close();
	}

}

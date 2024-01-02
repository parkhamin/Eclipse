package day14;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class 파일입출력예제3 {

	public static void main(String[] args) throws IOException {
		String path = "C:\\Users\\parkh\\Desktop\\javatest";

		FileReader fr = new FileReader(path + "홍길동.txt");
		FileWriter[] fw = new FileWriter[10];
		for (int i = 0; i < fw.length; i++)
			fw[i] = new FileWriter(path + "홍길동(" + (i + 1) + ").txt");

		while (true) {
			int ch = fr.read();
			if (ch == -1)
				break;
			for (int i = 0; i < fw.length; i++)
				fw[i].write(ch);
		}
		for(int i=0; i<fw.length;i++)
			fw[i].close();
		fr.close();
		System.out.println("복사완료");
	}

}

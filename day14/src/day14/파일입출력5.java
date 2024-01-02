package day14;

import java.io.FileWriter;
import java.io.IOException;

public class 파일입출력5 {

	public static void main(String[] args) throws IOException {
		String path = "C:\\Users\\parkh\\Desktop\\javatest\\a.txt";
		FileWriter fw = new FileWriter(path, true);
		// FileWriter는 파일에 있던 내용을 다 지우고 새로 씀.
		// 만약 파일에 있던 내용 뒤에 덧붙여 쓰고 싶다면,(append)
		// 생성자의 두번째 인자로 true를 기입하면 됨
		
		fw.write("banana\n");
		fw.write("cherry\n");
		
		fw.close();

	}

}

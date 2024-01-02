package day14;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class 버퍼파일입출력3 {

	public static void main(String[] args) throws IOException {
		String path = "C:\\Users\\parkh\\Desktop\\javatest\\";
		
		FileReader fr = new FileReader(path+"a.txt"); // 스트림 생성
		BufferedReader br = new BufferedReader(fr); // 한줄씩 읽으려고
		Scanner fin = new Scanner(br); // 형변환도 자동으로 해줌
		
		System.out.println(fin.hasNext());
		                  // 읽어올 내용이 있으면 true, 없으면 false
		while(fin.hasNext()) {
			String name = fin.next();
			int age = fin.nextInt();
			double height = fin.nextDouble();
			
			System.out.println("이름: "+name);
			System.out.println("나이: "+age);
			System.out.println("신장: "+height);
		}
		fin.close();
	}
}

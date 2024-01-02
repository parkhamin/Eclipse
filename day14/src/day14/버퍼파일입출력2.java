package day14;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class 버퍼파일입출력2 {

	public static void main(String[] args) throws IOException {
		String path = "C:\\Users\\parkh\\Desktop\\javatest\\";
		
		FileReader fr = new FileReader(path+"a.txt");
		BufferedReader br = new BufferedReader(fr);
		Scanner fin = new Scanner(br);
		// Scanner 클래스로 텍스트 파일을 읽을 수도 있음
		// Scanner의 생성자의 인자로 BufferedFeader의 인스턴스를 기입
		
		String name = fin.nextLine();
		int age = fin.nextInt();
		double height = fin.nextDouble();
		
		System.out.println("이름: "+name);
		System.out.println("나이: "+age);
		System.out.println("신장: "+height);
		
		fin.close();
	}

}

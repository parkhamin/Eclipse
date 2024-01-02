package day14;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class 버퍼파일입출력예제2 {

	public static void main(String[] args) throws IOException {
		String path = "C:\\Users\\parkh\\Desktop\\javatest\\";
		FileReader fr = new FileReader(path+"홍길동.txt");
		BufferedReader br = new BufferedReader(fr);
		Scanner in = new Scanner(br);
		
		String name = in.nextLine();
		int age = in.nextInt();
		double height = in.nextDouble();
		
		in.close();
		
		FileWriter fw = new FileWriter(path+"홍길동.txt");
		PrintWriter pw = new PrintWriter(fw);
		pw.printf("%s, %d세, %.1fcm\n", name, age, height);
		pw.close();
		System.out.println("파일 수정 완료");

	}

}

package day14;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class 버퍼파일입출력예제1 {

	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);

		System.out.print("이름: ");
		String name = in.next();
		System.out.print("나이: ");
		int age = in.nextInt();
		System.out.print("신장: ");
		double height = in.nextDouble();

		String path = "C:\\Users\\parkh\\Desktop\\javatest\\";
		FileWriter fw = new FileWriter(path + name + ".txt");
		PrintWriter pw = new PrintWriter(fw);

		pw.println(name);
		pw.println(age);
		pw.println(height);
		
		pw.close();
		in.close();

	}

}

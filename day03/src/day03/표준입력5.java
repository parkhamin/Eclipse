package day03;

import java.util.Scanner;

public class 표준입력5 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("나이: ");
		int age = in.nextInt();
		
		System.out.println("이름: ");
		String name = in.next();
		
		System.out.println("신장: ");
		double height = in.nextDouble();
		
		System.out.println(age+"세 "+ name+"님 "+ height+"cm");
		//System.out.printf("%s님 %d세 %.1fcm\n", name, age, height);
	}

}

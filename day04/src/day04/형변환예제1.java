package day04;

import java.util.Scanner;

public class 형변환예제1 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		System.out.println("실수 입력: ");
		
		double num = in.nextDouble();
		
		// 123.45
		int a = (int)num; // 123
		double b = num - (double) a;
		
		System.out.printf("정수부분: %d\n", a);
		System.out.printf("실수부분: %f\n", b);

	}

}

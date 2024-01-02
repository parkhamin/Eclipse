package day03;

import java.util.Scanner;

public class 표준입력예제3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("세 실수 입력: ");
		double num1 = in.nextDouble();
		double num2 = in.nextDouble();
		double num3 = in.nextDouble();
		
		double average = ( num1 + num2 + num3 ) / 3;
		
		System.out.printf("평균은 %.2f\n", average);

	}
}

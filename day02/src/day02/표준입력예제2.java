package day02;

import java.util.Scanner;

public class 표준입력예제2 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("정수입력: ");
		int a = in.nextInt();
		
		System.out.println((a%2 == 0 ) ? "짝수입니다." : "홀수입니다.");
		
	}

}

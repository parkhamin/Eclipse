package day02;

import java.util.Scanner;

public class 표준입력예제1 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("두정수입력:");
		int a = in.nextInt();
		int b = in.nextInt();
		
		System.out.println("나눈 몫은: " + (a>=b ? a/b : b/a));
		
		
	}

}

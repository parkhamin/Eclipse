package day03;

import java.util.Scanner;

public class 숙제 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("정수입력:");
		int num = in.nextInt();
		
		String s = (num <= 0) ? "자연수가 아닙니다." : (num%2==0) ? "짝수" : "홀수";
		System.out.println(s);
	}

}

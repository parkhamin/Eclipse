package day03;

import java.util.Scanner;

public class 조건문2 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		System.out.print("정수입력:");
		int num = in.nextInt();
		
		String s= "";
		
		if (num > 0) {
			if( num %2 == 0) s= "짝수";
			else s= "홀수";
		}
		else s="자연수가 아닙니다.";
			
		System.out.println(s);
	}

}

package day03;

import java.util.Scanner;

public class 조건문예제 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("세 정수를 입력:");
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		/*
		if( a > b) {
			if (b > c) System.out.println("최대값은 " + a );
			else {
				if (a < c) System.out.println("최대값은 " + c);
				else System.out.println("최대값은 " + a);
			}
		}
		else{
			if ( b < c) System.out.println("최대값은 " + c);
			else System.out.println("최대값은 "+ b);
		}
		*/
		
		// if( num1 >= num2 && num1 >= num3 ) System.oyt.println("최대값은" + num1);
		// if( num2 >= num1 && num2 >= num3 ) System.oyt.println("최대값은" + num2);
		// if( num3 >= num1 && num3 >= num2 ) System.oyt.println("최대값은" + num3);
		
	}
}

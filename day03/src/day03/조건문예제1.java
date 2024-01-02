package day03;

import java.util.Scanner;

public class 조건문예제1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("네 정수를 입력:");
		int num1 = in.nextInt();
		int num2 = in.nextInt();
		int num3 = in.nextInt();
		int num4 = in.nextInt();
		
		int max=0;
		max = num1;
		
		if(max < num2) max = num2;
		if(max < num3) max = num3;
		if(max < num4) max = num4;
		
		System.out.println("최대값은 "+ max);

	}

}

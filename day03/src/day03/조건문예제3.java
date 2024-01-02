package day03;

import java.util.Scanner;

public class 조건문예제3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("세자리정수: ");
		
		int num=in.nextInt();
		int result = 0;
		int max=0;
		
		max = num % 10;
		result += num % 10;
		num /= 10;
		
		if(max<num % 10) max = (num % 10);
		result += num % 10;
		num /= 10;
		
		if(max<num % 10) max = (num % 10);
		result += num % 10;
		num /= 10;
		
		
		System.out.println("각 자리의 합은 " + result);
		System.out.println("최대값은 " + max);
	}

}

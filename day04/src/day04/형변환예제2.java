package day04;

import java.util.Scanner;

public class 형변환예제2 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("정수 입력: ");
		int num = in.nextInt(); //2345
		double a = (double)num; //2345.0
		a = a / 100.0; //23.45
		int b = (int)a; //23
		if( (a-b) >= 0.5) b = b + 1;
		
		System.out.println( b*100 );
		
		
		
		
		

	}

}

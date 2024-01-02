package day04;

import java.util.Scanner;

public class 형변환예제3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("실수 입력: ");
		double a = in.nextDouble(); //1.234
		a = a * 100; //123.4
		double b = (int)a; //123
		if ( (a - b) >= 0.5) b = b + 1;
		
		System.out.println(b / 100);
		
		
		
	}

}

package day03;

import java.util.Scanner;

public class 조건문예제2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("나이 입력:");
		
		int age = in.nextInt();
		
		/*
		if(age <= 7 || age >= 70) {
			System.out.println("무료");
		}else {
			if(age == 17 || age == 27) System.out.println("무료");
			else System.out.println("1000원");
		}
		*/
		
		if( age % 10 == 7 || age / 10 == 7) {
			System.out.println("무료");
		}else System.out.println("1000원");
	}
}
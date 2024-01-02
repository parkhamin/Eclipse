package day04;

import java.util.Scanner;

public class 문자열예제2 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("이름: ");
		String name = in.next();
		
		System.out.println(name.charAt(0)+"씨입니다.");

	}

}

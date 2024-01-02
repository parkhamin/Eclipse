package day04;

import java.util.Scanner;

public class String클래스2 {

	public static void main(String[] args) {

		// 문자열.charAt(인덱스) -> 인덱스에 해당하는 문자를 리턴
		// 인덱스 -> 문자열에서 문자의 순서, 0부터 시작
		
		char ch1 = "apple".charAt(0);
		System.out.println(ch1);
		
		System.out.println("apple".charAt(3));
		
		Scanner in = new Scanner(System.in);
		
		String s = in.next();
		char ch2 = s.charAt(0);
		// 한 문자만 입력받고 싶을 때, 
		// nextChar() 가 없음.
		// 해결책 next()로 문자열을 입력받아 charAt(0)으로 첫글자만 사용

	}

}

package day03;

import java.util.Scanner;

public class 표준입력4 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		// 문자열을 입력받는 메서드
		String s1 = in.nextLine(); // 줄단위로 입력(엔터전까지)
		String s2 = in.next(); // 단어단위로 입력(스페이스전까지)
		 
		System.out.println(s1);
		System.out.println(s2);
		
		
	}

}

package day04;

import java.util.Scanner;

public class 문자열예제4 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("주민번호 입력: ");
		String num = in.nextLine();
		int gender = num.indexOf('-');
		
		if(Integer.parseInt(num.charAt(gender + 1)+"") % 2 == 1) 
			System.out.println("남성");
		else
			System.out.println("여성");
	}

}

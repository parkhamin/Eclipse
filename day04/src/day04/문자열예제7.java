package day04;

import java.util.Scanner;

public class 문자열예제7 {

	public static void main(String[] args) {

		// "" -> 공백문자열(empty string)
		// '\0' -> 공백문자(null 문자) : 유니코드 0번
		Scanner in = new Scanner(System.in);
		
		System.out.println("전화번호: ");
		String phone = in.nextLine();
		
		phone = phone.replace("-", "");
		System.out.println(phone);
	}

}

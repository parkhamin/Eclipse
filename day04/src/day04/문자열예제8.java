package day04;

import java.util.Scanner;

public class 문자열예제8 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		System.out.println("전화번호: ");
		String phone = in.nextLine();
		
		String front = phone.substring(0,phone.indexOf('-'));
		String back =phone.substring(phone.indexOf('-')+1);

		if(front.equals("010")) {
			System.out.println(phone);
			System.out.println("휴대폰");
		}
		if(front.equals("070")) {
			System.out.println(phone);
			System.out.println("인터넷전화");
		}
		if(front.equals("02")) {
		// System.out.pritnln(phone.replaceFirst("-", ")");
			System.out.println(front+")"+back);
			System.out.println("일반전화");
		}

		

	}

}

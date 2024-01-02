package day05;

import java.util.Scanner;

public class switch문예제1 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("월입력: ");
		int month = in.nextInt();
		String s = "";
		
		switch(month) {
		case 3, 4, 5: s = "봄"; break; // case 3: case 4: case 5: s = "봄"; 도 가능

		case 6, 7, 8: s = "여름"; break; // java 1.12이후부터 가능

		case 9, 10, 11: s = "가을"; break;

		case 12, 1, 2: s = "겨울"; break;
		
		default: s= "1~12월 사이로 입력하세요";
		}
		System.out.println(s);
	}

}

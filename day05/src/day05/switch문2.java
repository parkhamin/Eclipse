package day05;

import java.util.Scanner;

public class switch문2 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.print("번호: ");
		int num = in.nextInt();
		String s = "";
		
		switch(num) {
		case 1: s = "콜라"; break;
		case 2: s = "사이다"; break;
		case 3: s = "환타"; break;
		case 4: s = "웰치스"; break;
		case 5: s = "닥터페퍼"; break;
		default: s = "1~5 사이의 숫자가 아닙니다.";
		}
		
		System.out.println(s);
	}

}

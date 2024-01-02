package day04;

import java.util.Scanner;

public class 문자열예제5 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("주민번호 입력: ");
		String num = in.next(); //받고자 하는 문자열에 띄어쓰기 있는지 잘 확인하고 next와 nextLine 구분하고 쓸 것
		int index=num.indexOf('-');
		
		System.out.println(num.substring(0,index));
		System.out.println(num.substring(index+1));
		

	}

}

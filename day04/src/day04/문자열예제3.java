package day04;

import java.util.Scanner;

public class 문자열예제3 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("이름입력: ");
		String name = in.nextLine();

		int index = name.indexOf(' ');
		
		System.out.println("이름: "+name.substring(0, index)+" 성: "+name.substring(index+1));
		

	}

}

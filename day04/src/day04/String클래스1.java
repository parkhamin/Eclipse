package day04;

import java.util.Scanner;

public class String클래스1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		// String클래스 : 문자열에 관련된 클래스
		// 문자열을 조작하는 다양한 메서드가 존재
		
		String s1 = "apple";
		String s2 = "apple";
		// "apple" 저장된 곳의 id 값을 비교한 것에 불과함.
		if( s1 == "apple") System.out.println("같음");
		if( s1 == s2) System.out.println("같음");
		
		String s3 = in.next();
		// 문자열을 비교할 때 == 연산자를 절대 쓰면 안됨.
		
		//if( s3 == "apple") x
		if( s3.equals("apple") ) // 문자열을 비교할 때는 문자열.equals(비교할 문자열) 메서드를 사용 
			System.out.println("같음");
		else
			System.out.println("다름");
		
		//if( s3 == s2) x
		if ( s3.equals(s2) )
			System.out.println("같음");
		else
			System.out.println("다름");
	}

}

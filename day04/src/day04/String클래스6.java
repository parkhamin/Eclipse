package day04;

public class String클래스6 {

	public static void main(String[] args) {
		// 문자열을 포함하는지 알고싶을 때
		// indexOf()가 -1을 리턴하면 포함하지 않는 것
		System.out.println("apple".indexOf('b') );
		
		// 문자열.contains(문자열2) 
		// -> 문자열1에 문자열2가 포함하면 true, 아니면 false 리턴
		System.out.println( "apple".contains("b") );
		System.out.println( "apple".contains("e") );

	}

}

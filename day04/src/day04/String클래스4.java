package day04;

public class String클래스4 {

	public static void main(String[] args) {
		// 문자열.substring(시작인덱스, 끝인덱스+1)
		// 문자열의 일부를 리턴
		
		String s = "apple".substring(1, 3);
		
		System.out.println(s);
		
		System.out.println("banana".substring(2, 5));
		
		System.out.println("unhappy".substring(2));
		// 문자열.substring(시작인덱스)
		// -> 시작인덱스부터 끝까지 부분문자열을 리턴

	}

}

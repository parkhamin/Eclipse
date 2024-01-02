package day03;

public class 형변환4 {

	public static void main(String[] args) {
		// 숫자들로 구성된 문자열을 숫자로 바꾸는 법
		// "123" -> 123
		
		// 정수 -> Integer.parseInt(바꾸려는 문자열)
		int a = Integer.parseInt("123");
		System.out.println( a + 1 );
		
		double b = Double.parseDouble("123.456");
		System.out.println( b + 1.1 );
		

	}

}

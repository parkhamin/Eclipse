package day03;

public class 형변환3 {

	public static void main(String[] args) {
		
		// 123 -> "123"
		// 숫자를 문자열로 바꾸는 법 1
		// 컴파일러가 자동으로 형변환을 하게 하도록 ""을 +함.
		String s = 123 + "";
		System.out.println( s + 1 );
		
		// 숫자를 문자열로 바꾸는 법2
		// 정수 -> Integer.toString(바꾸려는 정수) 메서드 사용
		String s2 = Integer.toString(123);
		System.out.println( s2 + 1 );
		// 실수 -> Double.toString(바꾸려는 실수) 메서드 사용
		String s3 = Double.toString(123.456);
		System.out.println( s3 + 1 );

	}

}

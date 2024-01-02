package day02;

public class 데이터타입2 {

	public static void main(String[] args) {
		
		// 실수 타입 : 소수점이하 자리가 있는 숫자
		// float, double
		float a = 3.1234567f, c = 3.14F; // 4바이트, 소수점이하 7~8자리정도까지 정확하게 표현가능
		// float 타입의 실수는 뒤에 f나 F를 붙임
		// 단일 정밀도라고 표현
		double b = 3.12345678912345;
		// 자바에서 실수는 기본적으로 double로 식별
		// 8바이트, 소수점이하 15자리정도까지 정확하게 표현가능
		// 복수 정밀도라고 표현
		
		double e = 3.14d, e2 = 3.14D; // double 타입의 실수에도 뒤에 d나 D를 붙여도 됨.
	}

}

package day01;

// 상수(constant) : 변하지 않는 수 
// 리터럴(Literal) 상수 : 문자 그대로의 상수
	// -> 숫자, 문자, 문자열
// 심볼릭(Symbolic) 상수
	// -> 리터럴 상수에 별칭을 붙여준 것
public class 상수1 {
	
	public static void main(String[] args) {
		
		// 리터럴 상수
		// 자바에서 숫자는 기본적으로 10진수로 식별
		System.out.println(10);
		System.out.println(0b10); //숫자앞에 0b -> 2진수로 식별
		System.out.println(010); //숫자앞에 0 -> 8진수로 식별
		System.out.println(0x10); //숫자앞에 0x -> 16진수로 식별

	}
}
// 0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 -> 10진수
// 0 1 2 3 4 5 6 7 8 9 a  b  c  d  e  f  10 11 -> 16진수 

// 1111 0001 0010 0110
//  f    1    2    6

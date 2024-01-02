package day01;

public class 표준출력1 {

	public static void main(String[] args) {

		System.out.print(1);
		System.out.println(1);
		// C언어의 printf()함수와 사용법이 동일
		// print + Format
		System.out.printf("%d + %d = %d\n", 1, 2, 3);
		// printf(포맷문자열, ...);
		// 포맷문자열 -> 포맷문자가 포함된 문자열
		// 포맷문자 -> % 와 알파벳의 조합으로 표현한 문자
		// %d (십진수) %x(16진수) %o(8진수)
		// %c (문자) %s (문자열)
		System.out.printf("%s %c %d %x %o", "apple", 'a', 10, 10 ,10);
	}
}

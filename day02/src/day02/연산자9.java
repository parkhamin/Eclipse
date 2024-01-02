package day02;

public class 연산자9 {

	public static void main(String[] args) {
		// 조건연산자
		// ? 와 :의 조합
		// 3항연산자 -> 피연산자가 3개
		
		System.out.println( true ? 1 : 2 );
		System.out.println( false ? 1 : 2 );
		
		int a = 10;
		
		System.out.println(a >= 0 ? "plus" : "minus");
	}

}

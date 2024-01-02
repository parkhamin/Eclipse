package day02;

public class 연산자6 {

	public static void main(String[] args) {

		int a = 5;
		
		// 1 < a < 10 -> 자바에서 사용할 수 없는 수식
		// -> &&를 사용
		System.out.println(1 < a && a < 10);
		// a < 1 또는 10 < a
		// -> ||를 사용
		System.out.println(a < 1 || 10 < a);
	}

}

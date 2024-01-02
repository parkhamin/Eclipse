package day02;

public class 연산자8 {

	public static void main(String[] args) {
		// 비트연산자
		// & | ^ ~ << >>
		// 피연산자를 이진(비트)단위로 연산
		
		System.out.println(10 & 15);
		// 10 -> 1010
		// 15 -> 1111
		//       1010 -> 10
		System.out.println(10 | 15);
		// 10 -> 1010
		// 15 -> 1111
		//       1111 -> 15
		System.out.println(10 ^ 15);
		// 10 -> 1010
		// 15 -> 1111
		//       0101 -> 5
		System.out.println(~2); 
		// 2'complete(2의 보수)을 결과로 내는 연산자
		
		System.out.println(9<<3); // 왼쪽 shift 연산자
		// 0000 1001
		// 0100 1000 -> 72
		System.out.println(9>>3); // 오른쪽 shift 연산자
		// 0000 1001
		// 0000 0001 -> 1
		

	}

}

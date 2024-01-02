package day02;

public class 연산자10 {

	public static void main(String[] args) {
		// 연산의 방향
		// 수식 안에 동일한 연산자가 여러개 있는 경우 보통 연산의 방향은 좌에서 우로

		System.out.println( 1 + 2 + 3 + 4 );
		
		int a,b,c,d;
		a = b = c = d = 1;
		// 대입 연산자만 예외적으로 우에서 좌로
		
		// 수식안에 다른 연산자가 여러개 있는 경우, 연산자 우선순위에 다라 연산 순서가 결정됨
		System.out.println( 1 + 2 * 3 - 4);
		// ()가 최우선 순위임.
	}

}

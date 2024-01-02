package day02;

// 변수(variable) : 메모리상의 저장공간

public class 변수1 {

	public static void main(String[] args) {
		
		int a;
		// int -> 자료형(data type)
		// a -> 변수의 이름
		
		// 자바에서는 변수명을 관례상 소문자로 함.
		// 변수명을 짓는데 안되는 것
		int abc; // o
		int abc1; // o
		int a1bc; // o
		// int 1abc; x 숫자가 제일 처음에 오면 안됨.
		// int abc!; x 특수문자를 포함할 수 없음.
		int abc_$; // 단 _(언더바), $(달러마크)는 가능.
		// int ab c; x 중간에 스페이스가 있어도 안됨.
		int 한글; // o 한글 사용가능
		// int class; x 예약어를 변수명으로 사용할 수 없음.
		int b;
		// int b; x {}블럭 내부의 같은 이름을 가진 변수가 둘이상 있어서는 안됨.

	}

}

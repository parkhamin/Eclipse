package day06;

// while문 -> 반복횟수가 정해지지 않았을 때 주로 사용
// do-while문
// for문 -> 반복횟수가 어느정도 정해졌을 때 주로 사용
// for-each문 -> 배열이나 리스트 등에서 사용하는 반복문

public class for문1 {

	public static void main(String[] args) {
		
		int a = 0;
		while( a < 10 ) {
			System.out.println(a);
			a++;
		}
		
		// for(반복을 제어할 변수; 조건식; 증감식)
		for(int b = 0; b < 10; b ++)
			System.out.println(b);

		// for문의 () 안에서 변수의 초기화는 최초에 한번만 됨.
		for(int b = 0; b < 10; b ++) {
			// 반복할 코드가 2줄 이상이면 블럭으로 묶어야함.
			System.out.println(b);
			System.out.println(b);
		}
			

	}

}

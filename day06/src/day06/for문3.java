package day06;

public class for문3 {

	public static void main(String[] args) {
		// ()안에서 변수를 여러개 선언할 수도 있음
		for ( int a = 0, b = 10; a < 10; a++, b--) {
			                          // 증감식을 단항연산자 이외의 연산자를 써도 됨.
			                          // 증감식을 ,로 구분해서 여러개 작성하는 것도 가능
			System.out.println(a);
			System.out.println(b);
		}
		
		for( int i = 0 ; i < 10; i++ ) {
			System.out.println(i);
			if(i == 5) break; // 반복 중단
		}
		
		for( int i = 0 ; i < 10; i++ ) {
			if(i == 5) continue; // 반복을 계속 이어나가지만 continue 이후의 코드를 생략
			System.out.println(i);
			
		}

	}

}

package day06;

public class for문2 {

	public static void main(String[] args) {
		System.out.println("a b");
		
		for( int a = 0; a < 5; a++) {
			int b = 0;
			b++;
			System.out.println(a+" "+b);
		}
		// for문의 ()나 {}안에서 선언한 변수는 
		// for문을 벗어나면 소멸됨
		// -> for문 안에서만 사용해야함
		// -> 다른 for문에서 같은 이름의 변수를 사용해도 됨
		// -> 계속 유지해야할 변수는 for문 밖에서 선언해야함
		
		int a = 0; int b = 0;
		for( a = 0; a < 5; a++ ) {
			b += a;
		}
		System.out.println(b);

	}

}

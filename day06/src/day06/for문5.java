package day06;

public class for문5 {

	public static void main(String[] args) {
		// for문의 (;;)안의 각 부분은 생략 가능
		//for( ; ; ) { System.out.println(1); }
		
		int b = 0;
		for( ; b < 10; b++)
			System.out.println(b);
		
		int a = 0;
		for( ; ; a++) {
			System.out.println(a);
			if( a > 10 ) break;
		}
		
		int c = 0;
		for( ; ; ) {
			c++;
			System.out.println(c);
		}
	}

}

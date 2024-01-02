package day06;

public class for문4 {

	public static void main(String[] args) {
		
		// 중첩된(nested) for문
		// : for문 내부에 for문을 또 쓸 수 있음.
		for ( int i = 0; i < 3; i++) {
			System.out.println("Loop i");
			
			for( int j = 0 ; j < 2 ; j++) {
				System.out.println("\tLoop j");
			}
		}

	}

}

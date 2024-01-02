package day06;

public class 삼육구 {

	public static void main(String[] args) {

		int a = 1; // 반복을 제어하기 위한 변수
		
		while(a <= 100) {
			if( a % 10 == 0) System.out.println("\t");
			
			if( a % 10 == 3 || a % 10 == 6 || a % 10 == 9)
				System.out.printf("%3s", "짝");
			else if( a / 10 == 3 || a / 10 == 6 || a / 10 == 9)
				System.out.printf("%3s", "짝");
			else
				System.out.printf("%3d", a);
			
			a++;
		}

	}

}

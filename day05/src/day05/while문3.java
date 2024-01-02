package day05;

public class while문3 {

	public static void main(String[] args) {
		
		int a = 1;
		int sum = 0;
		
		while (true) {
			sum += a;
			if( a==10 ) break; // break는 루프에서 탈출
			a++;
		}
		System.out.println(sum);

	}

}

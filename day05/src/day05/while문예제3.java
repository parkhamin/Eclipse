package day05;

public class while문예제3 {

	public static void main(String[] args) {

		int a = 1;
		int sum = 0;
		
		while( a <= 10) {
			sum += a;
			a++;
		}
		
		System.out.println("합은: "+ sum);

	}

}

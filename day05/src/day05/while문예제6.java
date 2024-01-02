package day05;

import java.util.Scanner;

public class while문예제6 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a,b = 0;
		int sum=0;
		
		while(true) {
			System.out.println("두 정수입력: ");
			a = in.nextInt();
			b = in.nextInt();

			if(a==0&&b==0) {
				System.out.println("종료");
				break;
			}
			
			sum = a + b;
			System.out.println("두 정수의 합은: "+ sum);
			
		}

	}

}

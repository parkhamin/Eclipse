package day05;

import java.util.Scanner;

public class while문예제7 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int a = 0;
		int sum = 0;
		
		while(sum <= 20) {
			System.out.println("정수입력: ");
			a = in.nextInt();
			sum += a;
			System.out.println(sum);
		
		}
		
		in.close();
	}

}

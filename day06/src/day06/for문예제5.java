package day06;

import java.util.Scanner;

public class for문예제5 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("정수입력: ");
		int num1 = in.nextInt();
		int num2 = in.nextInt();

		for (int i = 0; i < num1; i++) {
			for (int j = 0; j < num2; j++) {
				if( i == 0 || i == num1-1 || j == 0 || j== num2-1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}

		in.close();
	

	}

}

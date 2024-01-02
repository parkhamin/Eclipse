package day05;

import java.util.Scanner;

public class while문4 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		while(true) {
			int a = in.nextInt();
			if(a==7) {
				System.out.println("반복중단");
				break;
			}
			System.out.println(a);
		}


	}

}

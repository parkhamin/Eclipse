package day05;

import java.util.Scanner;

public class dowhile문2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = 0;
		// do while문은 반복문의 조건에 상관없이
		// 반드시 1회 반복문 코드를 실행해야할 경우 사용
		do {
			a = in.nextInt();
			System.out.println(a);
		}while(a>0);

	}

}

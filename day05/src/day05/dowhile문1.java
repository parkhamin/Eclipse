package day05;

import java.util.Scanner;

public class dowhile문1 {

	public static void main(String[] args) {
		
		int a = 20;
		while( a < 10 ) {
			System.out.println(a);
			a++;
		}
		// while문은 반복을 시작하기 전에 반복할 것인지를 결정
		// do~while문은 루프를 1회 실행 후 반복할 것인지를 결정
		
		int b = 20;
		do{
			System.out.println(b);
			b++;
		} while( b < 10 );
	}

}

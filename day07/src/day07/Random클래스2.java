package day07;

import java.util.Random;

public class Random클래스2 {

	public static void main(String[] args) {

		Random r1 = new Random(2); // 생성자에서 seed를 지정가능
		for (int i = 0; i < 10; i++) {
			System.out.print(r1.nextInt(5) + " ");
		}
		
		System.out.println();
		
		Random r2 = new Random();
		// .setSeed(정수)
		// 랜덤수의 발생 패턴(seed)을 지정
		r2.setSeed(2); // seed는 long타입의 범위 안에서 정수로 지정 가능
		
		for (int i = 0; i < 10; i++) {
			System.out.print(r2.nextInt(5) + " ");
		}

	}

}

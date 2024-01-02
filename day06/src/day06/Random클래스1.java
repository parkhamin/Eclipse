package day06;

import java.util.Random;

// 랜덤수
// 1. Math.random()
// 2. Random클래스의 메서드 사용

public class Random클래스1 {

	public static void main(String[] args) {

		Random r = new Random(); // 랜덤클래스의 인스턴스 생성

		int a = r.nextInt(); // int의 범위 안에서 랜덤으로 정수를 리턴

		System.out.println(a);

		for (int i = 0; i < 10; i++)
			System.out.println(r.nextInt(3));
		// .nextInt(양의정수) -> 0~(양의정수-1) 중에서 랜덤으로 리턴
		           // bound 범위

		double b = r.nextDouble();
		// 0~1 사이의 double형 실수를 랜덤으로 리턴
		System.out.println(b);

		float c = r.nextFloat();
		// 0~1 사이의 float형 실수를 랜덤으로 리턴

		System.out.println(r.nextDouble(2.5));
		                   // 0 ~ bound 사이의 실수를 리턴 
		
		for (int i = 0; i < 5 ; i++)
			System.out.println(r.nextInt(1,6));
			// .nextInt(a,b)
			// a~b-1사이의 정수를 랜덤으로 리턴
	}

}

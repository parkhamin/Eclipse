package day06;

import java.util.Random;

public class Random예제2 {

	public static void main(String[] args) {

		Random r = new Random();

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 6; j++) {
				System.out.print(r.nextInt(1, 46));
				System.out.print("\t");
			}
			System.out.println();
		}

	}

}

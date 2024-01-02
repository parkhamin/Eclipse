package day06;

import java.util.Random;

public class 인증번호 {

	public static void main(String[] args) {

		Random r = new Random();

		System.out.print("인증번호: ");

		for (int i = 0; i < r.nextInt(5, 7); i++) {
			System.out.print(r.nextInt(10));
		}

	}

}

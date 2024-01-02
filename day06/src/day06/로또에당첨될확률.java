package day06;

public class 로또에당첨될확률 {

	public static void main(String[] args) {

		double result1 = 1; // 분자
		double result2 = 1; // 분모

		for (int i = 45; i >= 40; i--) {
			result1 *= i;
		}

		for (int j = 6; j >= 1; j--) {
			result2 *= j;
		}

		System.out.println("당첨 확률은 " + (result1 / result2));

	}

}

package day06;

import java.util.Random;

public class 인증번호2 {

	public static void main(String[] args) {

		Random r = new Random();
		int num;
		int count = 0;
		System.out.println("인증번호: ");

		/*while (true) {
			num = r.nextInt(10);
			if (num == 1 || num == 8 || num == 6) {
				System.out.print(num);
				count++;
			} else
				continue;

			if (count == 5)
				break;
		}
		*/

		do {
			num = r.nextInt(10);
			if (num == 1 || num == 8 || num == 6) {
				System.out.print(num);
				count++;
			} else
				continue;
		} while (count < 5);
	   
	}

}

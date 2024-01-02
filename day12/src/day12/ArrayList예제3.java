package day12;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ArrayList예제3 {
	public static void main(String[] args) {
		Random r = new Random();
		Scanner in = new Scanner(System.in);
		ArrayList<Integer> input = new ArrayList<Integer>();
		ArrayList<Integer> answer = new ArrayList<Integer>();

		System.out.print("입력: ");
		for (int i = 0; i < 3; i++) {
			int num = in.nextInt();
			input.add(num);
		}

		System.out.print("당첨: ");

		int count = 0;
		while (true) {
			if (count == 3)
				break;
			int num = r.nextInt(1, 11);
			if (answer.contains(num)) {
				continue;
			} else {
				answer.add(num);
				count++;
			}
		}

		for (int a : answer)
			System.out.print(a + " ");
		System.out.println();

		int answer_count = 0;
		for (int i = 0; i < answer.size(); i++) {
			if (answer.contains(input.get(i)) == true)
				answer_count++;
		}
		
		String s ="";
		switch (answer_count) {
		case 0:s="꽝"; break;
		case 1:s="3등"; break;
		case 2:s="2등"; break;
		case 3:s="1등"; break;
		}
		
		System.out.println(s);
		in.close();

	}
}

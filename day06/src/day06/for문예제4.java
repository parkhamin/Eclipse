package day06;

import java.util.Scanner;
// 자동정렬 단축키 영역선택 후 CTRL + SHIFT + f
// 자동주석 단축기 영역선택 후 CTRL + SHIFT + c

public class for문예제4 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("정수입력: ");
		int num = in.nextInt();

		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {
				System.out.printf("*");
			}
			System.out.println();
		}

		in.close();

	}

}

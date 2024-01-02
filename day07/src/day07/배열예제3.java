package day07;

import java.util.Scanner;

public class 배열예제3 {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 5 };

		Scanner in = new Scanner(System.in);
		System.out.println("정수 입력: ");
		int num = in.nextInt();
		int result = -1;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == num) {
				System.out.println(i + "번째 원소");
				result = 1;
				break;
			}
		}

		if (result == -1)
			System.out.println("없는 숫자입니다");

	}

}

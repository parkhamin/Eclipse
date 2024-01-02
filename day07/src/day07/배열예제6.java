package day07;

import java.util.Scanner;

public class 배열예제6 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		String arr[] = new String[5];

		System.out.println("이름 입력: ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = in.next();
		}

		String first = arr[0];

		for (int i = 1; i < arr.length; i++) {
			if (first.compareTo(arr[i]) > 0)
				first = arr[i];
		}

		String second = arr[0];
		if (arr[0].equals(first))
			second = arr[1];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i].equals(first))
				continue;
			if (second.compareTo(arr[i]) > 0)
				second = arr[i];
		}

		System.out.println("첫번째: " + first);
		System.out.println("두번째: " + second);

	}

}

package day07;

import java.util.Arrays;

public class 배열6 {

	public static void main(String[] args) {

		int[] arr = { 3, 4, 1, 2, 5 };

		for (int a : arr)
			System.out.print(a + " ");

		System.out.println();

		// Arrays.sort(배열명) -> 배열을 오름차순으로 정렬
		Arrays.sort(arr);

		for (int a : arr)
			System.out.print(a + " ");

		System.out.println();

		String[] arr2 = { "banana", "apple", "cherry" };
		Arrays.sort(arr2);
		for (String a : arr2)
			System.out.print(a + " ");

	}

}

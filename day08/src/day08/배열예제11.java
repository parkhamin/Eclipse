package day08;

import java.util.Arrays;

public class 배열예제11 {

	public static void main(String[] args) {

		int arr1[] = { 9, 8, 10, 5, 3 };
		int arr2[] = arr1.clone();
		int arr3[] = arr2.clone();

		Arrays.sort(arr2);
		Arrays.sort(arr3);

		for (int a : arr1)
			System.out.print(a + " ");

		System.out.println();

		for (int a : arr2)
			System.out.print(a + " ");

		System.out.println();

		for (int i = arr3.length - 1; i >= 0; i--)
			System.out.print(arr3[i] + " ");
	}
}

package day07;

import java.util.Arrays;

public class 배열예제8 {

	public static void main(String[] args) {
		int arr[] = { 5, 6, 8, 9, 7, 12, 13, 15, 17, 3, 2 };
		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		double avg = (double) sum / arr.length;

		Arrays.sort(arr);

		int mid = arr[arr.length / 2];

		for (int i = arr.length - 1; i >= 0; i--)
			System.out.print(arr[i] + " ");

		System.out.println();
		System.out.println("mean: " + avg);
		System.out.println("mid: " + mid);

	}

}

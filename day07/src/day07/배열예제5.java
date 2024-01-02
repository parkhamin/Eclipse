package day07;

import java.util.Scanner;

public class 배열예제5 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		double arr[] = new double[5];
		double sum = 0;
		double average = 0;

		System.out.println("원소들을 입력하세요");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = in.nextDouble();
			sum += arr[i];
		}

		average = sum / arr.length;

		double max = arr[0];
		double min = arr[0];
		for (int i = 0; i < (arr.length - 1); i++) {
			if (max <= arr[i + 1])
				max = arr[i + 1];
			if (min >= arr[i + 1])
				min = arr[i + 1];

		}

		System.out.println("max: " + max);
		System.out.println("min: " + min);
		System.out.println("total: " + sum);
		System.out.println("avg: " + average);

		in.close();

	}

}

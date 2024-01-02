package day07;

import java.util.Arrays;
import java.util.Scanner;

public class 배열예제7 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double arr[] = new double[5];

		System.out.println("원소들을 입력하세요");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = in.nextDouble();
		}
		
		Arrays.sort(arr);
		
		System.out.println("max: "+arr[arr.length-1]);
		System.out.println("min: "+arr[0]);
		System.out.println("두번째로 작은 값: "+arr[1]);
	}

}

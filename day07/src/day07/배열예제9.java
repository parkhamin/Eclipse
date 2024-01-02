package day07;

public class 배열예제9 {

	public static void main(String[] args) {
		// 피보나치 수열문제
		// 1 1 2 3 5 8 13 ...

		int[] arr = new int[10];

		for (int i = 0; i < 10; i++) {
			if (i == 0 || i == 1)
				arr[i] = 1;
			else
				arr[i] = arr[i - 1] + arr[i - 2];
		}

		for (int a : arr)
			System.out.print(a + " ");

	}

}

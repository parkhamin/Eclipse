package day07;

public class 배열3 {

	public static void main(String[] args) {
		int[] arr1 = new int[3];
		arr1[0] = 10;
		arr1[1] = 20;
		arr1[2] = 20;

		// 배열에 한꺼번에 여러값을 저장할 수 있음
		// 단, 선언과 동시에 초기화할 때만 가능
		int[] arr2 = { 10, 20, 20 };
		
		for (int i = 0; i < 3; i++)
			System.out.println(arr2[i]);

	}

}

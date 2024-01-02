package day08;

public class 배열7 {

	public static void main(String[] args) {

		int[] arr1 = { 1, 2, 3 };
		int[] arr2 = arr1; // 얕은 복사(shallow copy)
		                   // 배열의 id(주소만) 복사하는 것
		                   // -> 원래 배열이 변경되면 값이 바뀜

		arr1[0] = arr1[1] = arr1[2] = 0;

		for (int a : arr2)
			System.out.print(a + " ");
		
		System.out.println(arr1);
		System.out.println(arr2);

	}

}

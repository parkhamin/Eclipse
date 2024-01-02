package day08;

public class 배열8 {

	public static void main(String[] args) {

		int[] arr1 = { 1, 2, 3 };
		int[] arr2 = new int[arr1.length];

		for (int i = 0; i < arr1.length; i++)
			arr2[i] = arr1[i];
		// 깊은 복사(deep copy)
		// 별도의 저장공간을 확보하고 값을 복사한 것
		// -> 복사대상이 된 배열의 값이 변하더라도 바뀌지 않음 

		arr1[0] = arr1[1] = arr1[2] = 0;
		
		for (int a : arr2)
			System.out.print(a + " ");

		System.out.println(arr1);
		System.out.println(arr2);
	}

}

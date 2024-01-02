package day08;

public class 배열9 {

	public static void main(String[] args) {
		
		int[] arr1 = { 1, 2, 3 };
		int[] arr2 = arr1.clone(); 
		// 배열명.clone() -> 배열을 깊은 복사해주는 메서드
				
		arr1[0] = arr1[1] = arr1[2] = 0;
		
		for (int a : arr2)
			System.out.print(a + " ");

		System.out.println(arr1);
		System.out.println(arr2);
	}

}

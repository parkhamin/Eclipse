package day07;

public class 배열2 {

	public static void main(String[] args) {

		// 배열을 선언하는 방법
		// 자료형[] 배열 이름 = new 자료형[원소의 개수]
		int[] arr = new int[3]; // 저장공간만 확보
		String[] arr2 = new String[5];

		// 배열의 각 원소에 값을 저장
		arr[0] = 10; arr[1] = 12; arr[2] = 3;
		// 배열명[인덱스] -> 배열의 원소에 접근

		System.out.println(arr); // id 값만 저장
		System.out.println(arr[0]); // 실제 배열의 값이 저장

	}

}

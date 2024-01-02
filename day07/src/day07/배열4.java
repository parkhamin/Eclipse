package day07;

public class 배열4 {

	public static void main(String[] args) {

		// C언어의 배열 선언 문법도 사용가능
		int arr[] = { 1, 2, 3 };

		int[] arr2 = { 10, 20, 30 };
        // 배열명.length -> 배열의 길이가 저장된 변수
		int length = arr2.length;

		System.out.println("배열의 길이: " + length);
		
		// 문자열의 길이 -> 문자열.length() -> 메서드
		// 배열의 길이 -> 배열명.length -> 변수
	}

}

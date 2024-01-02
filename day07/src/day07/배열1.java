package day07;

// 배열(array) : 같은 데이터 타입의 변수들의 집합
// 변수들 사이에는 순서가 있음 -> 인덱스
// 배열의 변수들을 요소 또는 원소(element)
// 인덱스는 0번부터 시작
// 인덱스는 int형 변수로 치환 가능 -> 반복문을 이용해서 손쉽게 원소들에 접근 가능 

public class 배열1 {

	public static void main(String[] args) {

		// int a1,a2,a3,a4,a5,a6,a7,a8,a9,a10;
		int[] a = new int[10];

		int sum = 0;

		for (int index = 0; index < 10; index++) {
			a[index] = index + 1;
			sum += a[index];
		}

		System.out.println(sum);

	}

}

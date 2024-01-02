package day12;

import java.util.Vector;

// 배열의 단점 -> 크기가 고정(Static Array)
// 크기를 동적으로 늘려주는 배열 -> 가변배열(Dynamic Array)
// 가변 배열 클래스 -> Vector, ArrayList -> 일반화(generic)클래스
// Vector는 자바 초창기부터 사용되던 가변 배열 클래스
// ArrayList는 Vector를 개선해서 추후(java 1.8부터)에 나온 클래스

public class Vector클래스1 {

	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>();
		
		v.add(10); v.add(20); v.add(30); v.add(40);
		System.out.println(v);
		
		
		
		int[] arr = new int[3];

		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;

		// 크기 이상의 원소를 추가하고 싶다면,
		// 크기를 늘린 새로운 배열을 만들고 복사 후 데이터 추가
		int[] arr1 = new int[4];
		for (int i = 0; i < arr.length; i++)
			arr1[i] = arr[i];

		arr1[3] = 40;
	}

}

package day12;

import java.util.Arrays;
import java.util.Vector;

public class Vector클래스8 {
	public static void main(String[] args) {
		Integer[] arr = new Integer[3];
		
		Vector<Integer> v = new Vector<Integer>();
		v.add(10); v.add(20); v.add(30);
		
		// 벡터에서 배열로 copy
		v.toArray(arr); // 벡터.toArray(배열)
		
		for(Integer a: arr)
			System.out.print(a+" ");
	
		// 배열에서 벡터로 copy
		// Vector의 생성자의 인자로 Arrays.asList(배열)
		Vector<Integer> v2 = new Vector<Integer>(Arrays.asList(arr));
		
		System.out.println(v2);
	}
}

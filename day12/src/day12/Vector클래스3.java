package day12;

import java.util.Vector;

public class Vector클래스3 {
	public static void main(String[] args) {
		Vector<Double> v = new Vector<Double>();
		
		v.add(1.5); v.add(2.3); v.add(3.7);
		System.out.println(v);
		
		v.add(1, 2.0); // 중간에 원소를 추가
		               // .add(인덱스, 값)
		System.out.println(v);
		
		v.set(1, 2.2); // 원소의 값을 변경
   		System.out.println(v); // .set(인덱스, 변경하려는 값)

		v.add(2.2);
		System.out.println(v);
		
		System.out.println(v.get(2)); // .get(인덱스) -> 인덱스에 해당하는 원소를 리턴
	}
}

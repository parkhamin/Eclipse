package day12;

import java.util.Vector;

public class Vector클래스5 {

	public static void main(String[] args) {
		Vector<String> v =new Vector<String>();
		v.add("월"); v.add("화"); v.add("수");
		
		System.out.println(v);
		System.out.println(v.isEmpty());
		// .isEmpty() -> 벡터에 원소가 하나 이상 있으면, false 리턴
		              // 비어있는 벡터이면, true 리턴
		
		v.remove(0);
		v.remove(0);
		v.remove(0);
		
		System.out.println(v);
		System.out.println(v.isEmpty());
	}

}

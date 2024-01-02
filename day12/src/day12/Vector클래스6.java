package day12;

import java.util.Vector;

public class Vector클래스6 {

	public static void main(String[] args) {
		Vector<String> v =new Vector<String>();
		v.add("월"); v.add("화"); v.add("수"); v.add("목");
		
		String a = v.remove(0); // 원소의 저장된 값을 리턴 후 삭제
		System.out.println(a); 
		
		while(!v.isEmpty())
			System.out.println(v.remove(0));
		
		System.out.println(v);
	}

}

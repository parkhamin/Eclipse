package day12;

import java.util.Vector;

public class Vector클래스7 {
	public static void main(String[] args) {
		Vector<String> v =new Vector<String>();
		v.add("월"); v.add("화"); v.add("수"); v.add("화");
		
		System.out.println(v);
		
		// .indexOf(값) -> 값이 저장된 원소의 인덱스를 리턴
		// -> 값이 여러개 있을 때는 제일 앞의 인덱스를 리턴
		// -> 찾는 값이 벡터에 없을 때는 -1을 리턴
		int index = v.indexOf("화");
		System.out.println(index);
		
		System.out.println(v.indexOf("목"));
		System.out.println(v.contains("목"));
		// .contains(값) -> 벡터에 값이 있으면 true, 없으면 false 리턴
	}
}

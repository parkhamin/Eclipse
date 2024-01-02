package day12;

import java.util.Vector;

public class Vector클래스2 {
	public static void main(String[] args) {
		Vector<String> v =new Vector<String>();
		
		v.add("월"); // .add(값) -> 벡터의 원소를 추가
		v.add("화");
		v.add("수");
		
		System.out.println(v); // 월 화 수
		                       // 0 1 2  -> 벡터도 인덱스가 있음
		v.remove(2); // .remove(인덱스) -> 해당 인덱스의 원소를 삭제
		System.out.println(v);
		//v.remove(3); // 없는 인덱스를 지울 때는 예외 발생
		
		v.remove("화"); // .remove(값) -> 값에 해당하는 원소를 삭제
		System.out.println(v);
		
		v.add("화");
		v.add("수");
		v.add("화");
		v.add("수");
		System.out.println(v);
		v.remove("화"); // 삭제하려는 값이 여러개일 때는 앞에서부터 삭제
		System.out.println(v);
		
	}
}

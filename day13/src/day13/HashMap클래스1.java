package day13;

import java.util.HashMap;

// Map -> 표에 해당하는 자료구조 클래스
// Map의 sub클래스로 HashTable, HashMap
// 타입매개변수 2개 -> key와 value
// key들은 집합 -> key는 중복되지 않음
// key들 사이에는 순서가 없음

public class HashMap클래스1 {
	public static void main(String[] args) {
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		hm.put(1, "홍길동");
		hm.put(2, "김길동");
		hm.put(30, "이길동");
		System.out.println(hm);
		String s = hm.get(2); // key에 해당하는 value를 리턴
		System.out.println(s);
	}
}

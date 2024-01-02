package day13;

import java.util.HashSet;

// Set -> 집합을 구현한 클래스
// HashSet클래스 -> Set의 sub클래스
// 원소를 저장 가능
// 중복된 원소를 허용하지 않음
// 원소들 사이에 순서도 없음(인덱스가 없음)

public class HashSet클래스1 {
	public static void main(String[] args) {
		HashSet<Integer> hs = new HashSet<Integer>();
		
		System.out.println(hs.isEmpty());
		// .add(값) -> 집합에 원소를 추가
		hs.add(10); hs.add(20); hs.add(30);
		hs.add(10); // 이미 있는 값을 add하면, 추가되지않음
		
		System.out.println(hs);
		
		int size = hs.size(); // 집합의 원소의 개수를 리턴
		System.out.println(size);
		System.out.println(hs.isEmpty());
		// .isEmpty() -> 빈set이면 true, 아니면 false
		
		boolean b = hs.remove(10);
		// .remove(값) -> 원소를 삭제
		System.out.println(b); // 있는 원소를 지웠을 때는 true
		System.out.println(hs.remove(50)); // 없는 원소를 지우려 할 경우에는 false
	}
}

package day12;

import java.util.ArrayList;
// ArrayList클래스
// -> Vector에서 개선된 클래스
// -> Vector와 동일한 이름의 메서드를 사용
// -> 내부적으로 배열을 늘리는 방식이나 동기화 방식이 차이남
public class ArrayList클래스1 {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
	
		System.out.println(al.isEmpty());
		
		al.add(10); al.add(20); al.add(30);
		System.out.println(al);
		
		System.out.println(al.remove(0));
		System.out.println(al);
		
		al.set(1, 35);
		System.out.println(al);
		
		
	}
}

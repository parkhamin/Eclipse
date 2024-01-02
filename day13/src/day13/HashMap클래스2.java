package day13;

import java.util.HashMap;

public class HashMap클래스2 {

	public static void main(String[] args) {
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		
		hm.put(1, "홍길동");
		hm.put(2, "김길동");
		hm.put(30, "이길동");
		
		System.out.println(hm.size()); // map에 저장된 원소의 개수
		System.out.println(hm.isEmpty()); // 빈 map이면 true, 아니면 false
		
		System.out.println(hm.replace(1, "박길동")); 
		// .replace(key, 바꿀value) -> key에 해당하는 value를 수정
		// 수정되기 전의 value를 리턴, 만약 해당하는 key가 존재하지 않으면 null 리턴
		System.out.println(hm);
		System.out.println(hm.remove(30));
		// .remove(key) -> key에 해당하는 레코드를 삭제
		// value를 리턴하고 삭제
		
		System.out.println(hm.containsKey(1)); 
		// .containsKey(key) -> key가 있으면 true, 없으면 false
		System.out.println(hm.containsValue("김길동"));
		// .containsValue(value) -> value가 있으면 true, 없으면 false
	}

}

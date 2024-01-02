package day12;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList예제1 {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("홍길동"); al.add("김철수"); al.add("박민수"); al.add("이정수"); al.add("강철수");
		
		String[] arr = new String[al.size()];
		al.toArray(arr); // ArrayList를 배열로
		Arrays.sort(arr); // 가나다 순으로 정렬
		//ArrayList<String> al2 = new ArrayList<String>(Arrays.asList(arr)); // 배열을 ArrayList로
		
		//for(String a : al2)
		//  	System.out.println(a);
		al.clear(); // 빈리스트로 만드는 메서드
		for(int i = 0; i< arr.length; i++)
			al.add(arr[i]);
		
		System.out.println(al);
		
		
	}

}

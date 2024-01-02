package day13;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet클래스2 {

	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>();
		
		hs.add("월"); hs.add("화"); hs.add("수");
		
		// 순서가 없는 자료구조 클래스에 임시로 순서를 부여하는 것
		// -> Iterator(반복자)
		
		Iterator i = hs.iterator();
		           // set인스턴스.iterator()
		System.out.println(i.hasNext());
		           // 순서를 부여한 원소가 있으면 true, 없으면 false
		while(i.hasNext()) {
			String a = (String)i.next();
			System.out.println(a);
		}
	}
}

package day13;

import java.util.HashMap;
import java.util.Iterator;

public class HashMap클래스3 {

	public static void main(String[] args) {
		HashMap<String, Double> hm = new HashMap<String, Double>();

		hm.put("홍길동", 10.5);
		hm.put("김길동", 20.3);
		hm.put("이길동", 30.2);
		
		System.out.println(hm.keySet()); // key들의 집합을 리턴
		
		Iterator i = hm.keySet().iterator();
		
		while(i.hasNext()) {
			String key = (String)i.next();
			double value = hm.get(key);
			System.out.println(key+" "+value);
		}
	}
}

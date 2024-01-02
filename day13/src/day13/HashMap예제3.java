package day13;

// List, Set, Map 등 자료구조 클래스들을 통틀어
// Collection 프레임워크라고 함

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class HashMap예제3 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		
		while(true) {
			String alphabet = in.next();
			if(alphabet.equals("0")) break;
			if(hm.containsKey(alphabet)==false) hm.put(alphabet,1);
			else hm.replace(alphabet, hm.get(alphabet)+1);
		}
		
		Iterator i = hm.keySet().iterator();
		
		while(i.hasNext()) {
			String key = (String)i.next();
			System.out.println(key+": "+hm.get(key)+"개");
;		}
	}
}

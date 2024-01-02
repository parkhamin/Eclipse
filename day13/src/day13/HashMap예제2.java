package day13;

import java.util.HashMap;
import java.util.Iterator;
import java.util.StringTokenizer;

public class HashMap예제2 {
	public static void main(String[] args) {
		String s = "종로구,종로구,중구,강남구,동대문구,동대문구";
		StringTokenizer st = new StringTokenizer(s,",");
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		
		while(st.hasMoreTokens()) {
			String key = st.nextToken();
			if(hm.containsKey(key)==false) hm.put(key, 1); // 처음 입력될 때
			else hm.replace(key,(hm.get(key)+1)); // 두번째부터
		}
		
		Iterator i = hm.keySet().iterator();
		
		while(i.hasNext()) {
			String key = (String)i.next();
			System.out.println(key+" "+hm.get(key));
		}
	}
}

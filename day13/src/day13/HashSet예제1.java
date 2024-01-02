package day13;

import java.util.HashSet;
import java.util.StringTokenizer;

public class HashSet예제1 {
	public static void main(String[] args) {
		String s ="종로구,종로구,중구,강남구,동대문구,동대문구";
		StringTokenizer st = new StringTokenizer(s,",");
		HashSet<String> hs = new HashSet<String>();
		
		while(st.hasMoreTokens()) {
			hs.add(st.nextToken());
		}
		
		System.out.println(hs.size()+"개");
		for(String a : hs)
			System.out.println(a);
	}
}

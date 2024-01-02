package day12;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class ArrayList예제2 {

	public static void main(String[] args) {
		String s = "서울시 동대문구 홍길동,"
				+ "서울시 구로구 김영철,"
				+ "서울시 서대문구 김철수,"
				+ "서울시 중구 보아,"
				+ "서울시 중구 이순신,"
				+ "서울시 종로구 김두환,"
				+ "서울시 강남구 강감찬";
		ArrayList<String> al = new ArrayList<String>();
		StringTokenizer st = new StringTokenizer(s, ",");
		while(st.hasMoreTokens()) {
			String a = st.nextToken();
			StringTokenizer st2 = new StringTokenizer(a," ");
			st2.nextToken();
			al.add(st2.nextToken());
			}

		for(String a : al)
			System.out.println(a);
}	
}
		
		


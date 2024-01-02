package day10;

import java.util.StringTokenizer;

public class StringTokenizer클래스예제4 {

	public static void main(String[] args) {
		
		String s = "서울시 동대문구 이문동,"
				+ "서울시 서대문구 창천동,"
				+ "서울시 성북구 석관동,"
				+ "서울시 성동구 성수동,"
				+ "경기도 고양시 덕양구,"
				+ "경기도 구리시 인창동";
		String result="";
		
		StringTokenizer st1 = new StringTokenizer(s, ",");
		
		while(st1.hasMoreElements()) {
			String s2 = st1.nextToken();
			
			StringTokenizer st2 = new StringTokenizer(s2);
			st2.nextToken();
			String s3 = st2.nextToken();
			System.out.println(s3);
		}

		System.out.println(result);
	}

}

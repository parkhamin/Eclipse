package day09;
// 대한, 민국, 만세 -> ,를 기준으로 부분문자열을 분리하고 싶을 때
// String -> 문자열
// , -> 분리자(delimiter)
// token -> 대한 민국 만세

import java.util.StringTokenizer;

public class StringTokenizer클래스1 {

	public static void main(String[] args) {
		String s = "대한, 민국, 만세";
		
		StringTokenizer st = new StringTokenizer(s, ",");
		
		String a = st.nextToken();
		System.out.println(a);
		System.out.println(st.nextToken());
		System.out.println(st.nextToken());

	}

}

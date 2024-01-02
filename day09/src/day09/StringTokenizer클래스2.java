package day09;

import java.util.StringTokenizer;

public class StringTokenizer클래스2 {

	public static void main(String[] args) {
		String s = "대한,민국,만세";
		StringTokenizer st = new StringTokenizer(s, ",");
		// 대한 민국 만세
		int a = st.countTokens(); // 토큰의 개수를 리턴
		System.out.println(a);
		
		System.out.println(st.nextToken());
		// 민국 만세
		System.out.println(st.countTokens());
		
		System.out.println(st.nextToken());
		System.out.println(st.nextToken());
		System.out.println(st.countTokens());
		
		// 남은 토큰이 있는 경우 true 없으면 false
		
		
		
	}

}

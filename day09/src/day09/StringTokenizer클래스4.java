package day09;

import java.util.StringTokenizer;

public class StringTokenizer클래스4 {

	public static void main(String[] args) {
		String s = "대한,민,국.만.세";
		StringTokenizer st = new StringTokenizer(s);
		StringTokenizer st2 = new StringTokenizer(s,",+.");
		// 생성자의 두번째 인자로 분지라를 복수개 지정가능
		StringTokenizer st3 = new StringTokenizer(s,",",true);
		// 생성자의 세번째 인자가 true 이면 -> 분리자를 한 토큰으로 간주
		
		while(st3.hasMoreTokens())
			System.out.println(st3.nextToken());
		
		while(st2.hasMoreTokens())
			System.out.println(st2.nextToken());
		
		System.out.println(st.nextToken(","));
		              // .nextToken(분리자) -> 분리자를 nextToken에서 지정가능
		System.out.println(st.nextToken(","));
		System.out.println(st.nextToken("."));
		System.out.println(st.nextToken("."));
		System.out.println(st.nextToken("."));

	}

}

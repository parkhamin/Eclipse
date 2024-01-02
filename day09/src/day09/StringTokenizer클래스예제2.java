package day09;

import java.util.StringTokenizer;

public class StringTokenizer클래스예제2 {

	public static void main(String[] args) {
		String s="홍길동,김길동,이길서,김철수,김철민,오길남";
		StringTokenizer st = new StringTokenizer(s,",");
		int num = st.countTokens();
		int count=0;
		
		while(st.hasMoreTokens()) {
			String a = st.nextToken();
			if(a.charAt(0) =='김') {
				System.out.print(a+" ");
				count++;
			}
		}
		
		System.out.println();
		System.out.println("김씨 "+count+"/"+num);

	}

}

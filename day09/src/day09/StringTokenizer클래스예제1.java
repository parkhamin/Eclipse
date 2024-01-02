package day09;

import java.util.StringTokenizer;

public class StringTokenizer클래스예제1 {

	public static void main(String[] args) {
		String s = "내가 그린 기린 그림은 잘 그린 기린 그림이고 네가 그린 기린 그림은 잘 못 그린 기린 그림이다.";
		StringTokenizer st = new StringTokenizer(s, " ");
		// 생성자에서 분리자를 지정하지 않을 경우, 
		// 기본분리자가 스페이스 탭 앤터(" \t\n")로 자동 지정됨
	
		int count=0;
		int count2=0;
		
		while(st.hasMoreTokens()) {
			String a = st.nextToken();
			if(a.equals("기린")) count++;
			if(a.contains("그림")) count2++;
		} //equals() -> 일치, contains() -> 포함
		
		System.out.println("기린: "+count+"번");
		System.out.println("그림: "+count2+"번");

	}

}

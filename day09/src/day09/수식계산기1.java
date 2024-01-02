package day09;

import java.util.StringTokenizer;

public class 수식계산기1 {

	public static void main(String[] args) {
		String s = "대한,민국,만세";
		StringTokenizer st = new StringTokenizer(s, ",");

		// for문을 써서 모든 토큰을 반환할 경우
		// 미리 토큰의 수를 저장해 두어야 함
		// -> for문의 조건으로 countTokens()를 쓰면 중간에 멈춤

		int count = st.countTokens();
		for (int i = 0; i < count; i++)
			System.out.println(st.nextToken());

		StringTokenizer st2 = new StringTokenizer(s, ",");

		while (st2.hasMoreTokens())
			System.out.println(st2.nextToken());
	}

}

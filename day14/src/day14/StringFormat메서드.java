package day14;

public class StringFormat메서드 {

	public static void main(String[] args) {
		
		System.out.printf("%d + %d = %d\n", 1,2,1+2);
		
		String s = String.format("%d + %d = %d", 1, 2, 1+2);
		          // 첫번째 인자로 지정한 포맷으로 문자열을 리턴
		          // printf()와 사용법이 같음
		System.out.println(s);

	}

}

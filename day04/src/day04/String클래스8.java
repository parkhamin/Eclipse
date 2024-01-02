package day04;

public class String클래스8 {

	public static void main(String[] args) {
		// 문자열.trim()
		// -> 문자열 앞뒤에 스페이스가 제거된 문자열을 리턴
		// -> 문자열 자체가 바뀌지는 않음
		
		String s = "     apple        ";
		System.out.println(s);
		
		System.out.println(s.trim());
		
		System.out.println(s);
		
		s = s.trim();
		System.out.println(s);
		

	}

}

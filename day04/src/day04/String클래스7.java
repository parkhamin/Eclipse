package day04;

public class String클래스7 {

	public static void main(String[] args) {
		// 문자열.replace(문자1,문자2)
		// -> 문자열의 문자1을 모두 문자2로 바꾼 문자열을 리턴
		// -> 문자열 자체를 바꾸지는 않음
		String s = "banana".replace('a', 'b');
		
		System.out.println(s);
		
		s = "banana";
		System.out.println(s.replace("an", "e"));
		// 인자로 문자 1,2 대신 문자열 1,2도 가능
		System.out.println(s);
		
		s = s.replace("an", "e");
		// 문자열 자체를 바꾸려면 replace한 뒤 다시 저장해야함
		System.out.println(s);

	}

}

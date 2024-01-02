package day07;

public class 문자열비교 {

	public static void main(String[] args) {
		// 문자열1.compareTo(문자열2)
		// 문자열1이 문자열2보다 사전적인 순서가 앞서면 음수를
		// 문자열1이 문자열2와 같으면 0을
		// 문자열1이 문자열2보다 사전적인 순서가 뒷서면 양수를 
		// 리턴
		
		int a = "abc".compareTo("abc"); // 0 -> 두 문자열이 같을 때
		
		System.out.println(a);
		
		String s1 = "apple";
		String s2 = "banana";
		System.out.println(s1.compareTo(s2)); // -1 -> s2보다 s1이 앞선다
		System.out.println(s2.compareTo(s1)); // 1
		
	}

}

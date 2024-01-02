package day01;

public class 특수문자1 {

	public static void main(String[] args) {
		
		//문자 중 특수문자
		// \(백슬래쉬) + 문자 의 조합으로 표현
		System.out.println("ab\nc"); 
		// \n -> (new line) 엔터키에 해당하는 특수문자
		System.out.println("ab\tc"); 
		// \t -> (tab) 탭에 해당하는 특수문자
		System.out.println("ab\bc");
		// \b -> (backspace) 백스페이스에 해당하는 특수문자
		System.out.println("ab\rc");
		// \r -> (return) 프롬포트를 맨앞으로 보내는 특수문자
		
		System.out.println("ab\\c");
		// 백슬래쉬를 문자로 출력하고 싶을 때는 앞에 백슬래쉬를 붙임
		System.out.println("ab\"c");
		System.out.println("ab\'c");
		// 큰 또는 작은 따옴표를 문자로 사용하고 싶을 때는 앞에 백슬래쉬를 붙임
	}

}

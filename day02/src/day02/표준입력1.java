package day02;

// 자동 import 단축기 : CTRL + SHIFT + o
// import -> 라이브러리에서 클래스를 참조하기 위한 예약어

// java.lang 패키지 -> 자동으로 import되는 패키지

// java.lang 패키지에 속하지 않는 클래스를 사용하려면 import를 해야함
import java.util.Scanner;
// 관례상
// 클래스명은 첫글자가 대문자
// 변수명은 모두 소문자
// 메서드명은 모두 소문자
// 만약 두 단어의 합성어인 경우 뒤의 단어의 첫글자를 대문자

public class 표준입력1 {

	public static void main(String[] args) {
		// 특별히 클래스명의 변수를 인스턴스(또는 객체)라고 부름
		// 콘솔에서 키보드 입력을 받을 때는 Scanner 클래스를 사용
		Scanner in = new Scanner(System.in);
					     // 클래스명과 동일한 메서드 -> 생성자
					// System.in -> 표준입력스트림
		
		int a;
		
		System.out.println("정수를 입력하세요: ");
		a = in.nextInt(); // 정수를 입력받는 메서드
		
		System.out.println("입력한 정수는 "+ a + "입니다.");
	}

}

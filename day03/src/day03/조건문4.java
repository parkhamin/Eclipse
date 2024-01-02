package day03;
// 전체선택 단축키 : CTRL + a
// 자동정렬 단축기 : CTRL + SHIFT + f


public class 조건문4 {

	public static void main(String[] args) {
		int a = 10;
		String s = "";
		// 중첩된(nested) if~else문
		// if~else문 내부에 또 다른 if~else문을 작성가능
		
		if ( a > 0) {
			if ( a > 10) s= "10보다 큽니다.";
			else s = "양수입니다.";
		}else {
			if( a < -10) s= "-10보다 작습니다.";
			else s = "음수입니다";
		}
	}

}

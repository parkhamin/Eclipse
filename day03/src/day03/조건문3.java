package day03;

public class 조건문3 {

	public static void main(String[] args) {
		int a = 10;
		
		// if문의 조건식이 참일 때 실행하고자 하는 코드가 두줄 이상인 경우 {} 블럭으로 묶어야함.
		if ( a > 0 ) {
			System.out.println("양수");
			System.out.println("양수");
		}else {
			System.out.println("음수");
			System.out.println("음수");
		}
		// else문은 if의 조건이 참이 아닌 경우(그밖의 경우)에 실행할 코드를 작성
		// if문은 단독으로 사용가능하나, else문은 반드시 if와 같이 사용해야함.
		// else문도 실행할 코드가 2줄 이상인 경우 {}으로 묶어야함.
		
			
	}
}

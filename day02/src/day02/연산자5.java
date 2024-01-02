package day02;

public class 연산자5 {

	public static void main(String[] args) {
		// 논리연산자
		// & (앤퍼센드) | (버티컬바)
		// && (AND연산자) 논리곱
		// || (OR연산자) 논리합
		// ^ (XOR연산자) Exclusive OR (배타적논리합)
		// ! (NOT연산자)
		// 피연산자가 논리값, 연산의 결과도 논리값
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(false && true);
		System.out.println(false && false);
		// false가 하나라도 있으면 false 반환
		
		System.out.println(true || true);
		System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);
		// true가 하나라도 있으면 true 반환
		
		System.out.println(true ^ true);
		System.out.println(true ^ false);
		System.out.println(false ^ true);
		System.out.println(false ^ false);
		// 피연산자가 같을때만 false
		
		System.out.println(!true);
		System.out.println(!false);

	}

}

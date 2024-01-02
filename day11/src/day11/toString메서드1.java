package day11;
// String toString() 메서드

// 모든 자바 클래스가 가지고 있는 메서드
// -> 프로그래머가 클래스 내에서 직접 작성 가능

class A {

	public String toString() {
		return "A 클래스";
	}
}

public class toString메서드1 {

	public static void main(String[] args) {
		A a = new A();
		System.out.println(a);

	}

}

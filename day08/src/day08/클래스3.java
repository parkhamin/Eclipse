package day08;

class A {
	int a;
	double b;

	void print() {
		System.out.println(a + " " + b);
	}
}

public class 클래스3 {

	public static void main(String[] args) {
		A 가 = new A();

		// . -> 멤버 참조 연산자, 필드나 메서드에 접근할 때 사용
		// 인스턴스명.필드 또는 메서드
		가.a = 10;
		가.b = 3.14;
		가.print();

	}

}

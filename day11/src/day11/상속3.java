package day11;
class E{
	// 오버로딩(overloading)
	// : 클래스 안에 동일한 이름의 메서드를 여러개 만드는 것
	void print() {
		System.out.println("E 클래스");
	}
	void print(int a) {
		System.out.println("E 클래스");
	}
}
class F extends E{
	// 오버라이딩(overriding)
	// : super 클래스의 메서드를 재정의하는 것
	void print() {
		System.out.println("F 클래스");
	}
}
public class 상속3 {

	public static void main(String[] args) {
		F a = new F();
		a.print();

	}

}

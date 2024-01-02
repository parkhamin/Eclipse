package day08;
// 패키지 안에 동일한 이름을 가진 클래스가 존재해서는 안됨

class F{
	void m1() {
		System.out.println("메서드1");
	}
	void m2() {
		m1(); // 클래스 내부에 있는 다른 메서드를 호출 가능
	}
}

public class 메서드3 {

	public static void main(String[] args) {
		// 패키지 안에 있는 다른 파일에서 작성한 클래스를 사용할 수 있음.
		F a = new F();
		a.m2();

	}

}

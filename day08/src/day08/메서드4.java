package day08;

class G {
	// 메서드 오버로딩(overloading)
	// : 같은 이름을 가진 메서드를 여러개 선언
	// : 단, 매개변수의 형태가 달라야함
	void m1(int a) {
		System.out.println(a);
	}

	// int m1(int a) { return a; } x
	int m1(int a, int b) {
		return a + b;
	}

	double m1(double a) {
		return a;
	}
}

public class 메서드4 {

	public static void main(String[] args) {
		G a = new G();
		a.m1(1);
		a.m1(2, 2);
		a.m1(0.5);
	}

}

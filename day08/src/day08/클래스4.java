package day08;

class B{
	int a; // 필드 -> 클래스 내부에서 사용 가능
	
	void method(int b) { // 매개변수(parameter)
		                 // 메서드 외부에서 내부로 값을 전달할 때 사용
		int c; // 지역변수(local variable)
		// 지역변수와 매개변수는 메서드 안에서만 사용할 수 있음
	}
	
	void method2(int b) {
		int c;
		int a=b;
		System.out.println(a);
		System.out.println(this.a);
		// this ->현재 인스턴스를 지칭하는 지시어
		// 지역변수와 필드명 겹칠 때 필드를 가리키기 위해 사용
	}
}

public class 클래스4 {

	public static void main(String[] args) {
		B 가 = new B();
		가.a=10;
		가.method2(20);

	}

}

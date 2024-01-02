package day09;
import apple.test;
// 접근지정자(한정자)
// 메서드나 필드 앞에서 수식 -> public, (default), private, protected(상속 배울 때)
// 클래스 -> public, (default)
// public 클래스는 다른 패키지에서 import할 수 있음.
// (default)클래스는 다른 패키지에서 import할 수 없음.
// import apple.test2;


class C{
	int a; // 아무것도 안붙인 것 -> default 접근지정자 -> 패키지 내부에서 사용가능
	private int b; // private -> 클래스 내부에서만 사용가능
	public int c; // public -> 어디에서나 사용간으하게 하는 접근지정자
	
	public void method() {
		a=1;
		b=2;
		c=3;
	}
}
public class 접근지정자1 {

	public static void main(String[] args) {
		
		C d= new C();
		d.a=1;
		//d.b=2;
		d.c=3;
		
		test e = new test();
		//e.a =1;
		//e.b =2; 다른 패키지의 클래스의 default로 지정된 필드라서 접근 안됨
		
		//B f = new B();
	}

}

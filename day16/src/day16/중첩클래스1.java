package day16;
// 중첩(nested) 클래스
// : 클래스 내부에서 선언한 클래스

class Outer{
	Inner a = new Inner(); // 클래스 내부에서만 인스턴스를 만들어서 사용하기 위한 클래스
	
	class Inner{
		int a;
	}
}
public class 중첩클래스1 {
	public static void main(String[] args) {
		Outer a = new Outer();
		Outer.Inner b = a.new Inner();
	}
}

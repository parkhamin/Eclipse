package day11;
class A1{
	int a;
}
class C2{
	
}
//class B1 extends A1,C2{ -> java에서는 다중상속을 허용하지 않음
class B1 extends A1{
	int a;
	void method(int a) {
		a =1; // 매개변수, 지역변수 a
		this.a=2; // 필드 a
		super.a=3; // super클래스의 필드 a
	}
}
public class 상속5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

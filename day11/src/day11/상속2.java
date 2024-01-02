package day11;
// 상속 : 클래스의 코드를 재활용하는 것
class C1{ // 클래스 D의 super클래스, 부모(parent)클래스, 기반(Base)클래스
	int a=1;
}
       // extends 상속하려는 클래스명
class D extends C1{ // 클래스 C의 sub클래스, 자식(child)클래스, 파생(Derived)클래스
	int a=2;
	void print() {
		System.out.println(this.a); // this 키워드 -> 나 자신
		System.out.println(super.a); // super 키워드 -> super 클래스
	}
}

public class 상속2 {

	public static void main(String[] args) {
		D 가 = new D();
		가.print();

	}

}

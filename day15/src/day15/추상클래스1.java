package day15;

// abstract(추상) 클래스
// -> 클래스 선언시 앞에 abstract 수식어가 붙은 클래스
// -> 인스턴스를 생성할 수 없음 -> sub 클래스를 통해서 인스턴스화
// -> 추상 메서드를 포함할 수 있음
// -> 필드와 메서드가질 수 있음
abstract class Animal{
	int legs;
	int wing;
	// abstract(추상) 메서드 -> 이름만 있음
	abstract void move();
}

class Dog extends Animal{
	int legs = 4;
	// abstract 클래스의 sub클래스에서는 
	// super클래스의 abstract 메서드를 반드시 구현해야함.
	void move() {System.out.println("running");}
}

class Eagle extends Animal{
	int legs = 2;
	int wing = 2;
	void move() {System.out.println("flying");}
}

public class 추상클래스1 {
	public static void main(String[] args) {
		//Animal a = new Animal();
		Animal a = new Dog();
		a.move();
		Animal b = new Eagle();
		b.move();

	}

}

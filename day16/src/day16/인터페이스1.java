package day16;

// 추상클래스
// 인스턴스 생성 불가 -> sub클래스에서 인스턴스화
// 다중상속이 안됨
abstract class A{
	int a; // 필드 o
	final static int FIVE = 5; // 상수 o
	void method1() {System.out.println("메서드");} // 메서드
	abstract void method2(); // 추상 메서드
}

// 인터페이스
// 인스턴스 생성 불가 -> 무명 클래스로 인스턴스화
// 다중상속이 가능
interface B{
	//int a; 필드 x
	final static int FIVE = 5; // 상수 O
	//void method1() {System.out.println("메서드");} 메서드 x
	abstract void method2(int a); // 추상 메서드
	void method3(); // interface의 메서드는 어차피 추상 메서드이기 때문에 abstract 수식어 생략 가능
}

public class 인터페이스1 {

	public static void main(String[] args) {
		

	}

}

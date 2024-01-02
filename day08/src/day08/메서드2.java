package day08;

class E{
	// 메서드의 4가지 형태
	// 반환값 o, 매개변수 o
	int m1(int a) {return a;}
	
	// 반환값 o, 매개변수 x
	int m2() {return 3;}
	
	// 반환값 x, 매개변수 o
	void m3(int a) {System.out.println(a);}
	// 반환값이 없을 때는 void로 지정
	
	// 반환값 x, 매개변수 x
	void m4() {System.out.println("hello");}
	
}// 메서드를 작성 -> 메서드를 선언

public class 메서드2 {

	public static void main(String[] args) {
		E a = new E();
		int b= a.m1(10); // 메서드를 사용 -> 메서드를 호출
		// 메서드를 호출할 때는 선언한 메서드의 형식에 맞게해야함.
		// a.m1(); x -> 메서드 형식에 맞지 않게 호출하면 컴파일 오류
		a.m4();
	}

}

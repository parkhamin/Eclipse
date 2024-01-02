package day17;
;
// 무명(anonymous) 클래스
// : 이름이 없는 클래스
// : 1회용 클래스 -> 단 한 번만 인스턴스를 생성
// : 인터페이스를 써서 인스턴스를 생성

interface A{
	void print();
}

public class 무명클래스1 {
	public static void main(String[] args) {
		A a = new A() {
			public void print() {
				System.out.println("무명 클래스");
			}
		};
		a.print();
	}
}

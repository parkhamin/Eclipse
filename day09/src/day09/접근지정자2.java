package day09;

class E {
	private int a = 100;

	// 접근자
	// private 필드의 값을 클래스 외부에서 읽을 수 있게 해주는 메서드
	// 데이터타입은 필드와 동일 get필드명() -> get메서드
	public int getA() {
		return a;
	}

	// 설정자
	// private 필드의 값을 클래스 외부에서 바꿀 수 있게 해주는 메서드
	// void set필드명(필드와 동일한 타입의 매개변수) -> set메서드
	public void setA(int a) {
		this.a = a;
	}

}

public class 접근지정자2 {

	public static void main(String[] args) {
		E 가 = new E();
		// System.out.println(가.a); x
		System.out.println(가.getA());

		// 가.a = 200; x
		가.setA(200);

	}

}

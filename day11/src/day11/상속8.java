package day11;
class H1{
	// public H1(){}
	// -> 상속을 대비해서 기본 생성자를 추가해주는 것을 권장
	public H1(int a) {
		System.out.println("super클래스의 생성자");
	}
}

class I1 extends H1{
	// 만약 super클래스에 기본생성자가 없는 경우,
	// sub 클래스에서는 super클래스의 생성자의 매개변수 형식에 맞게
	// super()를 직접 호출해야함.
	public I1() {
		super(1); 
	}
}
public class 상속8 {

	public static void main(String[] args) {
		

	}

}

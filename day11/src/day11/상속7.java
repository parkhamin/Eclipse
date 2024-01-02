package day11;

class H{
	// 기본생성자(default constructor) : 매개변수가 없는 생성자
	// 생성자를 하나라도 정의하지 않은 경우 컴파일러가 기본생성자를 추가
	public H() {
		System.out.println("super클래스의 생성자");
	}
}
// sub클래스의 생성자에서는 super클래스의 생성자를 호출함
class I extends H{
	public I() {
		
	}
	
}

public class 상속7 {

	public static void main(String[] args) {
		H a = new H();
		I b = new I();

	}

}

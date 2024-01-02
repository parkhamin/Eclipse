package day11;
// Object 클래스 -> 자바의 최상위 클래스로 모든 클래스의 super클래스

class G extends E{
	// @-> 어노테이션(annotation)
	// 오버라이드 어노테이션
	// -> sub 클래스에서 작성한 메서드가 super클래스에도 있는지 학인하기  위한 용도
	// -> 만약 오버라이드 어노테이션을 붙였는데 컴파일 에러가 난다면, 
	//    재정의가 아닌 새로 작성하는 메서드임
	@Override
	public void print() {	System.out.println("G 클래스");	}
	
	//@Override
	public void print1() {	System.out.println("G 클래스");	}
	
	@Override
	public String toString() {	return "G클래스";	}
	// toString()메서드도 Object클래스의 메서드를 오버라이딩한 것임
}

public class 상속4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

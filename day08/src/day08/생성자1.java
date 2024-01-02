package day08;

class Fg{
	int a,b;
	// 만약 생성사를 프로그래머가 별도로 정의하지 않는 경우,
	// 컴파일러가 body가 비어있는 기본(default)생성자를 추가함
	// 기본 생성자 : 매개변수가 없는 생성자
	// 리턴타입을 지정하지 않음
	// 매개변수는 가질 수 있음
	// 오버로딩도 가능함
	Fg(){  }
    Fg(int a){ System.out.println(a); }
    Fg(String a){ System.out.println(a); }
    Fg(int a, int b){
    	this.a=a; this.b=b;
    }// 주로 필드를 생성과 동시에 초기화하는데 사용
}

public class 생성자1 {

	public static void main(String[] args) {
		Fg a = new Fg();
		// 클래스 이름하고 동일한 이름을 가진 메서드 -> 생성자(constructor)
		// 인스턴스를 생성할 때 하고 싶은 일들을 작성
		Fg b = new Fg(1);
		Fg c = new Fg("abc");

	}

}

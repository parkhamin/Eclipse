package day08;

// 변수명, 배열명, 클래스명, 메서드명 -> 식별자(identifier)
// 모두소문자, 모두소문자, 첫글자가대문자, 모두소문자
// class 클래스명{} -> 클래스를 선언 -> 프로그래머가 데이터타입을 직접 만든 것

class Ace{
	int a; // 멤버변수, 인스턴스 변수, 필드
	double b; 
	
	void print() { // 인스턴스 메서드, 메서드
		System.out.println(a+ " " + b);
	}
}

// 컴파일 -> 실행
public class 클래스2 {
	// 할당(allocation) -> 메모리에 저장공간을 확보
	public static void main(String[] args) {
		int a; // 지역변수(local variable)
		// -> 정적할당(static allocation): 컴파일 타임에 저장공간을 확보
		//    메모리에 stack 영역에 공간을 확보
		
		Ace b = new Ace(); // Ace클래스의 인스턴스 b를 생성
		// new -> 동적할당을 하는 키워드(예약어)
		// 동적할당(dynamic allocation): 실행 중간(런타임)에 저장공간을 확보
		// 메모리의 heap 영역에 공간을 확보
	}
}


package day08;

class I{
	int a=0;
	static int b=0;
	// static 필드
	// static 수식어가 붙은 필드
	// 데이터 영역에 할당 
	// -> 인스턴스 필드와 달리 컴파일 타임에 저장공간이 할당
	// -> new를 하지 않아도 공간이 있음
	// 초기화는 최초에 한번만 이루어짐
	// 모든 인스턴스가 변수를 공유
	
	I(){
		a++; 
		b++;
		System.out.println("a= "+a+" b= "+b);
	
	}
}

public class static변수1 {

	public static void main(String[] args) {
		I.b = 3; // 인스턴스 생성하지 않고도 사용가능
		         // 인스턴스명 대신 클래스명을 .앞에 적음
		I a = new I();
		I b = new I();
		I c = new I();

	}

}

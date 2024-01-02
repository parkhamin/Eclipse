package day08;

class C {
	int m1(int a) { return a + 3; }
	             // return -> 메서드가 종료하면서 남겨주는 값을 저장하는 키워드
	             // a+3 -> 반환값(return value)
	double m2() { return 3.5; }
	String m3() { return "문자열";}
	// 반환값의 타입을 메서드 앞에 명시해야함.
}

public class 메서드1 {

	public static void main(String[] args) {
		C 가 = new C();
		int a = 가.m1(10);
		System.out.println(a);
		
		System.out.println(가.m2());
		System.out.println(가.m3());
	}

}

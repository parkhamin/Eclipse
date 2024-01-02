package day11;

public class Wrapper클래스1 {

	public static void main(String[] args) {
		// Wrapper클래스 : 기본자료형을 참조자료형으로 사용하기 위한 클래스
		// 기본(primitive) 자료형      Wrapper 클래스
		byte a = 1;                 Byte a1 = a; // 기본자료형 -> 참조자료형: Boxing
		short b = 2;                Short b1 = b;
		int c = 3;                  Integer c1 = c;
		long d = 4;                 Long d1 = d;
		char e = 'a';               Character e1 = e;
		float f = 1.5f;             Float f1 = f;
		double g = 1.5;             Double g1 = g;
		boolean h = true;           Boolean h1 = h;
		
		byte a2 = a1; // 참조자료형->기본자료형:unBoxing
	}

}

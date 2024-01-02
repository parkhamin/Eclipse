package day03;

public class 형변환1 {

	public static void main(String[] args) {
		// 형변환(type conversion)
		// 데이터타입을 바꾸는 일
		
		byte a = 127;         //          1111 1111 
		short b = (short) a; // 0000 0000 1111 1111
		// byte 1바이트 short 2바이트
		// byte -> short
		// 크기가 작은 타입에서 큰 타입으로 형변환 -> up casting
		// 자료의 손실이 없음 -> 컴파일러가 자동으로 형변환을 해줌.
		// 자동 형변환, 묵시적 형변환
		
		short c = 768; //0000 0011 0000 0000
		byte d = (byte) c;
		// short -> byte
		// 크기가 큰 타입에서 작은 타입으로 형변환 -> down casting
		// 자료의 손실이 발생할 수 있음 -> 프로그래머가 직접 형변환
		// 강제 형변환, 명시적 형변환
		
		System.out.println(c);
		System.out.println(d);
		
		// 형변환을 하는 방법
		// 변수나 상수 앞에 ()를 치고 ()안에 변환하고자하는 타입을 기입
	}

}

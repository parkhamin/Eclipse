package day05;
// 랜덤수(난수)를 생성하는 방법
// 1. Math클래스의 random메서드를 사용
// 2. Random클래스를 사용하는 방법


public class 랜덤메서드1 {

	public static void main(String[] args) {
		
		// Math.random()은 0과 1사이의 double타입의 실수를 랜덤으로 리턴
		double a = Math.random();
		// 0 1 2
		System.out.println( (int)(a * 10) % 3);
		// 0.11 -> 1.1 -> 1 -> 1 % ? 
		
		System.out.println((int)(a * (3+1)));
		
		// 3 4 5 6
		double b = Math.random();
		// 0 1 2 3
		System.out.println(((int)(b * 10) % 4)+3);
	}

}

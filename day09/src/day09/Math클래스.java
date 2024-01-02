package day09;
// Math 클래스

// : 여러가지 수학관련 메서드나 필드를 포함하고 있음
// : 대부분의 static 멤버

public class Math클래스 {

	public static void main(String[] args) {
		// 0~1 사이의 double타입 실수를 랜덤으로 반환
		System.out.println(Math.random());
		System.out.println(Math.PI); // pi값
		System.out.println(Math.abs(-10)); // 절대값
		System.out.println(Math.ceil(0.5)); // 올림
		System.out.println(Math.floor(0.5)); // 내림
		System.out.println(Math.round(0.5)); // 반올림

		System.out.println(Math.max(1, 2)); // 큰 수 반환
		System.out.println(Math.min(1, 2)); // 작은 수 반환
		System.out.println(Math.sin(0.5)); // sin값
		System.out.println(Math.cos(0.5)); // cos값
		System.out.println(Math.tan(0.5)); // tan값

		System.out.println(Math.log(8)); // log값
		System.out.println(Math.pow(2, 3)); // 2의 3제곱
		System.out.println(Math.sqrt(9)); // 제곱근

	}

}

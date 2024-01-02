package day10;
// Date클래스 -> 시간을 알 수 있는 가장 간단한 클래스
// Calendar클래스 -> time존 설정 등 여러가지 시간을 조작하는 메서드 제공

public class Calendar클래스1 {

	public static void main(String[] args) {
		
		// 1970년 1월 1일 0시 0분 0초부터
		// 현재까지 누적된 시간
		// 단위는 1/1000초
		
		long time = System.currentTimeMillis();
		
		System.out.println(time);
	}

}

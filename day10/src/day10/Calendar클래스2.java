package day10;

import java.util.Calendar;

public class Calendar클래스2 {

	public static void main(String[] args) {
		// Calendar클래스는 일반적인 클래스들과 다르게
		// Calendar.getInstance()를 호출하여 인스턴스를 생성함.
		Calendar ca = Calendar.getInstance();
		
		long time = ca.getTimeInMillis(); // 누적시간 리턴
		System.out.println(time);
		
		System.out.println(ca.getTime()); // 시간을 특정 포맷으로 반환

	}

}

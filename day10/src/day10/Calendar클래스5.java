package day10;

import java.util.Calendar;

public class Calendar클래스5 {

	public static void main(String[] args) {
		Calendar ca= Calendar.getInstance();
		
		System.out.println(ca.get(Calendar.HOUR)); // 1~12시 표현
		System.out.println(ca.get(Calendar.HOUR_OF_DAY)); // 0~23시 표현
		System.out.println(ca.get(Calendar.MINUTE)); // 분
		System.out.println(ca.get(Calendar.MILLISECOND)); // 초
		System.out.println(ca.get(Calendar.AM_PM)); // 오전 -> 0, 오후 -> 1

	}

}

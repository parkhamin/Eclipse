package day10;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class SimpleDateFormat클래스1 {

	public static void main(String[] args) {

		// 2023년 3월 27일
		SimpleDateFormat f = new SimpleDateFormat("yyyy년 MM월 dd일");
		// 날짜를 표현할 포맷을 생성자에서 지정
		// y -> 연도, M -> 월, d -> 일
		// H -> 시간(24시표현), h -> 시(12시표현), m -> 분, s -> 초
		Date today = new Date();
		String s = f.format(today);
		// .format(Date클래스의 인스턴스)
		System.out.println(s);
		
		Calendar ca = Calendar.getInstance();
		String s1 = f.format(ca.getTime());
		                   // .getTime() : Calendar의 인스턴스를 Date클래스로 변환
		System.out.println(s1);
	}

}

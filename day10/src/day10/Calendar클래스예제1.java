package day10;

import java.util.Calendar;

public class Calendar클래스예제1 {

	public static void main(String[] args) {
		Calendar ca = Calendar.getInstance();

		System.out.print(ca.get(Calendar.YEAR) + "년 ");
		System.out.print(ca.get(Calendar.MONTH) + 1 + "월 ");
		System.out.print(ca.get(Calendar.DATE) + "일 ");

		String s = " 일월화수목금토";
		int index = ca.get(Calendar.DAY_OF_WEEK);
		System.out.println(s.charAt(index) + "요일");

		int am_pm = ca.get(Calendar.AM_PM);
		if (am_pm == 0)
			System.out.print("오전 ");
		else
			System.out.print("오후 ");

		System.out.print(ca.get(Calendar.HOUR) + "시 ");
		System.out.print(ca.get(Calendar.MINUTE) + "분");

	}

}

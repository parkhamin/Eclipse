package day10;

import java.util.Calendar;

public class Calendar클래스8 {

	public static void main(String[] args) {
		
		Calendar ca = Calendar.getInstance();
		// 이 달의 몇번째 주인지를 리턴
		System.out.println(ca.get(Calendar.WEEK_OF_MONTH));
		// 이 달의 몇번째 ?요일인지를 리턴
		System.out.println(ca.get(Calendar.DAY_OF_WEEK_IN_MONTH));
		// 올해의 몇번째 주인지를 리턴
		System.out.println(ca.get(Calendar.WEEK_OF_YEAR));
		
		ca.add(Calendar.MONTH, 1);
		System.out.println(ca.getActualMaximum(Calendar.DAY_OF_MONTH));
						// .getActualMaximum(필드)
		                // -> 필드가 가질 수 있는 실제 최대값을 리턴(예. 월의 일수)
	}

}

package day10;

import java.util.Calendar;

public class Calendar클래스3 {

	public static void main(String[] args) {
		Calendar ca= Calendar.getInstance();
		// .get(static 필드명) -> 필드에 해당하는 값을 int타입으로 리턴
		int year = ca.get(Calendar.YEAR);// 연도 리턴1
		System.out.println(year);
		                       // 월 리턴 0~11월 사용
		System.out.println(ca.get(Calendar.MONTH)+1+"월");
		System.out.println(ca.get(Calendar.DATE));
		System.out.println(ca.get(Calendar.DAY_OF_MONTH)); // 이달의 몇번째
		System.out.println(ca.get(Calendar.DAY_OF_YEAR)); // 올해의 몇번째
		System.out.println(ca.get(Calendar.DAY_OF_WEEK)); // 이주의 몇번째 날
		                               //일 월 화 수 목 금 토
		                               // 1 2 3 4 5  6 7
		
	}

}

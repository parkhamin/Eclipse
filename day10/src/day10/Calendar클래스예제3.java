package day10;

import java.util.Calendar;

public class Calendar클래스예제3 {

	public static void main(String[] args) {
		Calendar ca1 = Calendar.getInstance();
		Calendar ca2 = Calendar.getInstance();
		
		ca2.set(2023, 11, 25);
		int day = ca2.get(Calendar.DAY_OF_YEAR)-ca1.get(Calendar.DAY_OF_YEAR);
	
		
		System.out.println("크리스마스까지 D-"+day+"일");
	}

}

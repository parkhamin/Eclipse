package day10;

import java.util.Calendar;

public class Calendar클래스6 {

	public static void main(String[] args) {
		Calendar ca = Calendar.getInstance();
		// .get(필드) -> 값을 가져오는 것
		// .set(필드) -> 값을 변경하는 것
		
		System.out.println(ca.getTime());
		
		ca.set(Calendar.YEAR, 2024);
		System.out.println(ca.getTime());
		
		ca.set(2022, 1-1, 1); // .set(연,월,일)
		System.out.println(ca.getTime());
		
		ca.set(2023, 3-1, 27, 16, 0); // .set(연,월,일,시,분)
		System.out.println(ca.getTime());
		
	}

}

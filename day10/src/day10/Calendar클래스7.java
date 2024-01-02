package day10;

import java.util.Calendar;

public class Calendar클래스7 {

	public static void main(String[] args) {
		Calendar ca = Calendar.getInstance();
		
		System.out.println(ca.getTime());
		
		ca.add(Calendar.DATE, 2);
		// .add(필드, 더하려는수)
		System.out.println(ca.getTime());
		
		ca.add(Calendar.DATE, -3); // 음수도 가능
		System.out.println(ca.getTime());
		

	}

}

package day10;

import java.util.Calendar;

public class Calendar클래스4 {

	public static void main(String[] args) {
		Calendar ca = Calendar.getInstance();

		int index = ca.get(Calendar.DAY_OF_WEEK);
		String w1 = " 일월화수목금토";
		String s1=w1.charAt(index)+"요일";
	
		System.out.println(s1);
		
		String[] w2 = { "", "sun", "mon", "tue", "wed", "thu", "fri", "sat"};
		String s2= w2[index]+"day";
		System.out.println(s2);

	}
}

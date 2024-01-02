package day10;

import java.util.Calendar;
import java.util.Scanner;

public class SimpleDateFormat클래스예제2 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		Calendar ca = Calendar.getInstance();
		
		int year, month, date;
		
		System.out.println("년: ");
		year= in.nextInt();
		
		System.out.println("월: ");
		month= in.nextInt();
		
		System.out.println("일: ");
		date= in.nextInt();
		
		ca.set(year, month-1, date);
		
		String s = " 일월화수목금토";
		int index = ca.get(Calendar.DAY_OF_WEEK);
		System.out.print("당신은 "+s.charAt(index)+"요일에 태어나셨습니다.");
		
		in.close();

	}

}

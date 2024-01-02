package day10;

import java.util.Calendar;
import java.util.Scanner;

public class Calendar클래스예제6 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		Calendar ca = Calendar.getInstance();
		
		System.out.println("연: ");
		int year = in.nextInt();
		
		System.out.println("월: ");
		int month = in.nextInt();
		
		ca.set(Calendar.YEAR, year);
		ca.set(Calendar.MONTH, month);
		
		int index = ca.get(Calendar.DAY_OF_WEEK);
		int finish = ca.getActualMaximum(Calendar.DAY_OF_WEEK);
		
		System.out.println("일월화수목 금 토");
		for(int i=0;i<index-1;i++)
			System.out.print("\s");
		
		for(int i=0;i<finish;i++)
			System.out.print(i);
		
		
			
	}

}

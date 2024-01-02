package day10;

import java.util.Calendar;
import java.util.Scanner;

public class Calendar클래스예제5 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		Calendar ca = Calendar.getInstance();
		
		System.out.print("연도 입력: ");
		int year = in.nextInt();
		
		ca.set(year, 0, 1);
		
		while(true) {
			int index = ca.get(Calendar.DAY_OF_WEEK);
			if(index==1) {
				System.out.println(year+"의 첫번째 일요일은 "+(ca.get(Calendar.MONTH)+1)+"월 "+ca.get(Calendar.DATE)+"일");
				break;
			}
			ca.add(Calendar.DATE, 1);
		}
		
		in.close();
		
	}

}

package day10;

import java.util.Calendar;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Calendar클래스예제4 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		Calendar ca = Calendar.getInstance();
		Calendar now = Calendar.getInstance();

		System.out.println("목표 시간: ");
		String goal = in.nextLine();
		StringTokenizer str = new StringTokenizer(goal, ":");
		
		int hour = Integer.parseInt(str.nextToken());
		int minute = Integer.parseInt(str.nextToken());
		
		ca.set(Calendar.HOUR_OF_DAY, hour);
		ca.set(Calendar.MINUTE, minute);
		
		long remain = ca.getTimeInMillis() - now.getTimeInMillis();
		
		remain = remain/1000/60;
		System.out.println("남은 시간은 "+remain+"분");
		
		in.close();
	

	}

}

package day10;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Calendar클래스예제2 {

	public static void main(String[] args) {
		Calendar ca = Calendar.getInstance();
		SimpleDateFormat f= new SimpleDateFormat("yyyy년 MM월 dd일 E요일");
		
		System.out.println("오늘: "+f.format(ca.getTime()));
		
		ca.add(Calendar.DATE, 100);
		
		System.out.println("100일 후: "+f.format(ca.getTime()));
		
		
		
	}

}

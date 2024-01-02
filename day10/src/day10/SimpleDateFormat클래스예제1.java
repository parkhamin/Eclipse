package day10;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormat클래스예제1 {

	public static void main(String[] args) {

		SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date today = new Date();
		String s = f.format(today);
		System.out.println(s);

	}

}

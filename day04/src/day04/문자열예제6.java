package day04;

import java.util.Scanner;

public class 문자열예제6 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("주민번호 입력: ");
		String num = in.nextLine();
		int index = num.indexOf('-');
		
		String gender="";
		if(Integer.parseInt(num.charAt(index + 1)+"") % 2 == 1) 
			gender = "남성";
		else
			gender = "여성";
		
		int age = Integer.parseInt(num.substring(0,2)); //91
		
		int century=0;
		if (age >=0 && age <=23) {
			century = 21;
			age = 23- age + 1;
		}else {
			century = 20;
		    age = (100 - age) + 23 + 1;
		}
		
		System.out.println(gender+ ", "+age+"살, "+ century+"세기");
		
		
	}

}

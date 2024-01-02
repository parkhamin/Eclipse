package day13;

import java.util.HashMap;
import java.util.Scanner;

public class HashMap예제1 {

	public static void main(String[] args) {
		HashMap<String,String>hm = new HashMap<String,String>();
		Scanner in = new Scanner(System.in);
		
		hm.put("강철수", "010-8888-9999");
		hm.put("김철수", "010-8877-9999");
		hm.put("이민수", "010-8877-9966");
		hm.put("박민수", "010-9977-9966");
		hm.put("김민수", "010-9977-9955");
		

		while(true) {
			System.out.print("이름: ");
			String name = in.next();
			if(name.equals("end")) break;
			String phone = hm.get(name);
			System.out.println(phone);
		}
	}
}

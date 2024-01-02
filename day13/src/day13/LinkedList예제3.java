package day13;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;

public class LinkedList예제3 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		LinkedList<String> ll = new LinkedList<String>();
		
		while(true) {
			String s = in.nextLine();
			if(s.equals("end")) break;
			ll.add(s);
		}
		
		HashSet<String> hs = new HashSet<String>();
		
		for(String a : ll)
			hs.add(a);
		
		System.out.println("입력된 구의 종류: "+hs.size()+"개");
		in.close();
	}
}

package day12;

import java.util.LinkedList;

public class LinkedList예제2 {
	public static void main(String[] args) {
		LinkedList<String>ll = new LinkedList<String>();
		
		ll.add("종로구"); ll.add("중구"); ll.add("종로구"); ll.add("강남구"); ll.add("동대문구"); ll.add("종로구");
		
		int count=0;
		for(int i=0; i<ll.size(); i++) {
			if(ll.get(i).equals("종로구")) count++;
		}
		
		System.out.println("종로구: "+count+"개");
			
	}
}

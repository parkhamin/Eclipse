package day12;

import java.util.Random;
import java.util.Vector;

public class Vector예제2 {
	public static void main(String[] args) {
		Random r = new Random();
		Vector<String> v = new Vector<String>();
		v.add("terran"); v.add("zerg"); v.add("protoss");

		for(int i=1; i<=3; i++) {
			int bound = v.size();
			int num = r.nextInt(bound);
			String a = v.remove(num);
			System.out.println(i+": "+a);
		}
		
		
		
		
		
		
		
		
	}

}

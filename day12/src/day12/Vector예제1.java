package day12;

import java.util.Random;
import java.util.Vector;

public class Vector예제1 {
	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>();
		Random r = new Random();
		
		for(int i=1 ; i<=45; i++)
			v.add(i);
		
		System.out.println(v);
		
		// 중복 없도록 6개 선택
		for(int i=0; i<6; i++) {
			int bound = v.size();
			int num = r.nextInt(bound);
			int a = v.remove(num);
			System.out.print(a+" ");
			
		}
	}
}

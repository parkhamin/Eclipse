package day12;

import java.util.Vector;

public class Vector클래스4 {

	public static void main(String[] args) {
		Vector<Double> v = new Vector<Double>();

		v.add(1.5); v.add(2.3); v.add(3.7);

		int size = v.size();
		System.out.println(size);

		for (int i = 0; i < v.size(); i++)
			System.out.println(v.get(i));
		
		// Vector도 for-each문 사용가능
		for(Double a : v)
			System.out.print(a+" ");
	}

}

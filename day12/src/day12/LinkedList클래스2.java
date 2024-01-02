package day12;

import java.util.LinkedList;

class A {
	int a;
	private double b;

	public A(int a, double b) {
		this.a = a;
		this.b = b;
	}

	public String toString() {
		return a + " " + b;
	}
}

public class LinkedList클래스2 {
	public static void main(String[] args) {
		LinkedList<A> ll = new LinkedList<A>();
		
		ll.add(new A(1, 10.3));
		ll.add(new A(2, 20.3));
		ll.add(new A(3, 40.3));
		
		for(A a : ll)
			System.out.println(a);
	}
}

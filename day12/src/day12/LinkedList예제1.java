package day12;

import java.util.LinkedList;

class Person{
	String name;
	int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age=age;
	}
	
	public String toString() {return name+", "+age;}
}
public class LinkedList예제1 {
	public static void main(String[] args) {
		LinkedList<Person> ll = new LinkedList<Person>();
		
		ll.add(new Person("강철수", 35));
		ll.add(new Person("김철수", 25));
		ll.add(new Person("박민수", 21));
		ll.add(new Person("이정수", 40));
		ll.add(new Person("홍길동", 15));
		
		for(Person b : ll)
			System.out.println(b);
	}

}

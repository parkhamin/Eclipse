package day11;

class Person1 {
	String name;
	int age;

	public Person1(String name, int age) {
		this.name = name;
		this.age = age;
	}
}

class Adult extends Person1 {
	int id;

	public Adult(String name, int age, int id) {
		super(name, age);
		this.id = id;

		System.out.println(id + ": " + name + ", " + age);
	}
}

public class 상속예제1 {

	public static void main(String[] args) {
		Adult 가 = new Adult("홍길동", 30, 1);

	}

}

package day08;

class Person1 {
	String name;
	int age;
	double height;

	void print() {
		System.out.println(name + " " + age + "살 " + height + "cm");
	}
}

public class 클래스예제1 {

	public static void main(String[] args) {
		Person1 가 = new Person1();
		Person1 나 = new Person1();

		가.name = "홍길동";
		가.age = 25;
		가.height = 186.2;
		가.print();

		나.name = "박하민";
		나.age = 24;
		나.height = 161.0;
		나.print();

	}

}

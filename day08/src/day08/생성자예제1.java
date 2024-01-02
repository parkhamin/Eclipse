package day08;

class Person2{
	String name;
	int age;
	
	void print() {System.out.println(name+","+age);}
	
	Person2(String name, int age){
		this.name=name;
		this.age=age;
		print();
	}
	
}

public class 생성자예제1 {

	public static void main(String[] args) {
		Person2 a=new Person2("홍길동",30);

	}

}

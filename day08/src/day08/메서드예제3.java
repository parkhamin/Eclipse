package day08;

class Print {// 클래스 명의 첫글자는 대문자일 것
	void print() {
		System.out.println("메서드 오버로딩");
	}

	void print(int a) {
		System.out.println(a);
	}

	void print(double a) {
		System.out.println(a);
	}

	void print(char a) {
		System.out.println(a);
	}

	void print(String a) {
		System.out.println(a);
	}

	void print(String a, int b) {
		System.out.println(a + b);
	}

}

public class 메서드예제3 {

	public static void main(String[] args) {
		Print a = new Print();
		a.print();
		a.print(1);
		a.print(2.5);
		a.print('a');
		a.print("apple");
		a.print("apple", 1);

	}

}

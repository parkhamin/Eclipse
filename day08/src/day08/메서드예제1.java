package day08;

import java.util.Scanner;

class Phone {
	String name;
	String number;
	Scanner in = new Scanner(System.in);
	// 메서드: 자주 사용하는 코드를 간추려 놓은 것 -> 재사용을 위하여

	void input() {
		System.out.print("이름: ");
		name = in.nextLine();
		System.out.print("번호: ");
		number = in.nextLine();

	}

	void output() {
		System.out.println(name + " " + number);
	}

}

public class 메서드예제1 {

	public static void main(String[] args) {

		Phone a = new Phone();
		Phone b = new Phone();

		a.input();
		b.input();
		a.output();
		b.output();

	}

}

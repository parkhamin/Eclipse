package day11;

import java.util.Scanner;

class Phone {
	public Scanner in = new Scanner(System.in);
	private String name;
	private String num;

	public Phone() {
		input();
	}

	public void input() {
		System.out.println("이름: ");
		name = in.nextLine();
		System.out.println("전화번호: ");
		this.num = in.nextLine();
	}

	public void print() {
		System.out.println(name + ", " + num);
	}

	public String toString() {
		return name + ", " + num;
	}
}

public class 클래스배열예제1 {

	public static void main(String[] args) {

		Phone[] arr = new Phone[3];
		arr[0] = new Phone();
		arr[1] = new Phone();
		arr[2] = new Phone();

		for (int i = 0; i < arr.length; i++)
			System.out.println(arr[i]);
		// arr[i].print();

	}

}

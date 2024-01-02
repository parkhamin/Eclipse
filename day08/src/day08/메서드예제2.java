package day08;

import java.util.Scanner;

class Aver {
	int korean;
	int english;
	int math;
	
	Scanner in = new Scanner(System.in);

	void input() {
		System.out.println("국어 입력: ");
		korean = in.nextInt();
		
		System.out.println("영어 입력: ");
		english = in.nextInt();
		
		System.out.println("수학 입력: ");
		math = in.nextInt();
	}

	int total() {
		return korean + english + math;
	}

	double average() {
		return total() / 3.0;
	}

	void output() {
		System.out.println("평균: " + average());
	}
}

public class 메서드예제2 {

	public static void main(String[] args) {
		Aver a = new Aver();
		a.input();
		a.output();

	}

}

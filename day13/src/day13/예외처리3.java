package day13;

import java.util.Scanner;

// 예외가 발생할 가능성이 있는 메서드에 throws문 추가
// 일부 메서드는 반드시 예외처리를 해야함

public class 예외처리3 {
	public static void main(String[] args) {
		try {
			method();
		} catch (Exception e) {
			System.out.println("예외발생");
			//.printStackTrace();
		}
	}
	
	static void method() throws Exception{
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
	}
}

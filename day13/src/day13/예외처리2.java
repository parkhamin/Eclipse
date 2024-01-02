package day13;

import java.util.InputMismatchException;
import java.util.Scanner;

public class 예외처리2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] arr = new int[3];
		
		try {
			int a =in.nextInt(); // InputMismatchException
			System.out.println(10/a); // ArithmeticException
			arr[a] = 1; // ArrayIndexOutOfBoundsException
		}catch(InputMismatchException e) {
			System.out.println("정수만 입력하세요.");
			System.out.println(e.getMessage());
		}catch(ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다.");
			System.out.println(e.getMessage());
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("배열의 범위를 벗어났습니다.");
			System.out.println(e.getMessage());
		}finally { // 예외가 발생하던 안하던 반드시 실행할 코드 작성
			in.close();
			System.out.println("finally");
		}
	}
}

package day13;

import java.util.Scanner;

// 코딩할 때 발생하는 오류
// 1. 컴파일 오류 -> 오타 -> Error(에러)
// 2. 런타임 오류 -> 프로그램 실행 중간에 발생하는 오류 -> Exception(예외)
// 3. 논리적 오류 -> Bug
//    Debug -> 논리적 오류를 고치는 것

// 예외가 발생하면 프로그램이 비정상 종료됨
// 예외처리 -> 실행 중간에 예외가 발생해도 정상 종료되게 하는 것
public class 예외처리1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		// 예외가 발생할 가능성이 있는 코드를 try 블럭으로 묶고
		try {
			int a = in.nextInt();
			System.out.println(a);
		}catch(Exception e) { // 발생했을 때 실행할 코드를 catch 블럭에 작성
			// catch(예외의 종류)
			System.out.println("예외발생");
			System.out.println(e.getMessage());
			// .getMessage() -> 예외에 대한 설명
		}
	}
}

package day05;

import java.util.Scanner;

public class dowhile문예제1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int answer =(int)(Math.random()*100)+1;
		int count=0;
		int num=0;
		
		while(true) {
			System.out.println("1~100사이의 정수입력: ");
			num = in.nextInt();
			count++; // 시도횟수 즉 루프가 돈 횟수~
			
			if(num==answer) {
				System.out.println("정답,"+count+"회");
				break;
			}else if(num>answer) {
				System.out.println("Down~,"+count+"회");
			}else {
				System.out.println("Up!,"+count+"회");
			}
			
			
		}

	}

}

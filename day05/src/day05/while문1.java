package day05;

// 반복문
// 1. while문
// 2. do ~ while문
// 3. for문
// 4. for-each문

public class while문1 {

	public static void main(String[] args) {
		
		// while(조건식) 반복할 코드
		// 만약 반복할 코드가 2줄 이상이면 {}블럭으로 묶어야 함.
		// 특별히 반복문의 코드 블럭을 loop(루프)라고 부름.
		
	    //while(false)
		//  	System.out.println(1);
	    
		// ()안을 true -> 무한반복(무한루프)
		while(true) {
			System.out.println(1);
			System.out.println(2);
		}
	}

}

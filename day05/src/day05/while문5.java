package day05;

public class while문5 {

	public static void main(String[] args) {
		// 반복문 밖에서 선언한 변수는 반복이 종료되도 값이 계속 유지됨
		int a = 0;
		
		while(true){
			// 반복문 안에서 선언한 변수는 루프안에서만 사용가능
			// 반복할 때 마다 생성 소멸을 반복함 -> 값을 유지할 수 없음
			int b = 0;
			a++;
			b++;
			System.out.println("a="+a +" b="+b);
			
			if( a == 5 ) break;
		}
	}

}

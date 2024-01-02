package day05;

public class switch문3 {

	public static void main(String[] args) {
		
		// switch문의 한계1
		// ()안의 변수와 레이블로 실수 타입을 사용할 수 없음
		
		char ch = 'a';
		switch(ch) { // 문자 가능
		case 'a': case 'b': case 'c': // case 레이블을 연이어서 기입해도 무방함.
		}
		
		String s = "apple";
		switch(s) { // 문자열 가능 ( jdk 1.7 이후에 가능해짐 )
		case "apple": case "banana":
		}
		
		double b = 3.14;
		// switch(b) { case 3.14: }
		float c = 3.14f;
		// switch(c) { case 3.14f: }
		
		// switch문의 한계2
		// 변수와 레이블이 매칭되는 조건만 사용가능
		// 크기를 비교하는 연산은 사용할 수 없음
		int d = 5;
		if( d == 5 ) System.out.println("오");
		switch(d) { case 5: System.out.println("오");}
		
		
		
	}

}

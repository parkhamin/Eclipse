package day02;

public class 연산자7 {

	public static void main(String[] args) {
		// 증감연산자
		// ++ --
		// 단항연산자
		// 연산자 앞에 쓸때(전위표기-prefix)와 
		// 뒤에 쓸때(후위표기-postfix)의 차이가 있음
		
		int a = 10;
		a++; // 변수에 있는 값을 +1
		System.out.println(a);
		a--; // 변수에 있는 값을 -1
		System.out.println(a);

		++a;
		System.out.println(a);
		
		int b = 0 , c = 0;
		int d = 10, f = 10;
		
		b = d++; // b = d; d = d + 1; // 반환 후 증가
		c = ++f; // f = f + 1; c = f; // 증가 후 반환
		
		System.out.println(b);
		System.out.println(c);
		
		int g,h;
		g = h = 20;
		System.out.println(g++); // 반환 후 증가
		System.out.println(++h); // 증가 후 반환
		
	}

}

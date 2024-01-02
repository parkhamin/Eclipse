package day03;

public class 형변환2 {

	public static void main(String[] args) {
		
		int a = (int)3.14; // double을 int로 -> 소수점 이하 자리를 없앰
		
		System.out.println(a);
		
		double b = 3; // int를 double -> 컴파일러가 자동으로 형변환
		
		System.out.println(b);

	}

}

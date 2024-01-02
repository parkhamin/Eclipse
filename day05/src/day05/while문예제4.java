package day05;

public class while문예제4 {

	public static void main(String[] args) {
		
		int a =1;
		int mul = 1;
		
		while( a <= 10) {
			mul *= a;
			a++;
		}
		
		System.out.println("10!의 값은: "+ mul);
		
	}

}

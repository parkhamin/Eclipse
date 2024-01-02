package day06;

public class 구구단2 {

	public static void main(String[] args) {
		
		for(int i = 3; i<10; i+=2) {
			for(int j = 1; j<=i; j++) {
				System.out.println(i+ " x "+ j +" = "+(i*j));
			}
			System.out.println("-------------");
		}

	}

}

package day06;

public class 구구단3 {

	public static void main(String[] args) {
		
		for(int i = 1; i < 20 ; i++) {
			if(i<=9) {
				for(int j=1;j<10;j++)
					System.out.println(i+ " x "+ j +" = "+(i*j));
			}else {
				for(int j=1;j<20;j++)
					System.out.println(i+ " x "+ j +" = "+(i*j));
			}
			System.out.println("-----------------");
		}

	}

}

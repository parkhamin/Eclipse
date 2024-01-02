package day05;

public class while문예제5 {

	public static void main(String[] args) {
		
		int a =1;
		long sum = 0l;
		// 반복해서 합산하거나 곱할 때 변수의 값이 생각보다 커질 수 있음.
		// long이나 double로 타입을 지정하는 것이 좋음
		
		while(a <= 1000021) {
			sum += a;
			a++;
		}
		
		System.out.println("1부터 1000021까지의 합은: "+ sum);

	}

}

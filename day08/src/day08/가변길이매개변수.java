package day08;

class H {
	void sum(int... a) {
		int total = 0;
		for (int b : a)
			total += b;
		// 가변길이매개변수.length -> 변수의 개수
		System.out.print(a.length+"개 ");
		System.out.println(total);
	}
}

public class 가변길이매개변수 {

	public static void main(String[] args) {
		H a = new H();
		a.sum(1, 2, 3);
		a.sum(1, 2, 3, 4, 5, 6);
		a.sum(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

	}

}

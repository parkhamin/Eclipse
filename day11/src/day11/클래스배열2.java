package day11;

class C {
	public String toString() {
		return "C클래스";
	}
}

public class 클래스배열2 {

	public static void main(String[] args) {
		// 기본자료형 배열의 초기화
		// int[] arr1 = { 10, 20, 30 };

		// 클래스 배열의 초기화
		C[] arr2 = { new C(), new C(), new C() };
		// C[0] = new C(); C[1] = new C(); C[2] = new C();

		for (C a : arr2)
			System.out.println(a);
	}

}

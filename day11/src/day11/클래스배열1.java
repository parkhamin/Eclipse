package day11;

class B {
	int a;
	double b;
}

public class 클래스배열1 {

	public static void main(String[] args) {
		// 기본자료형의 배열
		int[] arr1 = new int[3];
		arr1[0] = 10;
		arr1[1] = 20;
		arr1[2] = 30;

		// 클래스 배열
		B[] arr2 = new B[3]; // 클래스 배열의 원소들의 id를 저장할 공간 확보
		arr2[0] = new B(); // 클래스 배열의 인스턴스를 생성해야 배로소 저장공간이 확보
		arr2[1] = new B();
		arr2[2] = new B();
	}

}

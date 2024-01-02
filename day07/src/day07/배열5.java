package day07;

public class 배열5 {

	public static void main(String[] args) {

		double[] arr = { 1.2, 3.5, 5.0, 3.3 };

		for (int i = 0; i < arr.length; i++) {
			arr[i]=10.0;
			System.out.println(arr[i]);
		}
		
		// for-each문
		// for( 배열의 값을 가져와 임시로 저장할 변수 : 배열명 )
		// -> 배열에서 첫번째 원소부터 차례대로 값을 읽어와 변수에 저장
		// -> 단순히 값을 읽어오는 것일 뿐, 배열의 원소의 값을 수정할 수는 없음
		for( double a : arr ) {
			a = 20.0;
			System.out.println(a);
		}
		
		for( double a : arr ) {
			System.out.println(a);
		}


	}

}

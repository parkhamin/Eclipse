package day07;

public class 배열예제4 {

	public static void main(String[] args) {
		
		int arr[]= {1,2,3,4,5,2,2,6,7,3};
		int count=0; // 2의 개수를 셀 변수
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==2) count++;
		}
			
		System.out.println(count+"개");
	}

}

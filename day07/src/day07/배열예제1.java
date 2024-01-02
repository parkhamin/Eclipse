package day07;

public class 배열예제1 {

	public static void main(String[] args) {
	
		int arr[]= {1,1,2,3,5,8};
		int sum=0;
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
			sum+=arr[i];
		}
		System.out.println();
		System.out.println("배열의 길이: "+arr.length);
		System.out.println("모든 원소의 합: "+sum);
	}

}

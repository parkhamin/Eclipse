package day07;

public class 배열예제2 {

	public static void main(String[] args) {
		 
		int arr[] = {1,2,4,3,5};
		int result=0;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==3) {
				result = i+1;
				break;
			}
		}
		System.out.println(result+"번째 원소");

		}

	}



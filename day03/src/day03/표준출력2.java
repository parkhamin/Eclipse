package day03;

public class 표준출력2 {

	public static void main(String[] args) {
		System.out.printf("%d\n", 3);
		System.out.printf("%1d\n", 3);
		System.out.printf("%2d\n", 3);
		System.out.printf("%3d\n", 3); 
		// %와 알파벳 사이의 숫자만큼 공간을 확보 후 오른쪽 정렬해서 출력
		System.out.printf("%03d\n", 3);
		System.out.printf("%05d\n", 3);
		// 0을 추가하면 빈 부분을 0으로 채움
		System.out.printf("%+05d\n", 3);
		System.out.printf("%+05d\n", -3);
		// +를 추가하면 부호를 붙임
		
		System.out.printf("%.1f\n", 1.23456);
		System.out.printf("%.2f\n", 1.23456);
		System.out.printf("%.15f\n", 1.23456);
		// % 알파벳 사이의 .숫자의 소수점이하 자리수만큼만 출력
		

	}

}

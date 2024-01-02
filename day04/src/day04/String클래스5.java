package day04;

public class String클래스5 {

	public static void main(String[] args) {
		// 문자열.indexOf(문자)
		// -> 문자열에서 문자의 인덱스(순서)를 리턴
		
		int index = "apple".indexOf('l');
		
		System.out.println((index+1)+"번째");
		
		System.out.println("banana".indexOf('a'));
		// 문자가 여러개일 경우 앞에서부터 찾아서 첫번째의 인덱스를 리턴
		
		System.out.println("banana".lastIndexOf('a'));
		// lastIndexOf()는 뒤에서부터 제일 마지막의 인덱스를 리턴
		
		System.out.println("banana".indexOf('c'));
		// 찾고자하는 문자가 없는 경우 -1을 리턴
		
		System.out.println("banana".indexOf("na"));
		// 문자뿐만아니라 문자열도 가능
		
	}

}

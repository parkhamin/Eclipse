package day11;

class Person {
	private String name;
	private int age;
	
	public int getAge() { return age;}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String toString() {
		return name + ", " + age;
	}

}

public class 클래스배열예제2 {

	public static void main(String[] args) {
		Person[] arr = { new Person("김명순", 70), new Person("나미진", 51), new Person("박하은", 21), new Person("박하민", 24),
				new Person("박룽지", 1) };
		// for (Person a : arr) {System.out.println(a);}
		for (int i = 0; i < arr.length; i++)
			System.out.println(arr[i]);

		/*
		int max = arr[0].age;
		int min = arr[0].age;
		int max_index = 0;
		int min_index = 0;
		for (int i = 1; i < arr.length; i++) {
			if (max < arr[i].age)
				max_index = i;
			if (min > arr[i].age)
				min_index = i;
		}

		System.out.println("나이가 가장 많은 사람: " + arr[max_index]);
		System.out.println("나이가 가장 적은 사람: " + arr[min_index]);
		*/
		
		Person old = null; // 클래스들은 null로 초기화
		old=arr[0];
		Person young= null;
		young=arr[0];
		
		for(int i=1;i<arr.length;i++) {
			if(old.getAge()<arr[i].getAge()) {
				old=arr[i];
			}
			if(young.getAge()>arr[i].getAge()) {
				young=arr[i];
			}
		}
		
		System.out.println("나이가 가장 많은 사람: " + old);
		System.out.println("나이가 가장 적은 사람: " + young);
		
		
	}

}

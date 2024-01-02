package day08;

class 소녀시대 {
	void print(String... name) {
		System.out.print(name.length+"명 ");
		for (int i = 0; i < name.length; i++) {
			if (i == name.length - 1)
				System.out.print(name[i]);
			else
				System.out.print(name[i] + ", ");
		}
		System.out.println();
	}
}

public class 가변길이매개변수예제1 {

	public static void main(String[] args) {
		소녀시대 a = new 소녀시대();
		a.print("윤아");
		a.print("윤아", "제시카");
		a.print("윤아", "제시카", "태연");
		a.print("윤아", "제시카", "태연", "티파니");
		a.print("윤아", "제시카", "태연", "티파니", "유리");

	}

}

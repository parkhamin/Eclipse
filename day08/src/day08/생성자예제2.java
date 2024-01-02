package day08;

class 소녀시대2 {
	String name;
	int rap, dance, vocal;

	소녀시대2(String name) {
		this.name = name;
		System.out.println(this.name);
	}

	소녀시대2(String name, int rap) {
		this.name = name;
		this.rap = rap;
		System.out.println(this.name + ", " + this.rap);
	}

	소녀시대2(String name, int rap, int dance) {
		this.name = name;
		this.rap = rap;
		this.dance = dance;
		System.out.println(this.name + ", " + this.rap + ", " + this.dance);
	}

	소녀시대2(String name, int rap, int dance, int vocal) {
		this.name = name;
		this.rap = rap;
		this.dance = dance;
		this.vocal = vocal;
		System.out.println(this.name + ", " + this.rap + ", " + this.dance + ", " + this.vocal);
	}

}

public class 생성자예제2 {

	public static void main(String[] args) {
		소녀시대2 윤아 = new 소녀시대2("윤아");
		소녀시대2 티파니 = new 소녀시대2("티파니", 90);
		소녀시대2 제시카 = new 소녀시대2("제시카", 90, 80);
		소녀시대2 태연 = new 소녀시대2("태연", 90, 80, 100);

	}

}

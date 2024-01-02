package day11;

class Student {
	String name;
	String id;
	int kor, eng, math;
}

class SportStudent extends Student {
	int running;
}

class ArtStudent extends Student {
	int painting;
}

class MusicStudent extends Student {
	int singing;
}

public class 상속1 {

	public static void main(String[] args) {
		SportStudent a = new SportStudent();
		a.name = "홍길동";
		a.id = "20230001";
		a.kor = a.eng = a.math = 80;
		a.running = 100;
	}

}

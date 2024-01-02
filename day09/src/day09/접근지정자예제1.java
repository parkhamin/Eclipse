package day09;

class Student2 {
	private int eng, math;

	public void setEng(int eng) {
		this.eng = eng;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getEng() {
		return eng;
	}

	public int getMath() {
		return math;
	}

}

public class 접근지정자예제1 {

	public static void main(String[] args) {
		Student2 a = new Student2();
		a.setEng(90);
		a.setMath(95);
		System.out.println(a.getEng());
		System.out.println(a.getMath());

	}

}

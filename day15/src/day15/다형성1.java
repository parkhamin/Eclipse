package day15;

class Unit{
	void move() {}
}

class Marine extends Unit{
	void move() {System.out.println("걸어다님");}
}

class Hydra extends Unit{
	void move() {System.out.println("뛰어다님");}
}

class Carrier extends Unit{
	void move() {System.out.println("날아다님");}
}

public class 다형성1 {
	public static void main(String[] args) {
		Marine a = new Marine();
		Hydra b = new Hydra();
		Carrier c = new Carrier();
		
		// 다형성
		// super 클래스의 참조변수로 여러개의 sub 클래스 인스턴스를 지칭할 수 있음
		Unit temp;
		temp = a;	temp.move();
		temp = b;	temp.move();
		temp = c;	temp.move();

	}

}

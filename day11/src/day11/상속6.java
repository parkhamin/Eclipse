package day11;

import test.G1;

//protected 접근지정자
// : 패키지가 달라도 상속한 클래스에서 접근가능하게 하는 접근지정자

class G2 extends G1{
	void print() {
		//super.a=1; private 필드라 x
		//super.b=1; (default) 필드라 x
		super.c=1; // protected
		super.d=1; // public
	}
}
public class 상속6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

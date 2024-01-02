package day11;

class J<T>{ // <T> -> 타입 매개변수 -> 자료형을 T로 대체
	// 일반화(generalization)한 클래스
	T a;
	T getA() {return a;}
}
class J1{
	int a;
	int getA() {	return a;	}
}
class J2{
	double a;
	double getA() {		return a;	}
}
class J3{
	String a;
	String getA() {		return a;	}
}
public class 일반화클래스1 {

	public static void main(String[] args) {
		J<Integer> a = new J<Integer>();
		J<Double> b = new J<Double>();
		J<String> c =new J<String>();
		

	}

}

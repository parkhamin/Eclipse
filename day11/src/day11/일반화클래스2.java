package day11;

// 일반화클래스의 타입매개변수를 여러개 써도 무방
// 타입 매개변수는 레퍼런스 타입만 가능(기본타입은 불가능 ex) int,double)
class K<T1,T2>{
	String c; // 타 형식과 혼용해도 무방
	double d;
	T1 a;
	T2 b;
	T1 method(T2 c) {
		return a;
	}
}
public class 일반화클래스2 {

	public static void main(String[] args) {
		K<Integer,Double> a = new K<Integer,Double>();
		K<Double, Integer> b = new K<Double,Integer>();

	}

}

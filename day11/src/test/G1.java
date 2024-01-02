package test;

public class G1 {
	private int a; // 클래스 내부에서만 접근가능(가시적)
	int b; // 패키지 내부에서 접근가능
	protected int c; // 패키지가 달라도 상속한 클래스에서는 접근가능
	public int d; // 모든 곳에서 접근가능
}

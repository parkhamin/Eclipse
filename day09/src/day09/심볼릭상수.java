package day09;
class F{
	// final 수식어가 붙은 필드는 초기화된 값을 수정할 수 없음
	final public static int FIVE = 5;
	// final과 static 수식어가 붙은 필드 -> 심볼릭 상수로 사용 가능
}
public class 심볼릭상수 {

	public static void main(String[] args) {
		int a = F.FIVE;
		System.out.println(a);
	}

}

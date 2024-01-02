package day07;

import java.util.Random;

public class 보안문자 {

	public static void main(String[] args) {
		Random r = new Random();

		String s = ""; // 보안문자 저장할 변수

		String a = "0123456789abcdefghijklmnopqrstuvwxyz";

		for (int i = 0; i < 8; i++) {
			int index = r.nextInt(a.length());
			s += a.charAt(index);
		}
		System.out.println("보안문자: " + s);

	}

}

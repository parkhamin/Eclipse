package day09;

import java.util.Scanner;
import java.util.StringTokenizer;

public class StringTokenizer클래스예제3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		while (true) {
			String s = in.nextLine();
			if(s.equals("end")) break;
			StringTokenizer st = new StringTokenizer(s, "+-", true);

			int output = Integer.parseInt(st.nextToken());

			while (st.hasMoreTokens()) {
				String a = st.nextToken();
				int b = Integer.parseInt(st.nextToken());
				if (a.equals("+"))
					output = output + b;
				if (a.equals("-"))
					output = output - b;
			}
			System.out.println(output);

		}
	}
}

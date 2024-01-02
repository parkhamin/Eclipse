package day15;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class 버퍼파일입출력예제6 {

	public static void main(String[] args) throws IOException {

		String path = "C:\\Users\\parkh\\Desktop\\javatest\\";
		FileReader fr = new FileReader(path + "이름.txt");
		BufferedReader br = new BufferedReader(fr);
		Scanner in = new Scanner(br);

		LinkedList<String> ll = new LinkedList<String>();

		while (in.hasNext())
			ll.add(in.next());

		in.close();

		String[] arr = new String[ll.size()];

		for (int i = 0; i < arr.length; i++)
			arr[i] = ll.get(i);

		Arrays.sort(arr);

		FileWriter fw = new FileWriter(path + "이름.txt");
		PrintWriter pw = new PrintWriter(fw);
		for (int i = 0; i < arr.length; i++)
			pw.printf("%d %s\n", i + 1, arr[i]);

		pw.close();
		System.out.println("파일 내용을 정렬했습니다.");

	}

}

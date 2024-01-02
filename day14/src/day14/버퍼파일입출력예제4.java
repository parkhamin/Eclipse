package day14;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class 버퍼파일입출력예제4 {

	public static void main(String[] args) throws IOException {
		String path = "C:\\Users\\parkh\\Desktop\\javatest\\";
		FileReader fr = new FileReader(path + "input.txt");
		BufferedReader br = new BufferedReader(fr);
		Scanner in = new Scanner(br);

		ArrayList<String> a1 = new ArrayList<String>();

		while (in.hasNext()) {
			String s = in.nextLine();
			a1.add(s);
		}
		// System.out.println(a1);
		in.close();

		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		for (String a : a1) {
			hm.put(a, hm.containsKey(a) ? hm.get(a) + 1 : 1);
		}
		FileWriter fw = new FileWriter(path + "output.txt");
		PrintWriter pw = new PrintWriter(fw);

		Iterator i = hm.keySet().iterator();

		while (i.hasNext()) {
			String key = (String) i.next();
			int value = hm.get(key);
			pw.println(key + " " + value);
		}
		pw.close();
	}

}

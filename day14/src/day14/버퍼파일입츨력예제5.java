package day14;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class 버퍼파일입츨력예제5 {

	public static void main(String[] args) throws IOException {
		
		String path = "C:\\Users\\parkh\\Desktop\\javatest\\";
		FileReader fr = new FileReader(path + "이름.txt");
		BufferedReader br = new BufferedReader(fr);
		Scanner in = new Scanner(br);
		
		ArrayList<String> a1 = new ArrayList<String>();

		while (in.hasNext()) {
			String s = in.nextLine();
			a1.add(s);
		}
		in.close();
		FileWriter fw = new FileWriter(path + "김씨.txt");
		PrintWriter pw = new PrintWriter(fw);
		
		for(String a : a1)
			if(a.charAt(0)=='김') pw.println(a);
		
		pw.close();
	}

}

package day11;

import java.util.Random;

class Dog{
	private String breed;
	private int month;
	String[] s = {"푸들","코카스패니얼","요크셔테리어"};
	
	public Dog() {
		Random r = new Random();
		breed = s[r.nextInt(s.length)];
		month = r.nextInt(1,13);
		
		System.out.println(toString());
	}
	
	public String toString() {return breed+", "+month+"개월";}
}

public class 클래스배열예제3 {

	public static void main(String[] args) {
		
		Dog[] 나 = new Dog[5];
		
		나[0]= new Dog();
		나[1]= new Dog();
		나[2]= new Dog();
		나[3]= new Dog();
		나[4]= new Dog();

	}

}

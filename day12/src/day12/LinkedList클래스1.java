package day12;

import java.util.LinkedList;

// ArrayList, LinkedList는 List 클래스의 sub 클래스
// List는 원소를 나열한 형태의 자료구조(Data Structure)
// 자료구조 -> 메모리에 데이터가 저장되는 형태(구조)
// 파일시스템 -> 보조기억장치(SSD,HDD)에 데이터가 저장되는 구조
// 리스트의 특징
// 1. 원소들 사이에 순서가 있고(즉, 인덱스가 있음)
// 2. 크기가 동적으로 늘어남
// 3. 값이 중복되어도 상관없음
// 4. 모양만 정의되고 원소의 타입이 정해지지 않음 -> 추상 자료형

// LinkedList도 ArrayList와 메서드명이 같음
public class LinkedList클래스1 {
	public static void main(String[] args) {
		LinkedList<Integer> al = new LinkedList<Integer>();
		
		System.out.println(al.isEmpty());
		
		al.add(10); al.add(20); al.add(30);
		System.out.println(al);
		
		System.out.println(al.remove(0));
		System.out.println(al);
		
		al.set(1, 35);
		System.out.println(al);
	}

}

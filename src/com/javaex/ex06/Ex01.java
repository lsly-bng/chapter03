package com.javaex.ex06;

public class Ex01 {

	public static void main(String[] args) {

		String s01 = new String ("안녕하세요");
		String s02 = new String ("안녕하세요");
		
		System.out.println(s01.toString());
		System.out.println(s02.toString());

		System.out.println(s01==s02);

		System.out.println("===================");

		String s03 = "hi";
		String s04 = "hi";
		
		System.out.println(s03.toString());
		System.out.println(s04.toString());
		System.out.println(s03==s04); //true
		
		System.out.println("===================");
		
		s03 = "hihi"; //s03 담은 내용 변경 (hi-->hihi) ==> 자동으로 새로운 주소에 담음
		System.out.println(s03.toString());
		System.out.println(s04.toString()); 
		System.out.println(s03==s04); //false
		
		System.out.println("===================");
	}

}

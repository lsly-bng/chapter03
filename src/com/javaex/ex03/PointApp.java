package com.javaex.ex03;

public class PointApp {

	public static void main(String[] args) {

		Point p01 = new Point(2,3);
		Point p02 = new Point(2,3);
		Point p03 = new Point(2,2);
		Point p04 = p01;
		
		//실제 결과값은 false
		System.out.println(p01==p02); //주소 비교
		
		//equals 재정의하여 결과값이 true
		System.out.println(p01.equals(p02)); //논리비교
		System.out.println(p02.equals(p01)); //논리비교

		System.out.println(p01.equals(p03)); //논리비교
		System.out.println(p02.equals(p03)); //논리비교
		
		System.out.println(p01==p04);
		System.out.println(p01.equals(p04));
	}

}

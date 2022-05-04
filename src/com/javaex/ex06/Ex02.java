package com.javaex.ex06;

public class Ex02 {

	public static void main(String[] args) {

		String a = new String(" abcd");
		String b = new String(",efg ");
		
		/*
		 * System.out.println(a.concat(b)); System.out.println(a+b);
		 */
		
		//concat 설명 : a에 b의 값을 더해서 출력하라는 의미 (a+b)
		a = a.concat(b);
		System.out.println(a);
		
		//trim 설명 : 불필요한 공백 제거하라 (주로 앞뒤에 발생하는 공백)
		a = a.trim(); 
		System.out.println("=="+a+"==");
		
		//replace 설명 : a의 값 중 ab 내용을 12로 대체하여 출력하라는 의미
		a = a.replace("ab", "12"); //대체 될 내용 자릿수에 제한이 없음 --> 12345으로 ab 대체 가능
		System.out.println(a);
		
		//split 설명 : 값을 분리해라는 의미
		System.out.println("=======================");
	
		String[] sArray = a.split(","); //',' 콤마로 split 해라 --> 콤마 있으면 뺴고 출력
		
		for(int i=0; i<sArray.length; i++) {
			System.out.println(sArray[i]);
		}
		
		System.out.println(a);
		
		//substring 설명 1 : 숫자하나 입력 시, 그 숫자부터 출력이라는 의미
		System.out.println("=======================");
		
		String str = "Hello JAVA!";
		String result01 = str.substring(3); //3번 방부터 출력하라는 의미
		System.out.println(result01);
		
		//substring 설명 2 : 숫자 2개 입력 시, 첫 숫자부터 두번째 숫자까지만 출력하라는 의미;
		String result02 = str.substring(1,7);
		System.out.println(result02);
		
		//charAt 설명 : 앞에 String 으로 사용하면 오류뜸.
		char result03 = str.charAt(8);
		System.out.println(result03);
		
		
	}

}

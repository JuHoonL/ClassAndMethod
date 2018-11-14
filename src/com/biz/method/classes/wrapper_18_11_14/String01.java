package com.biz.method.classes.wrapper_18_11_14;

public class String01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String형(type)은 일반 변수처럼 사용 되지만 실제로는 class이다.
		//다른언어(C언어)에 없는 문자열 데이터를 취급하기 위한 자료형
		String strName = "홍길동";
		String strN = "";
		System.out.println(strN);
		
		String strNation = new String();
		System.out.println(strNation);
		
		String strDog = new String("불독");
		// => String strDog = "불독"과 같다.
		
		strNation = "대한민국";
		strName = "Tom Cruise";
		System.out.println("문자열의 길이 : " + strNation.length());
		
		System.out.println(strName.toLowerCase());
		System.out.println(strName.toUpperCase());
		
		if(strName.toUpperCase() == "TOM CRUISE") {			// 객체오류 => 문법상 맞지만 결과 X
			System.out.println("탐크루즈 맞네!!");
		}
		if(strName.toLowerCase() == "TOM CRUISE") {			// 객체오류 => 문법상 맞지만 결과 X
			System.out.println("탐크루즈 맞네!!");
		}
		
		String strA = "A";
		if(strA == "A") {
			System.out.println("대문자 A 네!!");
		}
		
		if(strName.equals("Tom Cruise")) {						// String class안에 있는 문자열 비교 method
			System.out.println("진짜 탐이네!!");
		}
		
		if(strName.toUpperCase().equals("TOM CRUISE")) {		// 대문자변환 비교 method
			System.out.println("대문자 TOM");
		}
		if(strName.toLowerCase().equals("tom cruise")) {		// 소문자변환 비교 method
			System.out.println("소문자 tom");
		}
		
		if(strName.equalsIgnoreCase("toM Cruise")) {			// 대, 소문자 관계없이 문자열 비교 method
			System.out.println("섞어섞어 탐탐");
		}
	}

}

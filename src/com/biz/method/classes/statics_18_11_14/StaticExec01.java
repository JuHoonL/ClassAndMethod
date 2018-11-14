package com.biz.method.classes.statics_18_11_14;

public class StaticExec01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Nations.KOREA);
		System.out.println(Nations.USA);
		System.out.println(Nations.UAE);
		System.out.println(Nations.RUSIA);
		System.out.println(Nations.CHINA);
		// 키워드 다음에 오는 단어가 기울어져있으면 전부 static class의 객체이다.
		
		String strNum = "30";
		int intNum = Integer.valueOf(strNum);
		System.out.println(intNum); 		// 문자열을 정수로 바꿔라
		
		String strName = "대한민국";
		if(strName.equals("대한 민국")) {
		}
		
		if(strName.equals(Nations.KOREA)) {
		}
		
		/*
		  Nations.KOREA = "우리나라";
		  if(strName.equals(Nations.KOREA)) {}
		  
		   => Nations class에서 final로 상수로서 지정해버렸기 때문에 변경 X
		*/	
		
		
	}

}

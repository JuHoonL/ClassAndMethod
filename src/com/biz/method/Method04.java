package com.biz.method;

public class Method04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intNum1= 0;					// int intNum1; 처럼 선언만 된 변수는 null 값을 가지고 있다고 가정
		System.out.println(intNum1);
		
		String strName = "";			// String strName; 처럼 선언만 된 변수는 null 값을 가지고 있다고 가정
		System.out.println(strName);
		
		String strName1 = null;			// 변수를 선언만 할 경우 null은 변수를 읽으려 할 때 오류 가능성있음
		System.out.println(strName1);
		
		int intNum2 = 0;				// 변수를 선언만 할 경우에는 숫자형 변수는 0으로 초기화, null은 잠재적 오류발생 가능성있음
		String strName2 = "";			// 변수를 선언만 할 경우에는 문자형 변수는 ""(으)로 초기화, null은 잠재적 오류발생 가능성있음
		Boolean b1 = false;				// 변수를 선언만 할 경우에는 불린형 변수는 false로 초기화, null은 잠재적 오류발생 가능성있음
	}

	public static int addVar(int intA, int intB) {
		return 0;
	}
	
	public static float addVar(float fA, float fB) {
		return 0.0f;
	}
	
	public static String addVar(String strA, String strB) {
		// return "";			// ""는 16진수값으로(아스키코드) 0이라는 값이 있음.
		return null;			// null : 크기, 값, 형태, 모양, 타입도 없는 것 (null != 0)
	}
}

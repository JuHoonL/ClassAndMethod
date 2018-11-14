package com.biz.method.classes.wrapper_18_11_14;

public class Integer01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String strNum1 = "30";
		String strNum2 = "50";
		
		String strSum = strNum1 + strNum2;
		strSum = strNum1.concat(strNum2);
		
		// 문자열 strNum1과 strNum2의 값을 덧셈했을 때 숫자 30과 50을 더한 값으로 바구고 싶을 때
		int intNum1 = Integer.valueOf(strNum1);
		int intNum2 = Integer.valueOf(strNum2);
		System.out.println(intNum1 + intNum2);
		
		float floatNum1 = Float.valueOf(strNum1);
		float floatNum2 = Float.valueOf(strNum2);
		System.out.println(floatNum1 + floatNum2);
		
		strNum1 = String.valueOf(intNum1);	// strNum1(문자열)을 int형 숫자로 값을 저장하라
		strNum2 = String.valueOf(intNum2);	
	
		strNum1 = "" + intNum1;				// 위와 같은 명령어이지만 주의해서 써야한다.
		strNum2 = "" + intNum2;				// "" 사이에 빈칸넣으면 오류발생 예> " " (X)
		
		strNum1 = strNum1.trim();			// 문자열 앞뒤에 들어있는 빈칸을 없애는 method => trim
		strNum2 = strNum2.trim();
		
		intNum1 = Integer.valueOf(strNum1);
		intNum2 = Integer.valueOf(strNum2);
		System.out.println(intNum1 + intNum2);
		
		
	}

}

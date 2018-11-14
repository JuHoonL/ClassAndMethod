package com.biz.method.classes.wrapper_18_11_14;

public class Integer02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int intNum1 = 50;
		Integer integerNum1 = intNum1;
		System.out.println(integerNum1.toString());		// 정수 50을 문자열("50")로 바꿔라
		
		System.out.println(Integer.valueOf(intNum1));						// 10진수로 바꿔라
		System.out.println("Hex : " + Integer.toHexString(intNum1));		// 16진수로 바꿔라
		System.out.println("Octal : " + Integer.toOctalString(intNum1));	// 8진수로 바꿔라
		System.out.println("BIn : " + Integer.toBinaryString(intNum1));		// 2진수로 바꿔라
	}

}

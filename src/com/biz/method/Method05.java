package com.biz.method;

public class Method05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intNum1 = 100;
		addVar();
		addVar(intNum1);
		
		System.out.println(intNum1);
		
		System.out.println(intNum1*20);		// 변수를 변화 시키지 않는다.
		System.out.println(intNum1);
		
		System.out.println(intNum1*=20);	// 변수를 변화시킨다. intNum1에 20을 곱해서 intNu1에 저장하라는 =이 들어가있음
		System.out.println(intNum1);

	}

	public static void addVar() {
		int intNum1 = 200;
	}
	
	public static void addVar(int intNum1) {
		intNum1 = 300;
	}
}

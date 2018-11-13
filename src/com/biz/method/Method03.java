package com.biz.method;

public class Method03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(addVar(5, 8.56f));
		

	}
	// type이 있는 method의 형태
	
	public static int addVar(int intNum1, int intNum2) {
		return 0;
	}
	
	public static String addVar(String sA, String sB) {
		return "";
	}
	
	public static float addVar(float fA, float fB) {
		return 0.0f;
	}
	
	public static boolean addVar(boolean bA, boolean bB) {
		return true;
		// return false;
	}
	
	public static String addVar(int intA, String strB) {
		return "";
	}
	
	public static float addVar(int intA, float fB) {
		float sum1 = intA + fB;
		return sum1;
	}
}

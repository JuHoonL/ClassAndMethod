package com.biz.method.m01_18_11_12;

public class Method02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * int intStars = 8;
		for(int i = 0 ; i < intStars ; i ++) {
			for(int j = 0 ; j < intStars ; j ++) {
				System.out.print("★ ");
			}
			System.out.println();
		}
		*/
		makeStars();
		System.out.println("====================================");
		makeStars(7);
		System.out.println("====================================");
		makeStars(10);
		System.out.println("====================================");
		makeStars(6);
		System.out.println("====================================");
		makeStars(9);
		System.out.println("====================================");
		makeStars(8);
		System.out.println("====================================");
		
	}
	public static void makeStars() {
		int intStars = 7 ;
		for(int i = 0 ; i < intStars ; i ++) {
			for(int j = 0 ; j < intStars ; j ++) {
				System.out.print("★ ");
			}
			System.out.println();
		}
	}
	
	public static void makeStars(int intStars) {
		// int intStars = 3 ;
		for(int i = 0 ; i < intStars ; i ++) {
			for(int j = 0 ; j < intStars ; j ++) {
				System.out.print("★ ");
			}
			System.out.println();
		}
	}
}

package com.biz.method.m01_18_11_12;

public class Method03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 임의의 숫자를 무작위로 생성하는 명령문
		Math.random();
		
		for(int i = 0 ; i < 10 ; i ++) {
			System.out.println(Math.random());
		}
		
		System.out.println("0부터 9까지 무작위정수만들기");
		for(int i = 0 ; i < 10 ; i ++) {
			int intNum = (int)(Math.random()*10);
			System.out.println(intNum);
		}
		System.out.println("====================================");
		
		System.out.println("0부터 99까지 무작위정수만들기");
		for(int i = 0 ; i < 10 ; i ++) {
			int intNum = (int)(Math.random()*100);
			System.out.println(intNum);
		}
		System.out.println("====================================");
	
		System.out.println("1부터 100까지 무작위정수만들기");
		for(int i = 0 ; i < 10 ; i ++) {
			int intNum = (int)(Math.random()*100)+1;
			System.out.println(intNum);
		}
		System.out.println("====================================");

		System.out.println("10부터 109까지 무작위정수만들기");
		for(int i = 0 ; i < 10 ; i ++) {
			int intNum = (int)(Math.random()*100)+10;
			System.out.println(intNum);
		}
		System.out.println("====================================");
		
		System.out.println("50부터 100까지 무작위정수만들기");
		for(int i = 0 ; i < 10 ; i ++) {
			int intNum = (int)(Math.random()*(100-50))+50;
			System.out.println(intNum);
		}
		
		System.out.println("====================================");

		int intStart = 50;
		int intEnd = 100;
		
		int rand = (int)Math.random() * (intEnd - intStart + 1) + intStart;
		
		int intStars = (int)Math.random() * (10-5+1) +5 ;
				makeStars(intStars);
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

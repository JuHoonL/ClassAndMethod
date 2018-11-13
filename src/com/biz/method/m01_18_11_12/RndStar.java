package com.biz.method.m01_18_11_12;

public class RndStar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 1. intStarts 변수를 선언하고, 5부터 9까지의 임의의 수를 생성하여 저장
		 2. makeStar(int intStars) method를 선언하고 매개변수를 전달받아
		 3. 매개변수 개수 만큼 별을 console에 출력 
		  	단, 별은 n X n 개의 정사각형 모양으로 출력
		 */

		int intStarts = 0;
		intStarts = (int)(Math.random() * (9-5+1)) + 5;		// (끝나는값 - 시작값 + 1) + 시작값
		
		makeStar(intStarts);
	}
	public static void makeStar(int intStars) {
		System.out.println(intStars + "개의 별 찍기");
		
		for(int i = 0 ; i < intStars ; i ++) {
			for(int j = 0 ; j < intStars ; j++) {
			System.out.print("★ ");
			}
			System.out.println();
		}
	}
}

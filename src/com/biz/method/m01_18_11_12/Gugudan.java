package com.biz.method.m01_18_11_12;

public class Gugudan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 1. guguDan() method를 선언하고,
		 2. main에서 2부터 9까지 반복되는 숫자를 매개변수로 guguDan()에 전달하여
		 3. 2단 부터 9단까지의 구구단을 console에 출력하시오
		 */
		
		//첫번째 방법
		
		for(int i = 2 ; i < 10 ; i ++) {
			for(int j = 1 ; j < 10 ; j ++) {
				guguDan(i, j);
			}
			System.out.println("===========================");
		}
		System.out.println("\n");

		// 2번쨰 방법
		for(int i = 2 ; i < 10 ; i ++) {
			guguDan(i);
			System.out.println("===========================");
		}
		
	}
	public static void guguDan(int i, int j) {
		System.out.printf("%d X %d = %d\n", i, j, i*j);
	}
	
	public static void guguDan(int Dan) {
		for(int j = 1 ; j < 10 ; j ++) {
			System.out.printf("%d X %d = %d\n", Dan, j, Dan*j);
		}
	}
}

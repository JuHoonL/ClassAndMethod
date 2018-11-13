package com.biz.method.m01_18_11_12;

public class RndSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 1. for 문을 이용해서 0부터 16까지 반복문 작성
		 2. 50부터 100까지 임의의 숫자를 생성하여, 생성된 숫자를 모두 합산
		 3. 합산된 숫자의 평균을 계산하여 console에 표시
		 */
		int i = 0;
		int intSum = 0;
		
		for(i = 0 ; i < 16 ; i ++) {
			
			intSum += makeInt();
			System.out.println((i+1) + " 번째 정수 : " + makeInt());
			System.out.println((i+1) + " 번째 정수의 합 : " + intSum);
		}
		System.out.printf("정수 합 : %d, 정수평균 : %d\n", intSum, intSum/i);
		System.out.println("소수점까지 평균 : " + (float)intSum/i);
	}

	public static int makeInt() {
		return (int)(Math.random()* (100-50+1))+50;
	}
}

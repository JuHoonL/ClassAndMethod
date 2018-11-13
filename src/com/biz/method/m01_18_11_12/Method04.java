package com.biz.method.m01_18_11_12;

public class Method04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 0; i < 5 ; i ++) {
			double dRND = Math.random(); 
			double dRND1 = dRND * 100;		// 0 ~ 99.xx
			dRND1 = dRND * 50;				// 0 ~ 49.xx
			dRND1 = dRND * 30; 				// 0 ~ 29.xx
			int intRND = (int)dRND;			// 강제 정수형 변환(int) => 0 ~ 29
			intRND += 1; 					// 1 ~ 30
			intRND += 20;					// 21 ~ 50
			
			
			int intStars =(int)(dRND * (10-5+1))+ 5 ;	// 5 ~ 10 의 정수형을 구하는 공식
														// (끝나는값 - 시작값 + 1) + 시작값
			intStars = (int)(dRND * (100-50+1)) + 50 ;	// 50 ~ 100 의 정수형을 구하는 공식
														// (끝나는값 - 시작값 + 1) + 시작값	
			System.out.println(intStars);
		}

	}

}

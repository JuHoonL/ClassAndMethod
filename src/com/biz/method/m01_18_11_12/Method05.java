package com.biz.method.m01_18_11_12;

public class Method05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i = 0 ; i < 10 ; i ++) {
			int intKor = makeGrade();
			int intEng = makeGrade();
			int intHisto = makeGrade();
			int intMusic = makeGrade();
			int intMath = makeGrade();
			int intScience = makeGrade();
			
			// int intSum = intKor + intEng ;
			int intSum = gradeSum(intKor, intEng);
			intSum += gradeSum(intMath, intScience);
			intSum += gradeSum(intHisto, intHisto);
			
			System.out.printf("국어 : %d, 영어 : %d, 합계 = %d\n", intKor, intEng, intSum);
			System.out.printf("국어 : %d, 영어 : %d, 역사 : %d, 음악 : %d, 수학 : %d, 과학 : %d, 합계 = %d\n"
					, intKor, intEng, intHisto, intMusic, intMath, intScience, intSum);
		}
	}
	public static int makeGrade() {
		int intRND = (int)(Math.random() * (100-50+1)) + 50 ;
		return intRND ;
	}
	public static int gradeSum(int intKor, int intEng) {
		return intKor + intEng ;
	}
}

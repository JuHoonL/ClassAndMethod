package com.biz.method.m01_18_11_12;

public class GradeMethod03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 1. 국어, 영어, 수학, 과학 성적을 저장할 int형 변수 선언
		 2. 각 과목의 점수를 50~100까지 범위의 임의의 점수를 생성하여 변수에 저장
		 3. gradeSum() Method 생성하여, 매개변수 2개를 전달받아 전과목 성적 총점을 계산 하고
		 4. main으로 결과를 return 한 다음 console에 표시
		 */
		
		int intKor = makeGrade();
		int intEng = makeGrade();
		int intMth = makeGrade();
		int intSci = makeGrade();
		
		int intSum = intSum(intKor, intEng);
		intSum += intSum(intMth, intSci);
		
		System.out.printf("국어 : %d, 영어 : %d, 수학 : %d, 과학 : %d, 총점 : %d\n", 
				intKor, intEng, intMth, intSci, intSum);
		System.out.println("4과목의 평균 : " + (float)intSum/4);
		// 평균을 비교적 정확히 계산하기 위해서 총점을 float형으로 강제 변환해주고 /4를 계산함.

	}
	public static int makeGrade( ) {
		return (int)(Math.random() * (100-50+1))+50;
	}
	
	public static int intSum(int intGrade1, int intGrade2) {
		return intGrade1 + intGrade2;
	}
}

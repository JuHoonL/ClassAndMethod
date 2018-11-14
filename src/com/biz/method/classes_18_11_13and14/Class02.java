package com.biz.method.classes_18_11_13and14;

public class Class02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intName ;
		String strNation = "" ;
		
		ScoreVO scoreVO ;		
		scoreVO = new ScoreVO(); // 기준이 되는 값이 없이 어떠한 것이 올지 모르기때문에 = new 해당클래스명();
		
		ScoreVO sVO = new ScoreVO(); 
		//내가 만든 키워드 ScoreVO를 이용해서 sVO라는 변수를 선언하고 사용하기 위해서 
		//new(모든형태 초기화)라는 키워드를 통해서 초기화 한것.
		/*
		 *  일반 메서드 int my(){} 와 void my(){}는 앞에 int, float, void등이 올수 있고 항상 키워드는 소문자시작!
		 *  class ScoreVO{}의 경우 앞에 class만 올수 있고 키워드 앞글자는 무조건 대문자!, ()소괄호 없음
		 */
		
		scoreVO.strName = "홍길동";
		scoreVO.intKor = 90;
		scoreVO.intEng = 88;
		scoreVO.intMath = 77;
		scoreVO.intSci = 98;
		scoreVO.intHis = 88;
				
		makeSum(scoreVO);
		
	}
	public static void makeSum(ScoreVO scoreVO) {
		System.out.println("학생이름 : " + scoreVO.strName);
		System.out.println("국어점수 : " + scoreVO.intKor);
		System.out.println("영어점수 : " + scoreVO.intEng);
		System.out.println("수학점수 : " + scoreVO.intMath);
		System.out.println("과학점수 : " + scoreVO.intSci);
		System.out.println("국사점수 : " + scoreVO.intHis);
		
	}
}

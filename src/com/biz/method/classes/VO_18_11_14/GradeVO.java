package com.biz.method.classes.VO_18_11_14;

/**
 * @author 한국경영원
 *
 */
public class GradeVO {

	/*
	 * 성적처리를 할 때 사용할 학생의 
	   학번, 이름, 국어, 영어, 수학, 과학, 국사 과목의 점수와 총점, 평균의 데이터를
	   저장할 변수를 갖는 Value Object(Data Transfer object)
	 */
	
	/*
	 * class에 선언된 변수들 : 속성(property), member변수
	   => 기본 성질을 private으로 설정한다.
	 */
	
	// String strNum, strName, strID ;처럼 나열가능 (초기화시 오류 발생가능성있음)
	private String strNum ;
	private String strName ;
	
	private int intKor;
	private int intEng;
	private int intMth;
	private int intSci;
	private int intHis;
	
	private int intSum;
	private float floatAvg;
	// private로 선언된 변수(속성)들을 외부에서 접근할 수 있는 통로를 선언
	// new를 사용해서 객체로 생성한 후 읽기, 쓰기를 시도하는 곳 = > getter and setter

	// 변수 = 객체.get ~(); || system.out.println(get~()); 처럼 바로 출력가능
	// 객체.set~(설정값);
	// 객체.~  => 이 처럼 괄호가 없는경우 getter와 setter 둘다 
	
	public String getStrNum() {
		return strNum;
	}
	
	public void setStrNum(String strNum) {
		this.strNum = strNum;
	}

	public String getStrName() {
		return strName;
	}

	public void setStrName(String strName) {
		this.strName = strName;
	}

	public int getIntKor() {
		return intKor;
	}

	public void setIntKor(int intKor) {
		this.intKor = intKor;
	}

	public int getIntEng() {
		return intEng;
	}

	public void setIntEng(int intEng) {
		this.intEng = intEng;
	}

	public int getIntMth() {
		return intMth;
	}

	public void setIntMth(int intMth) {
		this.intMth = intMth;
	}

	public int getIntSci() {
		return intSci;
	}

	public void setIntSci(int intSci) {
		this.intSci = intSci;
	}

	public int getIntHis() {
		return intHis;
	}

	public void setIntHis(int intHis) {
		this.intHis = intHis;
	}

	public int getIntSum() {
		return intSum;
	}

	public void setIntSum(int intSum) {
		this.intSum = intSum;
	}

	public float getFloatAvg() {
		return floatAvg;
	}

	public void setFloatAvg(float flaotAvg) {
		this.floatAvg = flaotAvg;
	}

	
	
	
}

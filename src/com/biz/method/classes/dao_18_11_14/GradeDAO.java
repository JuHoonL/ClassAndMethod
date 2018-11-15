package com.biz.method.classes.dao_18_11_14;

import com.biz.method.classes.VO_18_11_14.GradeVO;

public class GradeDAO {

	public GradeVO gradeVO ;
	
	public GradeDAO() {
		gradeVO = new GradeVO();
	}
	
	public int makeScore() {
		return (int)(Math.random() * (100-50+1))+50;
	}
	
	public void makeGrade() {
		// TODO 총점과 평균 계산하기
		makeSum();
		float floatAvg = this.gradeVO.getIntSum() / 5.0f;
		this.gradeVO.setFloatAvg(floatAvg);
	}
	
	public void makeSum() {
		// TODO 총점계산하기
		int intSum = this.gradeVO.getIntKor();
		intSum += this.gradeVO.getIntEng();
		intSum += this.gradeVO.getIntMth();
		intSum += this.gradeVO.getIntSci();
		intSum += this.gradeVO.getIntHis();
		
		this.gradeVO.setIntSum(intSum);
	}
	
	public void viewSum() {
		//TODO 총점보이기
		makeSum();
		System.out.println("====================================");
		System.out.println("총점 : " + this.gradeVO.getIntSum());
		System.out.println("------------------------------------");
	}
	
	public void viewAvg() {
		//TODO 평균구하기
		makeSum();
		float floatAvg = (float)this.gradeVO.getIntSum() / 5;
		System.out.println("====================================");
		System.out.println("평균 : " + floatAvg);
		System.out.println("------------------------------------");
		
	}
	
	public void gradeView() {
		System.out.println("====================================");
		System.out.println("학생성적정보");
		System.out.println("------------------------------------");
		System.out.println("학번 : " + gradeVO.getStrNum());
		System.out.println("이름 : " + gradeVO.getStrName());
		System.out.println("====================================");
		System.out.println("국어 : " + gradeVO.getIntKor());
		System.out.println("영어 : " + gradeVO.getIntEng());
		System.out.println("수학 : " + gradeVO.getIntMth());
		System.out.println("과학 : " + gradeVO.getIntSci());
		System.out.println("국사 : " + gradeVO.getIntHis());
		System.out.println("====================================");
		
	}
}

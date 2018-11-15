package com.biz.method.classes.oop02_18_11_15;

import com.biz.method.classes.dao_18_11_14.GradeDAO;

public class GradeExec04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GradeDAO gDao = new GradeDAO();
		
		for(int i = 0 ; i<5 ; i++) {
			gDao.gradeVO.setStrNum(String.valueOf(i + 1));
			gDao.gradeVO.setStrNum("" + (i + 1));
			setScore(gDao);
			viewScore(gDao);
		}
		
	}
	
	public static void setScore(GradeDAO gDao) {
		 
//		gDao.gradeVO.setStrNum("002");
		gDao.gradeVO.setStrName("성춘향");
		gDao.gradeVO.setIntKor(gDao.makeScore());
		gDao.gradeVO.setIntEng(gDao.makeScore());
		gDao.gradeVO.setIntMth(gDao.makeScore());
		gDao.gradeVO.setIntSci(gDao.makeScore());
		gDao.gradeVO.setIntHis(gDao.makeScore());
		gDao.makeGrade();
		
	}

	public static void viewScore(GradeDAO gDao) {
		System.out.println("====================================");
		System.out.println("학번 : " + gDao.gradeVO.getStrNum());
		System.out.println("이름 : " + gDao.gradeVO.getStrName());
		System.out.println("------------------------------------");
		System.out.println("국어 : " + gDao.gradeVO.getIntKor());
		System.out.println("영어 : " + gDao.gradeVO.getIntEng());
		System.out.println("수학 : " + gDao.gradeVO.getIntMth());
		System.out.println("과학 : " + gDao.gradeVO.getIntSci());
		System.out.println("국사 : " + gDao.gradeVO.getIntHis());
		System.out.println("------------------------------------");
		System.out.println("총점 : " + gDao.gradeVO.getIntSum());
		System.out.println("평균 : " + gDao.gradeVO.getFloatAvg());
		System.out.println("====================================");
	}
}

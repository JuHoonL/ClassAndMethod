package com.biz.method.classes.oop02_18_11_15;

import com.biz.method.classes.dao_18_11_14.GradeDAO;

public class GradeExec05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GradeDAO gDao = new GradeDAO();
		GradeDAO gDao1 = setRetScore(gDao);
		// 원래있던 gDao를 가지고 새로운 gDao1을 만들때 리턴사용
		viewScore(gDao);	
		
	}
	
	public static GradeDAO setRetScore(GradeDAO gDao) {
		 
		gDao.gradeVO.setStrNum("002");
		gDao.gradeVO.setStrName("성춘향");
		gDao.gradeVO.setIntKor(gDao.makeScore());
		gDao.gradeVO.setIntEng(gDao.makeScore());
		gDao.gradeVO.setIntMth(gDao.makeScore());
		gDao.gradeVO.setIntSci(gDao.makeScore());
		gDao.gradeVO.setIntHis(gDao.makeScore());
		return gDao;
	}

	public static void viewScore(GradeDAO gDao) {
		gDao.gradeView();
		gDao.makeGrade();
		System.out.println("====================================");
		System.out.println("총점 : " + gDao.gradeVO.getIntSum());
		System.out.println("평균 : " + gDao.gradeVO.getFloatAvg());
		System.out.println("====================================");
	}
}

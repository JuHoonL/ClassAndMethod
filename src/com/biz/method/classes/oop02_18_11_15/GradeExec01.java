package com.biz.method.classes.oop02_18_11_15;

import com.biz.method.classes.dao_18_11_14.GradeDAO;

public class GradeExec01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GradeDAO gDao = new GradeDAO();
		gDao.gradeVO.setStrNum("001");
		gDao.gradeVO.setStrName("이몽룡");
		gDao.gradeVO.setIntKor(gDao.makeScore());
		gDao.gradeVO.setIntEng(gDao.makeScore());
		gDao.gradeVO.setIntMth(gDao.makeScore());
		gDao.gradeVO.setIntSci(gDao.makeScore());
		gDao.gradeVO.setIntHis(gDao.makeScore());
		
		gDao.gradeView();
		gDao.viewSum();
		gDao.viewAvg();
		
		
		
	}

}

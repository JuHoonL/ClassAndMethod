package com.biz.method.classes_18_11_13;

public class Class05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ScoreDAO scoreDAO = new ScoreDAO() ;
		
		scoreDAO.scoreVO.intKor = 99;
		scoreDAO.scoreVO.intEng = 77;
		scoreDAO.scoreVO.intMath = 92;
		scoreDAO.scoreVO.intSci = 87;
		scoreDAO.scoreVO.intHis = 67;
		
		System.out.println(scoreDAO.makeSum());
		
		int intSum = scoreDAO.makeSum();
		System.out.println(intSum);

	}

}

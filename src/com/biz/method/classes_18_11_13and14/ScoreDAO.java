package com.biz.method.classes_18_11_13and14;

public class ScoreDAO {

	ScoreVO scoreVO ;
	
	// 생성자 method - 클래스 이름이랑 반드시 같고 public이 항상 붙어야함.
	public ScoreDAO() {
		this.scoreVO = new ScoreVO() ;	//this는 ScoreDAO를 의미하므로 ScoreDAO안의 scoreVO를 말함.
	}									//코드의 재사용화 => 객체지향형
	
	public int makeSum() {
		int intSum = scoreVO.intKor;
		intSum += scoreVO.intEng;
		intSum += scoreVO.intMath;
		intSum += scoreVO.intSci;
		intSum += scoreVO.intHis;
		
		return intSum ;
	}
}

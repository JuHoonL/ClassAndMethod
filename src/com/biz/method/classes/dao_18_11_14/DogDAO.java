package com.biz.method.classes.dao_18_11_14;

import com.biz.method.classes.VO_18_11_14.DogVO;

public class DogDAO {

	public DogVO dogVO ;
	
	public DogDAO() {
		dogVO = new DogVO();
	}
	
	public void dogRun() {
		String strName = this.dogVO.getStrName();
		System.out.println(strName + "가 달립니다.");
	}
	
	public void dogRun(String strField) {
		String strName = this.dogVO.getStrName();
		strName += "가 " + strField;
		strName += "를(을) 달립니다.";
		
		System.out.println(strName);
	}
	
	public void goEat() {
		String strName = this.dogVO.getStrName();
		System.out.println(strName + "가 먹습니다.");
	}
	
	public void goEat(String strFood) {
		String strName = this.dogVO.getStrName();
		strName += "가 " + strFood;
		strName += "를(을) 맛있게 먹습니다.";
		
		System.out.println(strName);
	}
	
	

}

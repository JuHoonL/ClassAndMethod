package com.biz.method.classes.VO_18_11_14;

public class MemberVO {

		public String strId ;
		public String strName ;

		private String strTel ;			// 앞으로 VO클래스 만들어 변수 선언할때는 무조건 private를 넣어줘야함
		private String strAddr ;
		private int intAge ;
		
		public void setStrTel(String strTel) {
			this.strTel = strTel ;
		}
		
		public void setIntAge(int intAge) {
			if(intAge < 1) {
				System.out.println("나이는 0세 보다 많아야 합니다.");
				return;
			}
			if(intAge > 100) {
				System.out.println("나이는 100세 보다 적어야 합니다.");
				return;
			}
				this.intAge = intAge ;
			
		}
}

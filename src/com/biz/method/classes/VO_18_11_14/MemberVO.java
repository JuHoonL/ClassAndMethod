package com.biz.method.classes.VO_18_11_14;

public class MemberVO {

		public String strId ;
		public String strName ;		// 공용이란 의미로 어디에서나 사용할 수있지만 제한을 두거나 하지는 못함

		private String strTel ;		// 앞으로 VO클래스 만들어 변수 선언할때는 무조건 private를 넣어줘야함
		private String strAddr ;	// 제한을 두거나 특별한 다른일을 실행하기 위해서 전용으로서 private를 사용
		private int intAge ;

		// art + shift + s + r  => all select
		public void setStrTel(String strTel) {		
			this.strTel = strTel ;
		}
		public String getStrId() {					// 설정값을 가져와라
			return strId;
		}
		public void setStrId(String strId) {		// 설정값을 저장하라
			this.strId = strId;
		}
		public String getStrName() {
			return strName;
		}
		public void setStrName(String strName) {
			this.strName = strName;
		}
		public String getStrAddr() {
			return strAddr;
		}
		public void setStrAddr(String strAddr) {
			this.strAddr = strAddr;
		}
		public String getStrTel() {
			return strTel;
		}
		public int getIntAge() {
			return intAge;
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

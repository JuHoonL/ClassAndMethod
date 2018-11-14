package com.biz.method.classes.oop01_18_11_14;

/*
 * 지금 내가 있는 곳은 classes.oop01 패키지 인데 classes.VOㅠㅐ키지에 있는 MemberVO 클래스를 사용하고 싶다.
 * 라는 선언문(import)
 */
import com.biz.method.classes.VO_18_11_14.MemberVO;		// ctrl + shift + o(자동 import 명령어)

public class MemberExec01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MemberVO member = new MemberVO();
		member.strId = "001" ;
		member.strName = "홍길동" ;
		member.setStrTel("001-011-011");
		member.setIntAge(-1);

	}

}

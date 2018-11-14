package com.biz.method.classes.oop01_18_11_14;

import com.biz.method.classes.dao_18_11_14.MemberDAO;

public class MemberExec02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MemberDAO dao = new MemberDAO();
		dao.viewMember();
		
		dao.memberVO.strId = "001";
		dao.memberVO.strName = "홍길동";
		dao.memberVO.setStrTel("010-111-1234");
		dao.memberVO.setStrAddr("서울특별시");
		dao.memberVO.setIntAge (30) ;
		dao.viewMember();
	}

}

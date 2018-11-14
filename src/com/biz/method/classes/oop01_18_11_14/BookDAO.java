package com.biz.method.classes.oop01_18_11_14;

public class BookDAO {
	
	BookVO vo ;						// 객체선언
	
	
	public BookDAO( ) {				// BookVO 를 초기화
		this.vo = new BookVO();
	}
	
	public void viewBook() {		// BookVO로 부터 각각의 데이터를 뽑아서 출력하라는 method 설정
		System.out.println("=======================");
		System.out.println("책 정 보");
		System.out.println("=======================");
		System.out.println("책 이 름 : " + vo.strName);
		System.out.println("저    자 : " + vo.strAuth);
		System.out.println("출 판 사 : " + vo.strComp);
		System.out.println("내    용 : " + vo.strDsc);
		System.out.println("가    격 : " + vo.intPrice);
		System.out.println("할    인 : " + vo.intDC);
		
	}
	
	// 책을 구매할 때 계산을 수행하는 method
	public void priceCacl(int intCount) {
		int intSum = (vo.intPrice - vo.intDC) * intCount ;
		System.out.println("========================");
		System.out.println("구매한 도서 : " + vo.strName);
		System.out.println("구매권수 : " + intCount);
		System.out.println("합    계 : " + intSum);
		System.out.println("========================");
	}
}

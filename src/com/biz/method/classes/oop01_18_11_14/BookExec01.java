package com.biz.method.classes.oop01_18_11_14;

public class BookExec01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String strName = "열혈자바" ;
		String strAuth = "윤성우" ;
		String strComp = "오렌지 미디어" ;
		int intPrice = 30000 ;
		int intDC = 3000 ;
		String strDsc = "자바를 공부하기 위한 도서" ;
		viewBook(strName, strAuth, strComp, strDsc, intPrice, intDC) ;
		
		strName = "데이터베이스" ;
		strAuth = "이상우" ;
		strComp = "영진 미디어" ;
		intPrice = 45000 ;
		intDC = 4500 ;
		strDsc = "데이터 베이스를 공부하기 위한 도서" ;
		viewBook(strName, strAuth, strComp, strDsc, intPrice, intDC) ;
		
		// BookVO 클래스를 이용해서 book 객체 인스턴스를 생성(선언 및 초기화)
		BookVO book = new BookVO() ;
		
		// book 객체(인스턴스)의 각 속성(변수)의 값(Data)들을 저장(세팅)한다.
		book.strName = "열혈자바" ;
		book.strAuth = "윤성우" ;
		book.strComp = "오렌지 미디어" ;
		book.strDsc = "자바를 공부하기 위한 도서" ;
		book.intPrice = 30000 ;
		book.intDC = 3000 ;
		
		// 지금 세팅한 book 객체의 속성들을 콘솔에 보이기 위해 method를 호출
		
		viewBook(strName, strAuth, strComp, strDsc, intPrice, intDC) ;
		viewBook(book);
		
	}
	
	public static void viewBook(BookVO vo) {
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
	
	public static void viewBook(String strName, String strAuth, String strComp, String strDsc, int intPrice, int intDC) {
		System.out.println("=======================");
		System.out.println("책 정 보");
		System.out.println("=======================");
		System.out.println("책 이 름 : " + strName);
		System.out.println("저    자 : " + strAuth);
		System.out.println("출 판 사 : " + strComp);
		System.out.println("내    용 : " + strDsc);
		System.out.println("가    격 : " + intPrice);
		System.out.println("할    인 : " + intDC);
		
	}
}

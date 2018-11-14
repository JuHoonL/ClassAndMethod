package com.biz.method.classes.wrapper_18_11_14;

public class String02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String strNation = "Republic of Korea";
		String strLower = strNation.toLowerCase();
		String strUpper = strNation.toUpperCase();
		
		// substring(, )는 문자열을 잘라내서 저장하는 method
		String strWord = strNation.substring(0, 6);		// 0~6번째 글자까지 잘라내라 (Republ까지 잘라서 저장)
		System.out.println(strWord);
		
		String strKorea = strNation.substring(12);		// 12번째 글자부터 마지막까지 잘라내라 (K부터orea까지 저장)
		System.out.println(strKorea);
		
		String strKorea1 = strNation.substring(12, 13);		// 12~13번째 글자까지 잘라내라 (K만 저장)
		System.out.println(strKorea1);						// 0부터시작해서 해당 번째글자 앞에서 짤라서 저장
		
		String strOf = strNation.substring(9, 11);
		System.out.println(strOf);
		
		String strNum1 = "30";
		String strNum2 = "40";
		System.out.println(strNum1 + strNum2);
	}

}

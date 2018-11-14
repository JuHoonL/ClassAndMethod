package com.biz.method.classes.statics_18_11_14;

public class Nations {

	/*
	 *  Static이 들어간 class는 Nations nation = new Nations(); 를 안해도 됌 (고정으로 자동등록)
	 *  자동등록이기 때문에 모두 등록되어 메모리를 차지하기때문에 효율성이 떨어짐(프로그램구동시 느려짐)
	 *  필요한 객체만 사용할때는 VO식으로 되어 new 클래스명(); 으로 초기화설정해줘서 사용하는게 좋음
	 */
	public final static String KOREA = "대한민국";	// final static으로 선언되면 상수로서 다른곳에서 못 바꿈
	public static String USA = "미합중국";
	public static String UAE = "아랍에미레이트 연합";
	public static String RUSIA = "러시아";
	public static String CHINA = "중화인민공화국";
	
	/*
	 * Static class는 프로젝트가 시작됨과 동시에 생성되엇 메모리 어딘가에 자동으로 등록된다.
	 * 그리고 프로젝트가 종료 될 때까지 유지된다. 즉 메모리를 차지하고있다.
	 * 다만 static class는 생성자(new ~)를 사용해서 객체로 만들지 않아도 된다.
	 */

}

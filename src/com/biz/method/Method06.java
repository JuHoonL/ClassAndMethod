package com.biz.method;

public class Method06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intNum1 = 100;
		
		System.out.println("A : " + intNum1);				//100 => method의 변수값이 변한것이지 main의 변수값에 영향 X
		
		addVar(100);
		System.out.println("B : " + intNum1);				//100 => method의 변수값이 변한것이지 main의 변수값에 영향 X
		
		addVar(intNum1);
		System.out.println("C : " + intNum1);				//100 => method의 변수값이 변한것이지 main의 변수값에 영향 X
		
		addVar(intNum1);
		System.out.println("D : " + addVar(intNum1));		//300 => method의 변수값을 표시하는 명령어(intNum1의값은 method의 값)
		
		intNum1 = addVar(intNum1);
		System.out.println("E : " + intNum1);				//300 => method의 변수값을 main의 변수값이 변경저장했으므로 변수값 변경저장

	}

	public static int addVar(int intNum1) {
		intNum1 += 200;
		return intNum1;
	}
}

package javaBasic.ch03.sec02;

public class 논리연산자 {

	public static void main(String[] args) {
		boolean b1 = true;
		boolean b2 = false;
		
		System.out.println(b1 && b2);
		//&& and 둘다 참일 때에만 참임
		System.out.println(b1||b2);
		//|| or
		System.out.println(b1^b2);
		//서로 다른게 있으면 참
		System.out.println(!b1);
		//반대 - 논리값 바꿈
		
		byte b3 = 10;
		byte b4 = 7;
		
		System.out.println(b3 & b4);
		// 10진수 > 2진수 > 10진수 
		System.out.println(b3 | b4);
		System.out.println(b3^b4);
		System.out.println(~b3);

	}

}

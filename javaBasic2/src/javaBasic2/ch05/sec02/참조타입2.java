package javaBasic2.ch05.sec02;

public class 참조타입2 {

	public static void main(String[] args) {
		
		A aAddr=new A();
		//홍길동이라 입력하고싶음
		aAddr.name = "홍길동";
		aAddr.kor=100;
		aAddr.avg=3.5;
		
		A aAddr2=new A();
		System.out.println(aAddr == aAddr2);
		A aAddr3= aAddr2;//10번지를 aAddr3이라는 변수에 넣어라
		System.out.println(aAddr3 == aAddr2);
		

	}

}

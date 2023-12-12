package javaBasic4.ch07.sec03;

public class ComputerExample {

	public static void main(String[] args) {
		//부모 클래스 객체 생성하기
		Calculator cal =  new Calculator();
		System.out.println( cal.areaCircle(10) );
		
		Computer com = new Computer();
		System.out.println(com.areaCircle(10));
		

	}

}

package javaBasic3.ch06.sec02;

public class 실행 {
	
	static {
		System.out.println("정적블록");
	}
	{
		System.out.println("인스턴스 블록 부분");
	}
	public 실행() {
		System.out.println("생성자");
	}

}

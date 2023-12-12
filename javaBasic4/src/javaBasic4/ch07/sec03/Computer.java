package javaBasic4.ch07.sec03;

public class Computer extends Calculator {
	
	public double areaCircle(double r) {
		System.out.println("Computer 객체의 areaCircle() 실행");
		// 부모의 메소드를 자식이 고쳐서 사용하는 것을 오버라이드라고 함
		return Math.PI * 2 * r;
	}

}

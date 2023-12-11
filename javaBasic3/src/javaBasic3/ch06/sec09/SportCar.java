package javaBasic3.ch06.sec09;

public class SportCar {
	//필드 = 항목 = 변수
	int a;
	
	//메소드 = 함수 = 동작
	void aPrinter() {
		System.out.println(a);
	}
	
	//생성자
	public SportCar() {
		//기본 생성자, 객체화 할 때 초기값을 넣을 때에 이용
		//생성자를 한개라도 안만들면 자바가 자동으로 기본생성자 하나를 만들어준다.
		//만약에 1개라도 만들면 기본생성자는 만들지 않는다
	}

}

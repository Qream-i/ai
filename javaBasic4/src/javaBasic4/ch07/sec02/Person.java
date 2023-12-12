package javaBasic4.ch07.sec02;

//부모 클래스 = 슈퍼 클래스 = 상위 클래스
public class Person {
	
	String name;
	int age;
	
	public void eat() {
		System.out.println("먹는다.");
	}
	
	public void sleep() {
		System.out.println("잔다.");
	}
	
	public Person() {
		System.out.println("부모 클래스 입니다.");
	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	

}

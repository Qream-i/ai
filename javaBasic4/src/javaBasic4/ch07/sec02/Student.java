package javaBasic4.ch07.sec02;

public class Student extends Person{
	
	String major;
	
	void study() {
		System.out.println("공부한다.");
	}
	public Student() {
		super(); //부모생성자 호출
		System.out.println("부모 클래스 아버지 클래스");
	}
	public Student(String 이름, int 나이, String 전공) {
		this.name = 이름;
		this.age = 나이;
		this.major = 전공;
		System.out.println("부모 클래스 아버지클래스 내용이 잇는 생성자 " + name);
	}
	
	

}

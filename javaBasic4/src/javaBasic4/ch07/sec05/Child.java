package javaBasic4.ch07.sec05;

public class Child extends Parent {
	public String name;
	public Child() {
		this("ȫ�浿");
		System.out.println("Child() call");
	}
	
	public Child(String name) {
		this.name = name;
		System.out.println("child(String name) call");
	}
	
//	public Child(String name, int studentNo) {
//		this.name = name;
//		this.studentNo = studentNo;
//	}

}
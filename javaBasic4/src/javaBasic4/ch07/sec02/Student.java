package javaBasic4.ch07.sec02;

public class Student extends Person{
	
	String major;
	
	void study() {
		System.out.println("�����Ѵ�.");
	}
	public Student() {
		super(); //�θ������ ȣ��
		System.out.println("�θ� Ŭ���� �ƹ��� Ŭ����");
	}
	public Student(String �̸�, int ����, String ����) {
		this.name = �̸�;
		this.age = ����;
		this.major = ����;
		System.out.println("�θ� Ŭ���� �ƹ���Ŭ���� ������ �մ� ������ " + name);
	}
	
	

}

package javaBasic4.ch07.sec02;

public class Teacher extends Student{
	
	String dep;
	
	void teach() {
		System.out.println("����ģ��.");
	}
	
	public Teacher() {
		super("ȫ�浿", 30, "��ǻ�Ͱ���"); //�θ������ ȣ���̶�� ��
		System.out.println("�ڽ� Ŭ���� me");
	}
	
	public Teacher(String name, int age, String major, String dep) {
		this.name = name;
		this.age = age;
		this.major = major;
		this.dep = dep;
	}

}

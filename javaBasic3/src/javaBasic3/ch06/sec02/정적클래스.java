package javaBasic3.ch06.sec02;

public class ����Ŭ���� {
	static int st = 10;
	int it = 100;

	public static void main(String[] args) {
		//m1();
		����Ŭ���� i1 = new ����Ŭ����(); // �ش� �������� static �ƴ� �ֵ��� ���޸𸮿� �ö�.
		i1.m2(); //���� �ҷ��� �ּҸ� ���� ���� m2 �ҷ�����
		System.out.println(st);
		System.out.println(i1.it);
		m1( i1 );
		
		
	}
	
	static void m1(����Ŭ���� i1) {
		System.out.println("���� �޼ҵ��Դϴ�.");
	}
	
	void m2() {//�� ģ���� static�� �Ⱥپ������� new �Ἥ �ҷ�������
		System.out.println("�ν��Ͻ� �޼ҵ��Դϴ�.");
	}

}

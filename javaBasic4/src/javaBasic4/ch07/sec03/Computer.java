package javaBasic4.ch07.sec03;

public class Computer extends Calculator {
	
	public double areaCircle(double r) {
		System.out.println("Computer ��ü�� areaCircle() ����");
		// �θ��� �޼ҵ带 �ڽ��� ���ļ� ����ϴ� ���� �������̵��� ��
		return Math.PI * 2 * r;
	}

}

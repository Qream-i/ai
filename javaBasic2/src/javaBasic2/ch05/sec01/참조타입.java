package javaBasic2.ch05.sec01;

import java.util.Scanner;

public class ����Ÿ�� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=10;
		Scanner sc= new Scanner(System.in);
		//new �� �� �޸𸮿� Scanner Ŭ������ �÷��޶�� ���̴�.> �̰Ŵ� �ּҸ� ����
		//��? �ش� Ŭ������ ����ϴϱ�.
		//�� �޸��� �ּҸ� ���ð����� ������ �����ؾ��Ѵ�
		System.out.println(n);
		// �������� = �ڷ��� ������;
		Student st = new Student();
		Person per = new Person();
		//Person�̶�� Ŭ������ ����� new�� �� �޸𸮿�����
		//per��� ������ Person Ŭ������ �ּҸ� �����Ѵ�.
		Guide guide = new Guide();
	}

}

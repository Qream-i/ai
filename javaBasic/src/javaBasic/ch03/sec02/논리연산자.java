package javaBasic.ch03.sec02;

public class �������� {

	public static void main(String[] args) {
		boolean b1 = true;
		boolean b2 = false;
		
		System.out.println(b1 && b2);
		//&& and �Ѵ� ���� ������ ����
		System.out.println(b1||b2);
		//|| or
		System.out.println(b1^b2);
		//���� �ٸ��� ������ ��
		System.out.println(!b1);
		//�ݴ� - ���� �ٲ�
		
		byte b3 = 10;
		byte b4 = 7;
		
		System.out.println(b3 & b4);
		// 10���� > 2���� > 10���� 
		System.out.println(b3 | b4);
		System.out.println(b3^b4);
		System.out.println(~b3);

	}

}

package javaBasic.ch01.sec15;

import java.nio.file.FileSystemNotFoundException;

public class DataTypeEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�ڷ��� - �⺻��(������-byte, int, long/�Ǽ���-float, double/������-boolean/������-char)
		//����ó�� ���� 39p
		byte b1 = 10; //-128 ~ 127
		System.out.println(b1);
		
		short s1 = 32767; //-32768 ~  32767
		long lo1 = 9000000000000000000l; //21���� ������ int �޾��� �� error
		
		byte b2 = 20;
		byte b3 = 30;
		//byte b23 = b2 + b3; 
		// + �����ڴ� int ������ ó���� 
		// �ش� ������ b2(byte) +(int) b3(byte) �ϱ�, int�� ��ƾ��� - ������ �ս� ����
		int result23 = b2 + b3;
		
		short s2 = -20;
		short s3 = 20;
		int s23 = s2 - s3;
		
		byte b4 = 20;
		short s4 = 30;
		int bs4 = b4 + s4;
		
		float f1 = 3.14f;
		float f2 = 3.12345678f; //�Ҽ����� 7�ڸ����� ���
		System.out.println(f1 + "  " + f2);
		
		double d1 = 3.1234567890123456; //�Ҽ��� 15�ڸ����� ���
		System.out.println(d1);
		
		//�Ǽ����� float(4byte)�� double(8byte)��
		
		float f3 = 10.23f;
		float f4 = 2.45f;
		float f34 = f3*f4;
		double ff34 = f3*f4;
		System.out.println(f34);
		System.out.println(ff34);
		//�Ҽ����� �޶���
		
		double d3 = 3.14;
		double d4 = 12.65;
		double d34 = d3*d4;
		System.out.println(d34);
		
		double dd34 = d3/d4; //float �ڷ����� double������ ��ȯ�� - ����ȯ cast ���� �ڵ�����ȯ
		
		int iil=10;
		short ssl=20;
		
		float ffl=iil; //�������̶� �Ǽ����̶� �ú����� �Ǽ������� ��ȯ�� - ����ȯ
		
		//�Ǽ��� --> ������ ū�ſ��� ���� ������ �������� ������ ������ �ս��� ����
		//����   ������ ������ = (������Ÿ��) �Ǽ�������
		
		//--(����)����ȯ-- (down cast ����; ū Ÿ���� ���� Ÿ������ �ٲ�)
		double d10 = 3.14;
		int change1 = (int)d10;
		//�Ǽ��� �������� (int)�� ���� ���������� �ٲ�� ������ �Ҽ����� �ս��� ����
		System.out.println( d10 + "  " + change1);
		
		float f10 = 10.24f;
		byte changef10 = (byte)f10;
		System.out.println(f10 +" "+changef10);
		
		int i10 = 3000;
		short chi10 = (short) i10;
		System.out.println(chi10);
		
		//����) ���������� �������� �������� �������� ���� ��������
		int kor = 95;
		int mat = 90;
		int eng = 93;
		int sum = kor + mat + eng;
		System.out.println("�հ�� " + sum + "��");
		double sumd = (double) sum;
		double avg = sumd /3;
		System.out.println("����� " + avg + "��");
		//��հ��� �� ����, ������ �����صθ� �����θ� ������ ����
		//=�� �������� �������� ���� ó���� �ڿ� ���ʿ� �������ߴ� ���̱� ������, ������ ���� ����ϰ� �Ǽ������� �ٲ�
		//��� 1) �̸� sum�� �Ǽ��� �ٲ� ������ ���
		//��� 2) ������ ���ڸ� �Ǽ��� �ٲ�
		//���1-1) double avg1 = (double)sum/3;
		
		//���������� �ŵ����� 90^2 or 90**2
		int dmat = mat*mat;
		System.out.println("���������� �ŵ������� " + dmat);
		
		char ch1 = 'a';
		System.out.println((int)ch1);
		
		//a�� 97�� ��µǴ� ������ ���ڴ� �ѱ��� �� �����ڵ�� �����Ǿ��ֱ� ����
		System.out.println( (char) ch1+3);
		System.out.printf("%c", ch1+3);
		//"%c"�� ���������� ch1+3�� �����ڵ� ���ڸ� ���������� ����ϱ�
		
		//Korea�� ����ϱ�
		System.out.printf("%c%c%c%c%c",75,111,114,101,97);

	}

}
package javaBasic3.ch06.sec11;

public class Calculator {
	//�޼ҵ� ���� ~�Ѵ�, ~�ϱ�, ����, ���ڱ�, ���, ����ϱ� 
	//���� [���� �����ϴ� ���� ����������] ����Ÿ�� �޼ҵ�� ( [�Ű����� . . . ] ) {}
	//[]�� ��������, ...�� ������
	
	void powerOn() {
		System.out.println("������ �մϴ�.");
	}
	void powerOff() {
		System.out.println("������ ���ϴ�.");
	}
	int plus(int x, int y) {
		int result = x+y;
		return result; //return�� �޼ҵ带 ȣ���� ���� ���� result ������ �ǵ��� �־��.
	}
	int plus(int x, int y, int z) {
		int result = x+y+z;
		return result; //return�� �޼ҵ带 ȣ���� ���� ���� result ������ �ǵ��� �־��.
	}
	double divide( int x, int y) {
		double result = (double) x/(double)y;
		return result;
	}
}
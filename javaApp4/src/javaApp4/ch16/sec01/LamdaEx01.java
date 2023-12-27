package javaApp4.ch16.sec01;

public class LamdaEx01 {

	public static void main(String[] args) {
		//�͸� ���� Ŭ����
		
		A a = new A() {
					@Override
					public int aM(int a, double b) {
						// TODO Auto-generated method stub
						return (int)(a+b);
					}
				};
		System.out.println(a.aM(10, 1.8));
		
		//���ٽ�
		
//		A lam01 = (int a1, double b1) -> {return (int)(a1+b1);};
//		A lam01 = (a1, b1) -> {return (int)(a1+b1);}; < �Ű������� �ڷ��� ���� ����
		A lam01 = (a1, b1) -> (int)(a1+b1); //{} �ȿ� ������ 1���̴ϱ� ���� ����, return ���� ����
		System.out.println(lam01.aM(20, 8.8));
		
		B lam02 = (x, y, z) -> {
			System.out.println("�̸��� : " + x);
			System.out.println("���̴� : " + y);
			if (z) System.out.println("��");
			else System.out.println("��");
		};
		lam02.bM("ȫ�浿", 170, true);
		lam02.bM("�̼���", 160, false);
	
	}

}

//@~~ ������̼� �ٷ� �Ʒ����ִ� ��ü�� ������ ������ �� ���
@FunctionalInterface
interface A {
	int aM(int a, double b);
}

interface B {
	void bM (String x, Integer y, Boolean z);
}
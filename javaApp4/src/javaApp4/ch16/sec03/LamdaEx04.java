package javaApp4.ch16.sec03;

public class LamdaEx04 {

	public static void main(String[] args) {
		// P706 �޼ҵ� ����
		Person person =new Person();
		Computer computer = new Computer();
//		//���1 �͸�����ü �ڵ�
//		Calcuable calcuable = new Calcuable() {
//			
//			@Override
//			public double calc(double x, double y) {
//				// �ڵ� �͸� �������̽� �ҷ�����..
//				Computer.staticMethod(x, y);
//				return 0;
//			}
//		};
//		//���2 ���ٽ����� ���� - �������̽� �����ϰ�
//		Calcuable calcuable = (x, y) -> Computer.staticMethod(x, y);				
//		person.action(calcuable);
		
		//���3 �޼ҵ� ����
		Calcuable calcuable = Computer :: staticMethod;
	//   �������̽�     ����    = Ŭ������ :: Ŭ���� �ȿ� �ִ� �޼ҵ��
	//   ��������� �߻�޼ҵ带 �Է��Ͽ� Ŭ���� �ȿ� �ִ� �޼ҵ��� ����� ����ض�
		person.action( calcuable );
		
		Calcuable calcuable1 = new Calcuable() {
			
			@Override
			public double calc(double x, double y) {
				return 0;
			}
		};

	}

}
//@������̼� = �ٷ� �Ʒ��� ��ü�� �Ӽ��� �����ϴ� ��
@FunctionalInterface
interface Calcuable{
	double calc(double x, double y); //�߻� �޼ҵ�
}

class Person {
	public void action(Calcuable calcuable) {
		double result = calcuable.calc(10,4);
		System.out.println("���: " + result);
	}
}

class Computer{
	public static double staticMethod( double x, double y ) {
		return x + y;
	}
	public double instanceMethod ( double x, double y ) {
		return x * y;
	}
}
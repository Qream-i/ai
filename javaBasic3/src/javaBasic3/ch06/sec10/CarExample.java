package javaBasic3.ch06.sec10;

public class CarExample {

	public static void main(String[] args) {
		Car myCar = new Car();
		
		System.out.println("�𵨸� : " + myCar.model );
		System.out.println("�õ����� : " + myCar.start );
		System.out.println("����ӵ� : " + myCar.speed );
		System.out.println("ȸ��� : " + myCar.company );
		System.out.println("�ְ�ӵ� : " + myCar.maxSpeed );
		System.out.println("���� : " + myCar.color );
		
		myCar.speed=60;
		System.out.println("�����ȼӵ� :" + myCar.speed);
		
		Car sCar=new Car("�Ｚ�ڵ���", "SM3", "���", 370, 0);
		
		sCar.speed = 100;
		
		Car car3 = new Car();
		car3.setCompany("�����ڵ���");
		car3.setModel("BMW");
		car3.setMaxSpeed(300);
		car3.setColor("������");
		car3.setSpeed(0);
		
		System.out.println("=====================");
		System.out.println("ȸ��� : " + car3.getCompany());
		System.out.println("�𵨸� : " + car3.getModel());
		System.out.println("���� : " + car3.getColor());
		System.out.println("�ְ�ӵ� : " + car3.getMaxSpeed());
		System.out.println("����ӵ� : " + car3.getSpeed());
		
		
	}

}

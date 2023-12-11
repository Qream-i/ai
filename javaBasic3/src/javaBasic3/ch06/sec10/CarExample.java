package javaBasic3.ch06.sec10;

public class CarExample {

	public static void main(String[] args) {
		Car myCar = new Car();
		
		System.out.println("모델명 : " + myCar.model );
		System.out.println("시동여부 : " + myCar.start );
		System.out.println("현재속도 : " + myCar.speed );
		System.out.println("회사명 : " + myCar.company );
		System.out.println("최고속도 : " + myCar.maxSpeed );
		System.out.println("색깔 : " + myCar.color );
		
		myCar.speed=60;
		System.out.println("수정된속도 :" + myCar.speed);
		
		Car sCar=new Car("삼성자동차", "SM3", "흰색", 370, 0);
		
		sCar.speed = 100;
		
		Car car3 = new Car();
		car3.setCompany("독일자동차");
		car3.setModel("BMW");
		car3.setMaxSpeed(300);
		car3.setColor("검정색");
		car3.setSpeed(0);
		
		System.out.println("=====================");
		System.out.println("회사명 : " + car3.getCompany());
		System.out.println("모델명 : " + car3.getModel());
		System.out.println("색깔 : " + car3.getColor());
		System.out.println("최고속도 : " + car3.getMaxSpeed());
		System.out.println("현재속도 : " + car3.getSpeed());
		
		
	}

}

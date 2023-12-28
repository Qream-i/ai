package javaApp4.ch16.sec03;

public class LamdaEx04 {

	public static void main(String[] args) {
		// P706 메소드 참조
		Person person =new Person();
		Computer computer = new Computer();
//		//방법1 익명구현객체 코드
//		Calcuable calcuable = new Calcuable() {
//			
//			@Override
//			public double calc(double x, double y) {
//				// 자동 익명 인터페이스 불러오기..
//				Computer.staticMethod(x, y);
//				return 0;
//			}
//		};
//		//방법2 람다식으로 변경 - 인터페이스 간단하게
//		Calcuable calcuable = (x, y) -> Computer.staticMethod(x, y);				
//		person.action(calcuable);
		
		//방법3 메소드 참조
		Calcuable calcuable = Computer :: staticMethod;
	//   인터페이스     변수    = 클래스명 :: 클래스 안에 있는 메소드명
	//   언터펭디스의 추상메소드를 입력하여 클래스 안에 있는 메소드의 결과를 출력해라
		person.action( calcuable );
		
		Calcuable calcuable1 = new Calcuable() {
			
			@Override
			public double calc(double x, double y) {
				return 0;
			}
		};

	}

}
//@어ㅗ테이션 = 바로 아래의 객체의 속성을 제한하는 것
@FunctionalInterface
interface Calcuable{
	double calc(double x, double y); //추상 메소드
}

class Person {
	public void action(Calcuable calcuable) {
		double result = calcuable.calc(10,4);
		System.out.println("결과: " + result);
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
package javaBasic3.ch06.sec11;

public class CalculatorExample {

	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		calculator.powerOn();
		calculator.powerOff();
		calculator.powerOn();
		int result = calculator.plus(300, 500);
		System.out.println(result);
		
		int result2 = calculator.plus(-100, -50);
		
		int result3 = calculator.plus(100, 200, 300);
	}

}

package javaBasic3.ch06.sec10.exam03;

public class ClassName250 {
	int field1;
	void method1() {		
	}
	static int field2;
	static void method2() {}
	static {
		//field1 = 10;
		//method1();
		field2 = 10;
		method2();
	}
	
	static void method3() {
//		this.field1 = 10;
//		this.method1();
		field2 = 10;
		method2();
	}

}

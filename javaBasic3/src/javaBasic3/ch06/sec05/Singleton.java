package javaBasic3.ch06.sec05;

public class Singleton {
	
	private static Singleton singleton = new Singleton();
	
	private Singleton () {
		//new 를 달면 실행되는 생성자, 외부에서 안되도록 private 달아주기
	}
	
	public static Singleton getInstance() {
		return singleton;
	}
 
}

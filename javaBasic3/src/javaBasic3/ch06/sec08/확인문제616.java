package javaBasic3.ch06.sec08;

public class 확인문제616 {

	public static void main(String[] args) {
		Printer printer = new Printer ();
		printer.println(10);//참조변수명.메소드
		printer.println(true);
		printer.println(5.7);
		printer.println("홍길동");
		
		Printer1.println(10);//클래스명.메소드 static메소드
		Printer1.println(true);
		Printer1.println(5.7);
		Printer1.println("홍길동");
		//new 로 불러내지 않아도 static 메소드로 불러낼 수 있음.
		//클래스 로더 단계에서!
		
	}

}

package javaBasic4.ch07.sec09;

public class PromotionExample {

	public static void main(String[] args) {
		A a = new A ();
		B b = new B ();
		C c = new C ();
		D d = new D ();
		E e = new E ();
		
		A b1 = new B();//자식을 객체화 할 때는 변수를 부모로 놔도 됨
		A c1 = new C();
		B d1 = new D();
		C e1 = new E();
		A d2 = new D();

	}

}

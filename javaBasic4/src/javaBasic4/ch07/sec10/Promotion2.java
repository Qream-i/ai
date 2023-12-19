package javaBasic4.ch07.sec10;

public class Promotion2 {

	public static void main(String[] args) {
		A a = new A ();
		A b = new B ();
		A c = new C ();
		A d = new D ();
		B e = new E ();
		B f = new F ();
		C g = new G ();
		D h = new H ();
		E i = new I ();
		

	}

}


class A {
	
}
class B extends A{
	
}
class C extends A{
	
}
class D extends A{
	
}
class E extends B{
	
}
class F extends B{
	
}
class I extends E{
	
}
class G extends C{
	
}
class H extends D{
	
}



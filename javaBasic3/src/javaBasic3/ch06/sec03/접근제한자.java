package javaBasic3.ch06.sec03;

import javaBasic3.ch06.sec04.AA;
import javaBasic3.ch06.sec05.Singleton;

public class 접근제한자 {
	public static void main(String[] args) {
	Singleton o1 = Singleton.getInstance();
	System.out.println(o1);
	

	
		A aAdd = new A(); //객체화하기
		
		//System.out.println( aAdd.a ); 에러 
		System.out.println(aAdd.b);
		//접근제한자가 default이니까 같은 패키지는 가능하다.
		System.out.println(aAdd.c);
		//접근 제한자가 public이니까 가능하다.
		
		//aAdd.a1(); 에러 private 다른 객체에서 못씀
		aAdd.b1();
		aAdd.c1();
		
		AA aaAdd = new AA();
		//private : 다른 객체에서 못씀 / a 짤
		//default : 같은 패키지에서만 사용되기 때문에 b도 안됨
		System.out.println(aaAdd.c); // 접근제한자가 public이니까 사용 가능
		
		//실제 개발 할 때는 변수는 private, 메소드는 public으로.

	}

}

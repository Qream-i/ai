package javaApp4.ch16.sec01;

public class LamdaEx01 {

	public static void main(String[] args) {
		//익명 구현 클래스
		
		A a = new A() {
					@Override
					public int aM(int a, double b) {
						// TODO Auto-generated method stub
						return (int)(a+b);
					}
				};
		System.out.println(a.aM(10, 1.8));
		
		//람다식
		
//		A lam01 = (int a1, double b1) -> {return (int)(a1+b1);};
//		A lam01 = (a1, b1) -> {return (int)(a1+b1);}; < 매개변수의 자료형 생략 가능
		A lam01 = (a1, b1) -> (int)(a1+b1); //{} 안에 문장이 1개이니까 생략 가능, return 생략 가능
		System.out.println(lam01.aM(20, 8.8));
		
		B lam02 = (x, y, z) -> {
			System.out.println("이름은 : " + x);
			System.out.println("나이는 : " + y);
			if (z) System.out.println("남");
			else System.out.println("여");
		};
		lam02.bM("홍길동", 170, true);
		lam02.bM("이수연", 160, false);
	
	}

}

//@~~ 어노테이션 바로 아래에있는 객체의 성격을 제한할 때 사용
@FunctionalInterface
interface A {
	int aM(int a, double b);
}

interface B {
	void bM (String x, Integer y, Boolean z);
}
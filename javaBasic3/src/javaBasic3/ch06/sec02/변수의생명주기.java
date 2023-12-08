package javaBasic3.ch06.sec02;

public class 변수의생명주기 {

	public static void main(String[] args) {
		int a = 10; 
		//변수가 태어나기 생성 main() 안에서만 사용할수 있다.
		// 생성된 곳 {} 안에서만 사용 가능

	}
	
	void method01() {
		int b =20;
		//System.out.println(a); > 변수가 생성되지 않는다 - error
		
	}
	
	void method02() {
		
	}

}

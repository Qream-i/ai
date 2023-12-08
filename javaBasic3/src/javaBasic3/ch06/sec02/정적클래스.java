package javaBasic3.ch06.sec02;

public class 정적클래스 {
	static int st = 10;
	int it = 100;

	public static void main(String[] args) {
		//m1();
		정적클래스 i1 = new 정적클래스(); // 해당 문장으로 static 아닌 애들이 힙메모리에 올라감.
		i1.m2(); //위에 불러온 주소를 통해 밑의 m2 불러내기
		System.out.println(st);
		System.out.println(i1.it);
		m1( i1 );
		
		
	}
	
	static void m1(정적클래스 i1) {
		System.out.println("정적 메소드입니다.");
	}
	
	void m2() {//이 친구는 static이 안붙어있으니 new 써서 불러내야함
		System.out.println("인스턴스 메소드입니다.");
	}

}

package javaBasic2.ch05.sec01;

import java.util.Scanner;

public class 참조타입 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=10;
		Scanner sc= new Scanner(System.in);
		//new 는 힙 메모리에 Scanner 클래스를 올려달라는 뜻이다.> 이거는 주소를 만듦
		//왜? 해당 클래스를 써야하니까.
		//힙 메모리의 주소를 스택공간의 변수에 저장해야한다
		System.out.println(n);
		// 변수형식 = 자료형 변수명;
		Student st = new Student();
		Person per = new Person();
		//Person이라는 클래스를 만들고 new로 힙 메모리에저장
		//per라는 변수로 Person 클래스의 주소를 저장한다.
		Guide guide = new Guide();
	}

}

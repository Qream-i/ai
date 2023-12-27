package javaApp3.ch13.sec01;

public class GenericEx {

	public static void main(String[] args) {
		//제네릭이란? 나중에 형을 정하는것
		Box <Integer> intBox = new Box <Integer> ();
		intBox.content = 100;
		
		Box <String> strBox = new Box <String> ();
		strBox.content = "홍길동";
		
		BoxChild<Integer, String> bc = new BoxChild<Integer, String>();
		bc.content=10;
		bc.kind="aaa";
		
		
	}

}

class Box <T> {
	T content; //내용을 담을 변수 정수, 문자열, 객체... 등 담을 수 있는게 여러개
	//하나의 박스 안에 때려박지 말고 정리하기 > 해당 박스에 원하지 않는 자료가 들어가는 것 방지
}

class BoxChild <T, K> extends Box<T>{
	//K는 자신의 변수로 굳이 안써도 됨
	K kind;
}

interface Inter<A>{
	A method1();
}

class InterImpl <A> implements Inter<A>{
	@Override
	public A method1() {
		// TODO Auto-generated method stub
		return null;
	}
}
package javaApp3.ch13.sec01;

public class GenericEx {

	public static void main(String[] args) {
		//���׸��̶�? ���߿� ���� ���ϴ°�
		Box <Integer> intBox = new Box <Integer> ();
		intBox.content = 100;
		
		Box <String> strBox = new Box <String> ();
		strBox.content = "ȫ�浿";
		
		BoxChild<Integer, String> bc = new BoxChild<Integer, String>();
		bc.content=10;
		bc.kind="aaa";
		
		
	}

}

class Box <T> {
	T content; //������ ���� ���� ����, ���ڿ�, ��ü... �� ���� �� �ִ°� ������
	//�ϳ��� �ڽ� �ȿ� �������� ���� �����ϱ� > �ش� �ڽ��� ������ �ʴ� �ڷᰡ ���� �� ����
}

class BoxChild <T, K> extends Box<T>{
	//K�� �ڽ��� ������ ���� �Ƚᵵ ��
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
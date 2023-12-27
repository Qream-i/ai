package javaApp4.ch16.sec01;

public class LamdaEx02 {

	public static void main(String[] args) {
		// "����" --> ������б� ��� "��õ" -- ��õ���б�
		
//		College<String> c = (name) -> { return name+"���б�"; };
//		College<String> c = (name) -> name+"���б�";
		College<String> c = (name) -> { return (name+"���б�");};
		
		
		System.out.println(c.cName("����"));
		System.out.println(c.cName("��õ"));
		
		Fruit<String> f = (name) -> name+" �缼��.";
		System.out.println(f.fName("���"));
		System.out.println(f.fName("��"));
		//interface �������� �ʰ� College�� �ᵵ ��
		
		College<Integer> m = price ->  {
			if (price >= 3000) return price + 10000;
			else return price - 5000;
		};
		System.out.println(m.cName(2000));
		System.out.println(m.cName(5000));
	}

}
@FunctionalInterface
interface College<T>{
	T cName(T name);
}

@FunctionalInterface
interface Fruit<T>{
	T fName(T name);
}
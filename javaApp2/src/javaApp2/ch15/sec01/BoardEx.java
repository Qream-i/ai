package javaApp2.ch15.sec01;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class BoardEx {

	public static void main(String[] args) {
		//����
		//����, ��ü ���
		Board b1 = new Board ("ȫ�浿", "�ڹ�", "��ƴ�.");
		Board b2 = new Board ("�̼���", "���̽�", "����.");
		Board b3 = new Board ("ȫ�浿", "������", "���� �� �����.");
		Board b4 = new Board ("ȫ�浿", "������", "���� �� �����.");
		Board b5 = new Board ("�̼���", "�Ǵٽ�", "���� �� �����.");
		
		Set <Board> bSet = new HashSet <Board>();
		bSet.add(b1);
		bSet.add(b2);
		bSet.add(b3);
		bSet.add(b4);
		bSet.add(b5);
		
		System.out.println(bSet.size());
		
		Iterator <Board> it = bSet.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		

	}

}

class Board{
	
	String �ۼ���;
	String ����;
	String ����;
	
	public Board(String �ۼ���, String ����, String ����) {
		super();
		this.�ۼ��� = �ۼ���;
		this.���� = ����;
		this.���� = ����;
	}
	@Override
	public int hashCode() {
		return �ۼ���.hashCode() + ����.hashCode() + ����.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Board) {
			Board b = (Board) obj;
			if(�ۼ���.equals(b.�ۼ���) && ����.equals(b.����) && ����.equals(b.����))
				return true;
		}
		return false;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return �ۼ��� + " " + ���� + " " + ���� ;
	}
}

package javaApp2.ch15.sec01;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetEx2 {

	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		//ctrl+shift+o
		// ���� ���� : ��� �� �� �ٳ��� ��� ��
		set.add("���");
		set.add("��");
		set.add("��");
		set.add("���");
		set.add("��");
		set.add("�ٳ���");
		
		System.out.println(set.size());
		
		
		Iterator<String> it = set.iterator();
		
		System.out.println(set.contains("�޷�"));
		
		//set�ȿ� ���� ����ϱ�
		while (it.hasNext()) {
		System.out.println(it.next());
		}
		
		//set ���� ��� ��� �����ϱ�
		set.clear();
		System.out.println(set);
		
		

	}

}

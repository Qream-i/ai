package javaApp2.ch15.sec01;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetEx {

	public static void main(String[] args) {
		// set Ư¡ : �ߺ��� ��Ҹ� �����Ѵ�. �ߺ�������� �ʴ´�.
		Set<Integer> set = new HashSet<Integer>();
		
		set.add(10);
		set.add(50);
		set.add(80);
		set.add(10); //10 �ߺ��ؼ� �ι� ����
		
		set.size(); //set�� ����ִ� ��Ҹ� return
		System.out.println(set.size());//�ߺ��� 15���� 10�� ����, ������ 3��
		
		//set�� ����ִ� ���ǵ� ���
		Iterator<Integer> it = set.iterator();//�ݺ�
		while (it.hasNext()){
			System.out.println( it.next() );
		}
		
		//set �ȿ� 40�� �ֳ���? �ƴϿ�
		set.contains(40);
		System.out.println(set.contains(40));
		
		//set ���� ����ֳ���?
		set.isEmpty();
		System.out.println(set.isEmpty());
		
		//set ���� ���, 50�� ���켼��
		set.remove(50);
		System.out.println(set);
		
		//set �ȿ� ��� 100 �߰�
		//set ���� ���50 �����ϱ�
		
		set.add(100);
		set.remove(0);
		System.out.println(set);
		
	}

}

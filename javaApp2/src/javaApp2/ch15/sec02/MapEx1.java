package javaApp2.ch15.sec02;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapEx1 {

	public static void main(String[] args) {
		// 656
		
		Map<Integer, String> m1 = new HashMap<Integer,String>();
		
		m1.put(1, "�̼���");
		m1.put(2, "�ڼ���");
		m1.put(3, "ȫ�浿");
		
		System.out.println(m1.get(1));
		System.out.println(m1.get(3));
		//key�� ������ ���� ����
		
		Map<String, Double> m2 = new HashMap <String, Double>();
		m2.put("a", 2.5);
		m2.put("b", 3.5);
		
		System.out.println(m1.size());
		
		Map<String, String> m3 = new HashMap<String, String>();
		m3.put("ȫ�浿", "����");
		m3.put("�̼���", "����");
		m3.put("�ְ��", "���");
		m3.put("ȫ�浿", "����");
		
		System.out.println(m3.size());
		System.out.println(m3.get("�̼���"));
		System.out.println(m3.get("�ְ��"));
		System.out.println(m3.get("ȫ�浿"));
		
		
		Set<String> m3Keys = m3.keySet(); //Ű���� ��´�
		
		Iterator<String> it = m3Keys.iterator();
		while(it.hasNext()) {
			System.out.println(m3.get(it.next())+"###");//Ű������ �ݺ��ؼ� ���
		}

	}

}
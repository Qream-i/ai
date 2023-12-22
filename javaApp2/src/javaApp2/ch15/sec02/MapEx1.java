package javaApp2.ch15.sec02;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapEx1 {

	public static void main(String[] args) {
		// 656
		
		Map<Integer, String> m1 = new HashMap<Integer,String>();
		
		m1.put(1, "이순신");
		m1.put(2, "박수연");
		m1.put(3, "홍길동");
		
		System.out.println(m1.get(1));
		System.out.println(m1.get(3));
		//key를 넣으면 값이 나옴
		
		Map<String, Double> m2 = new HashMap <String, Double>();
		m2.put("a", 2.5);
		m2.put("b", 3.5);
		
		System.out.println(m1.size());
		
		Map<String, String> m3 = new HashMap<String, String>();
		m3.put("홍길동", "과장");
		m3.put("이순신", "부장");
		m3.put("최경미", "사원");
		m3.put("홍길동", "사장");
		
		System.out.println(m3.size());
		System.out.println(m3.get("이순신"));
		System.out.println(m3.get("최경미"));
		System.out.println(m3.get("홍길동"));
		
		
		Set<String> m3Keys = m3.keySet(); //키들을 담는다
		
		Iterator<String> it = m3Keys.iterator();
		while(it.hasNext()) {
			System.out.println(m3.get(it.next())+"###");//키값들이 반복해서 출력
		}

	}

}

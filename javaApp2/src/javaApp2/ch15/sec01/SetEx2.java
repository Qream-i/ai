package javaApp2.ch15.sec01;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetEx2 {

	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		//ctrl+shift+o
		// 과일 가게 : 사과 배 귤 바나나 사과 배
		set.add("사과");
		set.add("배");
		set.add("귤");
		set.add("사과");
		set.add("배");
		set.add("바나나");
		
		System.out.println(set.size());
		
		
		Iterator<String> it = set.iterator();
		
		System.out.println(set.contains("메론"));
		
		//set안에 모든거 출력하기
		while (it.hasNext()) {
		System.out.println(it.next());
		}
		
		//set 안의 모든 요소 삭제하기
		set.clear();
		System.out.println(set);
		
		

	}

}

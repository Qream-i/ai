package javaApp2.ch15.sec01;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetEx {

	public static void main(String[] args) {
		// set 특징 : 중복된 요소를 제거한다. 중복저장되지 않는다.
		Set<Integer> set = new HashSet<Integer>();
		
		set.add(10);
		set.add(50);
		set.add(80);
		set.add(10); //10 중복해서 두번 넣음
		
		set.size(); //set에 들어있는 요소를 return
		System.out.println(set.size());//중복된 15행의 10은 날려, 갯수는 3개
		
		//set에 들어있는 물건들 출력
		Iterator<Integer> it = set.iterator();//반복
		while (it.hasNext()){
			System.out.println( it.next() );
		}
		
		//set 안에 40이 있나요? 아니요
		set.contains(40);
		System.out.println(set.contains(40));
		
		//set 안이 비어있나요?
		set.isEmpty();
		System.out.println(set.isEmpty());
		
		//set 안의 요소, 50을 지우세요
		set.remove(50);
		System.out.println(set);
		
		//set 안에 요소 100 추가
		//set 안의 요소50 삭제하기
		
		set.add(100);
		set.remove(0);
		System.out.println(set);
		
	}

}

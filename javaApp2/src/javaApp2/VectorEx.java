package javaApp2;

import java.util.Vector;

public class VectorEx {

	public static void main(String[] args) {
		// 스레드 : 여러개의 cpu를 사용하면서 멀티프로그래밍을 하는 것
		//Vector 컬렉션은 스레드의 자료를 담기 위한 구조
		//이용분야 : 스레드로 멀티 프로그래밍할 때 순서가 있고 중복 저장할수 있는 자료구조
		
		Vector<Double> dArr =new Vector<Double>();
		dArr.add(10.4);
		dArr.add(8.8);
		dArr.add(9.4);
		dArr.add(3.7);
		
		//8.8 뒤에 7.9 넣기
		dArr.add(2, 7.9);
		//3.7이 있습니까 ?
		dArr.contains(3.7);
		//10.4 삭제하기
		dArr.remove(10.4);
		//전체 출력하기
		for(int i=0; i<dArr.size(); i++) {
			System.out.println( dArr.get(i));
		}
	}

}

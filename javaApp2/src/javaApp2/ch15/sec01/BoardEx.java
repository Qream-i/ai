package javaApp2.ch15.sec01;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class BoardEx {

	public static void main(String[] args) {
		//예제
		//갯수, 전체 출력
		Board b1 = new Board ("홍길동", "자바", "어렵다.");
		Board b2 = new Board ("이순신", "파이썬", "쉽다.");
		Board b3 = new Board ("홍길동", "넌파이", "아직 안 배웠다.");
		Board b4 = new Board ("홍길동", "넌파이", "아직 안 배웠다.");
		Board b5 = new Board ("이순신", "판다스", "아직 안 배웠다.");
		
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
	
	String 작성자;
	String 제목;
	String 내용;
	
	public Board(String 작성자, String 제목, String 내용) {
		super();
		this.작성자 = 작성자;
		this.제목 = 제목;
		this.내용 = 내용;
	}
	@Override
	public int hashCode() {
		return 작성자.hashCode() + 제목.hashCode() + 내용.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Board) {
			Board b = (Board) obj;
			if(작성자.equals(b.작성자) && 제목.equals(b.제목) && 내용.equals(b.내용))
				return true;
		}
		return false;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return 작성자 + " " + 제목 + " " + 내용 ;
	}
}

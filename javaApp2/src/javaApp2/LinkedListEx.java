package javaApp2;

import java.time.LocalDateTime;
import java.util.LinkedList;

public class LinkedListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Board> boardList = new LinkedList<Board>();
		Board b1 =new Board(1, "제목1", "내용1", "홍길동", LocalDateTime.now());
		Board b2 =new Board(2, "제목2", "내용2", "이순신", LocalDateTime.now());
		Board b3 =new Board(3, "제목3", "내용3", "최경미", LocalDateTime.now());
		
		boardList.add(b1);
		boardList.add(b2);
		boardList.add(b3);
		
		System.out.println(boardList.get(0).writer); //b1의 참조변수값
		System.out.println(boardList.get(1).title);
		System.out.println(boardList.get(2).writeDate);
		System.out.println(boardList.get(2).writer);
		
		Board b0 = new Board(0,"제목0", "내용0", "관리자", LocalDateTime.now());
		//0번 인덱스에 b0을 삽입하세요
		boardList.add(0,b0);
		//"최경미가 있습니까?"
		
		Board findAddress = null; // 찾는사람의주소를 담을 변수
		
		//1단계 최경미가 있는 클래스주소를 찾아야함
		for(int i=0; i<boardList.size(); i++) {
			System.out.println(boardList.get(i).writer);
			if(boardList.get(i).writer.equals("최경미")) {
				System.out.println("있습니다.");		
				findAddress = boardList.get(i);
			}
		}
		System.out.println("찾는사람 최경미씨가 작성한 게시글 내용은?" + findAddress.content);
		
		//게시글 번호 2번의 게시글 작성자는 누구인가요?
		Board findWriter = null;
		for (int i=0; i<boardList.size();i++) {
			System.out.println(boardList.get(i).no);
			if(boardList.get(i).no == 2) {
				findAddress = boardList.get(i);
			}
			
		
		}
		for (int i=0; i<boardList.size();i++) {
			System.out.println();
		}

	}

}
//게시판
class Board{
	int no; // 게시판번호
	String title; // 제목
	String content; //내용
	String writer; //작성자
	LocalDateTime writeDate; // 작성일
	
	
	public Board(int no, String title, String content, String writer, LocalDateTime writeDate) {
		super();
		this.no = no;
		this.title = title;
		this.content = content;
		this.writer = writer;
		this.writeDate = writeDate;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "번호" + no + "제목" + title + "내용" + content + "작성자" + writer + "작성일" + writeDate; 
	}
	
	
}

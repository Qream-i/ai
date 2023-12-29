package javaApp5.ch18.sec02;

import java.util.*;

public class StreamEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <String> list = new ArrayList<String>();
		list.add("사과");
		list.add("배");
		list.add("바나나");
		list.add("오렌지");
		list.add("사과");
		
		list.stream()
			.filter(t -> t.equals("사과"))
			.forEach(p -> System.out.println(p));
		
		list.stream()
			.filter( t-> t.equals("사과"))
			.distinct()
			.forEach(p -> System.out.println(p + " "));
		
		List<Student> sList = new ArrayList<Student>();
		sList.add(new Student("홍길동1", 85, "010-1234-5678"));
		sList.add(new Student("홍길동2", 92, "010-1234-5677"));
		sList.add(new Student("홍길동3", 87, "010-1234-5676"));
		sList.add(new Student("홍길동4", 95, "010-1234-5675"));
		
		sList.stream()
			.mapToInt(s -> s.getScore())
			.forEach( p -> System.out.println(p));
		
		sList.stream()
			.map(t -> t.getPhone())
			.forEach(p -> System.out.println(p) );
		
		sList.stream()
			.map(t -> t.getName())
			.forEach(p -> System.out.println(p) );


	}

}

class Student{
	private String name;
	private int score;
	private String phone;
	
	public Student(String name, int score, String phone) {
		super();
		this.name = name;
		this.score = score;
		this.phone = phone;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
}
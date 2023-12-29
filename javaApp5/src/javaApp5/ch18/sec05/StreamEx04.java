package javaApp5.ch18.sec05;

import java.util.*;

public class StreamEx04 {

	public static void main(String[] args) {
		// p744 ��� �����ϱ�
		
		List<Student> sList = new ArrayList<Student>();
		sList.add( new Student ("ȫ�浿", 30) );
		sList.add( new Student ("�ſ��", 10) );
		sList.add( new Student ("���̼�", 20) );
		
		//�䱸���� ������ �������� ������������ ������ ��Ʈ�� ���
		
		sList.stream()
			 .sorted()
			 .forEach(p -> System.out.println(p.getName()+ " " +p.getScore()));
	}

}

class Student implements Comparable<Student>{
	private String name;
	private Integer score;
	
	
	public Student(String name, int score) {
		super();
		this.name = name;
		this.score = score;
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
	
	@Override
	public int compareTo(Student o) {
		Integer sc = Integer.valueOf(score);//�⺻�� int �� Integer�� ����
		Integer os = Integer.valueOf(o.getScore());
		return 0;
	}
	
}
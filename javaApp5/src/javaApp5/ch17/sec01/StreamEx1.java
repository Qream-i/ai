package javaApp5.ch17.sec01;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamEx1 {

	public static void main(String[] args) {
//		//데이터를 흘려흘려보낸다
//		//순서 = 컬렉션 /배열 --> 오리지널 스트림 --> 중간단계 (필터,매핑 등) - 생략가능 --> 최종 스트림
//		
//		//1단계 : 컬렉션/배열
//		List<Student> list	=	Arrays.asList(  new Student ("홍길동", 10),
//									new Student ("신용권", 20),
//									new Student ("유미선", 30) );
//		//2단계 : 오리지널 스트림
//		Stream <Student> studentStream= list.stream();
//		
//		//3단계 : 점수를 가지고 오기 중간단계(필터,매핑 등)
//		//int applyAsInt(T value) < 이게 생략된거임
//		IntStream scoreStream = studentStream.mapToInt(student -> student.getScore());
//		double avg = scoreStream.average().getAsDouble();
//		
//		System.out.println( avg );
//		
		//한번에 연결
		
		//1단계 : 컬렉션/배열
				List<Student> list	=	Arrays.asList(  new Student ("홍길동", 10),
											new Student ("신용권", 20),
											new Student ("유미선", 30) );
				list.stream()
					.mapToInt(student -> student.getScore())
					.average()
					.getAsDouble();
				System.out.println();

	}

}

class Student{
	private String name;
	private int score;
	
	public Student(String name, int score) {
		super();
		this.name = name;
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public int getScore() {
		return score;
	}
	
}
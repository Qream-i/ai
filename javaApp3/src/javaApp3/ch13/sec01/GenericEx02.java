package javaApp3.ch13.sec01;

public class GenericEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Course.registerCourse1(new Applicant<Person>(new Person()));
		Course.registerCourse1(new Applicant<Worker>(new Worker()));
		Course.registerCourse1(new Applicant<Student>(new Student()));
		Course.registerCourse1(new Applicant<HighStudent>(new HighStudent()));
		Course.registerCourse1(new Applicant<MiddleStudent>(new MiddleStudent()));
		System.out.println();

	}

}

class Person {
	

}
class Worker extends Person{
	
}
class Student extends Person{
		
}
class HighStudent extends Student{
		
}
class MiddleStudent extends Student{
		
}

class Applicant<T>{
	public T kind;

	public Applicant(T kind) {
		this.kind = kind;
	}
	
}
class Course{
	public static void registerCourse1(Applicant<?> applicant) {
		System.out.println(applicant.kind.getClass().getSimpleName() + "이(가) Course1을 등록함");
	}
	public static void registerCourse2(Applicant<? extends Student> applicant) {
		System.out.println(applicant.kind.getClass().getSimpleName() + "이(가) Course2을 등록함");
		//Course2는 Student, HighStudent, MiddleStudent 만 등록이 가능
	}
	public static void registerCourse3(Applicant<? super Worker> applicant) {
		System.out.println(applicant.kind.getClass().getSimpleName() + "이(가) Course3을 등록함");
		//Course3은 Worker, Person만 등록 가능
	}
}
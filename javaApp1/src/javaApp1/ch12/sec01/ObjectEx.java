package javaApp1.ch12.sec01;

public class ObjectEx extends Object {

	public static void main(String[] args) {
		//object의 메소드는 모든 클래스들이 다 쓸 수 있다. 재정의할 수 있다.
		Member obj1 = new Member("blue");
		Member obj2 = new Member("blue");
		Member obj3 = new Member("red");
		
		if (obj1 == obj2) {
			System.out.println("같아요");
		}else {
			System.out.println("달라요");
		}
		//obj1 과 2의 주소를 비교하는 것이기 때문에 다름
		if (obj1.equals(obj2)) {
			System.out.println("같아요");
		}else {
			System.out.println("달라요");
		}
		//obj1의 주소값과 obj2의 주소값이 같느냐 라는 질문.
		if (obj1.equals(obj3)) {
			System.out.println("같아요");
		}else {
			System.out.println("달라요");
		}

	}
	

}
class Member {
	public String id;
	public String pwd;
	public String name;
	//id가 같고 pwd가 같으면 같은 사람일것이다.
	public Member(String id) {
		this.id = id;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			//instance of 는 앞의 것을 가지고 뒤의 것을 찾을 수 있느냐 라는 질문
			Member m = (Member) obj;
			if(this.id.equals(m.id)) {
				return true;
			}
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
	
	
}
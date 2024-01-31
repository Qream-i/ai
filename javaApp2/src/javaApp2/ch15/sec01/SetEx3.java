package javaApp2.ch15.sec01;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetEx3 {

	public static void main(String[] args) {
		// 652p
		Member m1 = new Member ("ȫ�浿", 25);
		Member m2 = new Member ("ȫ�浿2", 30);
		Member m3 = new Member ("ȫ�浿3", 25);
		Member m4 = new Member ("ȫ�浿4", 30);
		Member m5 = new Member ("ȫ�浿", 25);
		
		//set�ȿ� Member Ŭ������ �ּҸ� �ִ´�
		Set <Member> mSet = new HashSet <Member>();
		mSet.add(m1);
		mSet.add(m2);
		mSet.add(m3);
		mSet.add(m4);
		mSet.add(m5);
		
		System.out.println(mSet.size());
		
		//�̸��� ���̰� ������ ���� ���? hashCode() equals()
		//��� ����ϱ� �ּҷ�
		Iterator <Member> it = mSet.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		//�ּҸ� ����ϸ��ڵ����� toString() �ٴ´�
		//toString() ObjectŬ������ �޼ҵ��̴�
		//�ڽ��� Member���� toString() �������ϸ� �ڽ� �޼ҵ�� �ݿ��ȴ�.
		
		

	}

}

class Member{
	
	String name;
	int age;
	
	public Member(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	//���ü ����� �����Ϸ��� hashCode()�� equals()�� override�� ������
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		Integer ageI = Integer.valueOf(age);
		return name.hashCode() + ageI.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member m = (Member) obj;
			if (name.equals(m.name) && m.age == age)
				return true;
		}
			return false;
			
		
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name + " " + age;
	}
}
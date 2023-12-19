package javaBasic4.ch07.sec12;

import java.util.Scanner;

public class Promotion4Ex {

	public static void main(String[] args) {
		Promotion4Ex p =new Promotion4Ex();
		p.menuDisplay();
		p.menuChoice();
		int choice = p.menuChoice();
		p.output(choice);

	}
	
	public void menuDisplay() {
		System.out.println("-----------------------------------");
		System.out.println("1. �� 2. ������ 3. �ܹ��� 4. ���� 5. ����");
		System.out.println("-----------------------------------");
	}
	public int menuChoice() {
		Scanner sc = new Scanner(System.in);
		System.out.print("�޴��� �ֹ��ϼ��� > ");
		int  choice;
		choice =sc.nextInt();
		return choice;
	}
	public void output (int choice) {
		A a = null;
		
		if(choice == 5) {System.out.println("��� �� �ֹ� �Ϸ�!"); return;}
		switch(choice) {
			case 1 : a = new A(); a.eat(); break;
			case 2 : a = new B(); a.eat(); break;
			case 3 : a = new BB(); a.eat(); break;
			case 4 : a = new C(); a.eat(); break;
			default :
		} 
			a.eat();
			System.out.print(" ���ְ� �弼��");
	}
	

}


class A{
	   void eat() {
	      System.out.println("��");
	   }
	}
	class B extends A{
	   @Override
	   void eat() {
	      System.out.println("������");
	   }
	}
	class BB extends A{
	   @Override
	   void eat() {
	      System.out.println("�ܹ���");
	   }
	}
	class C extends B{
	   @Override
	   void eat() {
	      System.out.println("����");
	   }
	}
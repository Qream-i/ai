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
		System.out.println("1. π‰ 2. ∂±∫∫¿Ã 3. «‹πˆ∞≈ 4. ««¿⁄ 5. ¡æ∑·");
		System.out.println("-----------------------------------");
	}
	public int menuChoice() {
		Scanner sc = new Scanner(System.in);
		System.out.print("∏ﬁ¥∫∏¶ ¡÷πÆ«œººø‰ > ");
		int  choice;
		choice =sc.nextInt();
		return choice;
	}
	public void output (int choice) {
		A a = null;
		
		if(choice == 5) {System.out.println("¿ÂªÁ ≥° ¡÷πÆ øœ∑·!"); return;}
		switch(choice) {
			case 1 : a = new A(); a.eat(); break;
			case 2 : a = new B(); a.eat(); break;
			case 3 : a = new BB(); a.eat(); break;
			case 4 : a = new C(); a.eat(); break;
			default :
		} 
			a.eat();
			System.out.print(" ∏¿¿÷∞‘ µÂººø‰");
	}
	

}


class A{
	   void eat() {
	      System.out.println("π‰");
	   }
	}
	class B extends A{
	   @Override
	   void eat() {
	      System.out.println("∂±ª»¿Ã");
	   }
	}
	class BB extends A{
	   @Override
	   void eat() {
	      System.out.println("«‹πˆ∞≈");
	   }
	}
	class C extends B{
	   @Override
	   void eat() {
	      System.out.println("««¿⁄");
	   }
	}
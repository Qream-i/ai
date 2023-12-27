package javaApp2.ch15.sec02;

import java.util.Comparator;
import java.util.TreeSet;

public class ComparatorEx {

	public static void main(String[] args) {
		// 
		Fruit f1 = new Fruit("포도", 3000);
		Fruit f2 = new Fruit("수박", 10000);
		Fruit f3 = new Fruit("딸기", 6000);
//		TreeSet<Fruit> ts = new TreeSet<Fruit>();
		TreeSet<Fruit> ts = new TreeSet<Fruit>(new FruitCom());
		ts.add(f1);
		ts.add(f2);
		ts.add(f3);
		//전체 출력하기
		for ( Fruit t : ts) {
			System.out.println(t.name + " " + t.price);
		}
	}

}


////과일 객체
//class Fruit implements Comparable<Fruit>{
//	String name;
//	Integer price;
//	
//	
//	public Fruit(String name, Integer price) {
//		super();
//		this.name = name;
//		this.price = price;
//	}
//	@Override
//	public int compareTo(Fruit o) {
//		// 과일명으로 Tree에 달 때는 compareTo를 작성하기
//		return name.compareTo(o.name);
	

class Fruit{
	String name;
	Integer price;
	
	public Fruit(String name, Integer price) {
		super();
		this.name = name;
		this.price = price;
	}
	
	
}
//클래스 설계 해둔 것
class FruitCom implements Comparator<Fruit>{
	
	//과일명 순으로 트리에 달기
//	@Override
//	public int compare(Fruit o1, Fruit o2) {
//		// o1 ㅌ리에 달려있는 자료, o2 트리에 달아줄자료
//		return o1.name.compareTo(o2.name);
//		//들어있는자료, "포도"  &  달아줄 재료, "수박"
	//}
	@Override
	public int compare(Fruit o1, Fruit o2) {
		// TODO Auto-generated method stub
		return o1.price.compareTo(o2.price);
	}
}
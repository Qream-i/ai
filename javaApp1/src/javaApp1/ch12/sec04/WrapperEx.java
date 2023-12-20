package javaApp1.ch12.sec04;

public class WrapperEx {

	public static void main(String[] args) {
		// 524
		Integer a = 10;
		Integer a1 = new Integer(10);
		String as = a.toString(); // 10 > "10"
		
		double da = a.doubleValue();
		System.out.println(da);
		System.out.println( a.MAX_VALUE);
		System.out.println( a.MIN_VALUE);
		System.out.println( a.SIZE);
		
		//
		Double pi = 3.14;
		String pis = pi.toString();
		System.out.println( pi.MAX_VALUE);
		System.out.println( pi.MIN_VALUE);
		System.out.println( pi.SIZE);

	}

}

package javaApp5.ch17.sec01;

import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamEx02 {

	public static void main(String[] args) throws URISyntaxException {
		// 목표 : 1단계 컬렉션, 배열을 스트림으로 만든 방법을 상세 배움
		
		List<Product> list = new ArrayList<Product>();
		
		// 자료 넣기
		for ( int i=1; i<=5 ; i++) {
			Product product = new Product (i, "상품"+i, "멋진회사",(int)(10000*Math.random())); //0.0 <= Math.random() < 1.0
			list.add(product);
		}
		
		Stream <Product> stream = list.stream();
		stream.forEach(p-> System.out.println(p));
		
		list.stream()
			.forEach(p ->  System.out.println(p) );
		
		String[] strArr = {"홍길동","신용권","김미나", "신주미"};
		Stream<String> streamStr = Arrays.stream(strArr);//배열이 오리지널 스트림으로 바뀐다
		//boolean test (T t);
		streamStr.filter(t -> t.startsWith("신"))
								.forEach(p -> System.out.println( p + " 장학금 대상"));
		
		
		IntStream is = IntStream.range(1, 101); //1 <= IntStream.range(1,100) <100 
		System.out.println(is.count());
		
		is = IntStream.range(1, 101); //오리지널 스트림을 다시 만들어줘야함 (흐르는물)
		System.out.println(is.max().toString());
		
		is = IntStream.range(1, 101); //오리지널 스트림을 다시 만들어줘야함 (흐르는물)
		System.out.println(is.min().toString());
		
		//파일로부터 스트림 열기
		//현재 프로그램으로 data.txt 자료를 가지고 오세요.
		Paths.get(StreamEx02.class.getResource("D:\\AI\\study\\java_study\\data.txt").toURI());
//		Files.lines(path, Charset.defaultCharset());
//		fileStream.forEach ( p-> System.out.println( p ) );
//		fileStream.close();
//		
		  
	}

}

class Product{
	private int pno;
	private String name;
	private String company;
	private int price;
	
	@Override
	public String toString() {
		return pno + " " + name + " " + company + " " + price;
	}
	
	public Product(int pno, String name, String company, int price) {
		super();
		this.pno = pno;
		this.name = name;
		this.company = company;
		this.price = price;
	}

	public int getPno() {
		return pno;
	}

	public void setPno(int pno) {
		this.pno = pno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
}
package javaApp1;

import java.lang.module.ModuleDescriptor;
import java.util.Date;
import java.util.Scanner;
import java.util.StringTokenizer;

public class App1Ex {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = "abcde";
		int aHashCode = a.hashCode();
		System.out.println(aHashCode);
		//주기억장치의 주소가 나옴(해시코드 값)
		//스캐너와 다르게 스트링은 이미
		
		double pi = Math.PI;
		System.out.println(pi);
		//math 와 string 은 final이라 자식갖는게 불가능
		
		double e = Math.E;
		System.out.println(e);
		double cos =  Math.cos(45.0);
		System.out.println(cos);
		
		Date date = new Date ();
		int d = date.getDate();
		System.out.println(d);
		
		long t = date.getTime();
		System.out.println(t);
		
		long date1 = Date.parse("2023/12/19");
		System.out.println(date1);
		
		// long date2 = DateFormat.parse("2023/12/19");
		String text = "ab/cd/ef";
		StringTokenizer st =new StringTokenizer("ab/cd/ef", "/");
		int count = st.countTokens();
		System.out.println(count);
		
		String token1 = st.nextToken();
		System.out.println(token1);
		token1 = st.nextToken();
		System.out.println(token1);
		token1 = st.nextToken();
		System.out.println(token1);
		//처음덩어리 다음 덩어리 다음 덩어리 ..
		// '/' 기준으로 덩어리 계산, 예시는 세덩어리인데 넘어가면 에러가 뜸!
		
		//ModuleDescriptor md = new ModuleDescriptor();
		// > 생성자가 없기 때문에 할 수 없는 new 구문 !
		

		}

}

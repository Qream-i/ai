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
		//�ֱ����ġ�� �ּҰ� ����(�ؽ��ڵ� ��)
		//��ĳ�ʿ� �ٸ��� ��Ʈ���� �̹�
		
		double pi = Math.PI;
		System.out.println(pi);
		//math �� string �� final�̶� �ڽİ��°� �Ұ���
		
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
		//ó����� ���� ��� ���� ��� ..
		// '/' �������� ��� ���, ���ô� ������ε� �Ѿ�� ������ ��!
		
		//ModuleDescriptor md = new ModuleDescriptor();
		// > �����ڰ� ���� ������ �� �� ���� new ���� !
		

		}

}

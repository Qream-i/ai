package javaApp1.ch12.sec04;

import java.util.StringTokenizer;

public class StringTokenizerEz {

	public static void main(String[] args) {
		String data1 = "ȫ�浿&�̼�ȫ,�ڿ���";
		//��� ȭ���� ȫ�浿 �̼�ȫ �ڿ��� �� ��µǵ���
		// ���1 String Ŭ������ split() ����ϱ�
		// ���2 String Tokenizer Ŭ���� ����ϱ�
		
		//��� 1)
		String arr[] = data1.split("&|,");
		for( int i=0; i< arr.length; i++) {
			System.out.println(arr[i]);
		}
		//���� for��
		for (String i : arr) {
			System.out.println(i);
		}
		
		//���2 Tokenizer����ϱ�\
		String data2 = "ȫ�浿/�̼�ȫ/�ڿ���/�̼���/�ּ���";
		StringTokenizer st = new StringTokenizer(data2, "/");
		//static���� ���������� ������ ��üȭ�� �ҷ��;���
		while(st.hasMoreTokens()) {
			System.out.println( st.nextToken() );
		}
			//��ū�� �ִٸ� True, ���ٸ� False�� ������ Token ���� ����� �ߴ��� Ȯ�����ִ� �Լ�
		
		String data3 = "���-��-��-�ٳ���";
		StringTokenizer st2 = new StringTokenizer(data3, "-");
		while(st2.hasMoreTokens()) {
			System.out.println(st2.nextToken());
		}	
		String data4 = "�ڹ�+���̽�+����Ŭ+�ټ��÷ξ�";
		StringTokenizer st3 = new StringTokenizer(data4, "+");
		while(st3.hasMoreTokens()) {
			System.out.println(st3.nextToken());
			
		}
	}

}

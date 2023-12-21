package javaApp2;

import java.util.ArrayList;

public class ArrayListEx {

	public static void main(String[] args) {
		int[] iarr= {1,2};
		for(int i : iarr) {
			System.out.println(i);
		}
		for(int i=0;i<iarr.length;i++) {
			System.out.println(iarr[i]);
		}
		
		//list�� ���� Ŭ������ ArraysList�� �̿��Ͽ� ���� �߰� �����ϰ�
		ArrayList<Integer> arrList = new ArrayList<Integer>();
		//<E>�� ���׸� �ڷ��� ���� �̸� ����
		arrList.add(1);
		arrList.add(2);
		System.out.println(arrList.size());
		arrList.add(3);
		arrList.add(4);
		//0�� �ε����� -7 �ֱ�
		arrList.add(0, -7);
		//��ü�� ����ϰ� ���� ��. �ݺ��� ���
		for(int i=0; i<arrList.size();i++) {
			System.out.print(arrList.get(i)+" "); // �ε��� ��ȣ�� �ִ� ��� ����ϱ�.
		}
		System.out.println();
		
		ArrayList<String> sArr =new ArrayList<String>();
		sArr.add("���");
		sArr.add("��");
		sArr.add("��");
		sArr.add("�ٳ���");
		//�ְ� �ٳ��� ���̿� ���ξ��óֱ�
		sArr.add(3, "���ξ���");
		//3���ε����� �ٳ��� �ڸ��� �����ϱ� ������ 3
		//����� �� ���̿� �޷�
		sArr.add(1,"�޷�");
		//���� õ�������� �����ϱ� - set ����ϱ�
		sArr.set(3, "õ����");
		//�ٳ���, ���ξ��� ����� 
		sArr.remove(5);
		sArr.remove("���ξ���");
		for(int i=0;i<sArr.size();i++) {
			System.out.print(sArr.get(i)+" ");
		}
		System.out.println();
		//���ξ����� �ֽ��ϱ�? ����
		if (sArr.contains("���ξ���")) {
			System.out.println("�ֽ��ϴ�.");
		}else {
			System.out.println("�����ϴ�.");
		}
		
		//����� �� �ֽ��ϱ�?
		if(sArr.contains("���") && sArr.contains("��")) {
			System.out.println("�ֽ��ϴ�.");
		}else {
			System.out.println("�����ϴ�.");
		}
		
		//�迭 ����Ʈ�� ����ֳ��� ? isEmpty
		if(!sArr.isEmpty()) {
			sArr.clear(); // ��� ��� �����
			System.out.println("���� ������ ��� ġ�����ϴ�.");
		}
		

	}

}

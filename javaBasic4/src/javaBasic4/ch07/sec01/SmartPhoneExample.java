package javaBasic4.ch07.sec01;

public class SmartPhoneExample {

	public static void main(String[] args) {
		//���� �︳�ϴ�. �� ��½�Ű����.
		Phone p=new Phone();
		p.bell();
		p.sendVoice("�� ���!");
		p.receiveVoice("�� ��� �ʵ� �� ���?");
		
		SmartPhone sp = new SmartPhone();
		sp.sendVoice("���� ����?");
		sp.receiveVoice("������ �����Ұž�");
		sp.hangUp();
		
		SmartPhone sp2 = new SmartPhone("������", "���");
		System.out.println(sp2.model);
		
		sp2.setWifi(false);
		 if(sp2.wifi) {
			System.out.println(sp2.model + "��" +"�������̰� ����Ǿ����ϴ�.");
		} else {
			System.out.println(sp2.color + " �ڵ����� " + "�������� ���ῡ �����Ͽ����ϴ�.");
		}
		 System.out.println(sp2.model + "�� " + sp2.color + "�̰� ");
		 p.bell();
		 System.out.println(sp2.model + "�� �޼����� �Խ��ϴ�." );
		 sp2.sendVoice("�ڵ��� ���?");
		 
//		 //�θ� Ŭ�������� �ڽ��� wifi �ʵ�, �޼ҵ� ����ϱ�
//		 �θ�Ŭ���������� �ڽ��� ������� �� �� ����.
//		 p.wifi=true;
//		 p.setwifi()
		 
	}

}

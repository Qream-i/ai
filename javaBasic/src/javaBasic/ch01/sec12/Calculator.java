package javaBasic.ch01.sec12;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 1;					 //���� x�� �����ϰ� 1�� ����
		int y = 2; 					 //���� y�� �����ϰ� 2�� ����
		int result = x + y; 		 //���� result�� �����ϰ� x�� y�� ���� ���� ����
		System.out.println(result);  //�ֿܼ� ����ϴ� �޼ҵ� ȣ��
		
		int z = 3;
		int a = 4;
		int result2 = x + y + z + a;
		System.out.println(result2);
		

		//5�� �Ƹ�����Ʈ�� �޿� �Ի��ϴ� ���α׷� �ۼ��ϱ�
		//1���� ��� �޿� ����ϱ�
		//���� : �������� ������; ������ = ��;
		String name;
		name="ȫ�浿";
		//string = ���� int = ����
		int basicPay = 50000; //�޿� (���� int)
		String phoneNumber = "010-1234-5678"; //��ȭ��ȣ(���� string)
		String accountNumber ="���� 12-1234-123"; //���¹�ȣ(���� string)
		String dept = "�˹ٻ�"; //����(���� string)
		boolean sex = true; //����(���� = true ���� = false)
		double tax = 0.03; //����(����)
		
		String name1;
		name1="�̼���";
		//string = ���� int = ����
		int basicPay1 = 20000; //�޿� (���� int)
		String phoneNumber1 = "010-234-4567"; //��ȭ��ȣ(���� string)
		String accountNumber1 ="�츮 321-32-4321"; //���¹�ȣ(���� string)
		String dept1 = "������"; //����(���� string)
		boolean sex1 = true; //����(���� = true ���� = false)
		double tax1 = 0.02; //����(����)
		
		String name2;
		name2="�̰��";
		//string = ���� int = ����
		int basicPay2 = 15000; //�޿� (���� int)
		String phoneNumber2 = "010-987-7456"; //��ȭ��ȣ(���� string)
		String accountNumber2 ="���� 123-555-7878"; //���¹�ȣ(���� string)
		String dept2 = "����"; //����(���� string)
		boolean sex2 = false; //����(���� = true ���� = false)
		double tax2 = 0.015; //����(����)
		
		String name3;
		name3="������";
		//string = ���� int = ����
		int basicPay3 = 10000; //�޿� (���� int)
		String phoneNumber3 = "010-8744-3334"; //��ȭ��ȣ(���� string)
		String accountNumber3 ="���� 555-65-8989"; //���¹�ȣ(���� string)
		String dept3 = "����"; //����(���� string)
		boolean sex3 = false; //����(���� = true ���� = false)
		double tax3 = 0.025; //����(����)
		
		String name4;
		name4="�ּ���";
		//string = ���� int = ����
		int basicPay4 = 9800; //�޿� (���� int)
		String phoneNumber4 = "010-333-7777"; //��ȭ��ȣ(���� string)
		String accountNumber4 ="īī�� 777-454-1231"; //���¹�ȣ(���� string)
		String dept4 = "��������"; //����(���� string)
		boolean sex4 = false; //����(���� = true ���� = false)
		double tax4 = 0.05; //����(����)
		
		//����ϱ�
		System.out.println("1�� �˹� ���� : " + name + "  " + basicPay + "  " + phoneNumber );
		System.out.println(accountNumber + "  " + dept + "  " + sex + "  " + tax);
		System.out.println("2�� �˹� ���� : " + name1 + "  " + basicPay1 + "  " + phoneNumber1 );
		System.out.println(accountNumber1 + "  " + dept1 + "  " + sex1 + "  " + tax1);
		System.out.println("3�� �˹� ���� : " + name2 + "  " + basicPay2 + "  " + phoneNumber2 );
		System.out.println(accountNumber2 + "  " + dept2 + "  " + sex2 + "  " + tax2);
		System.out.println("4�� �˹� ���� : " + name3 + "  " + basicPay3 + "  " + phoneNumber3 );
		System.out.println(accountNumber3 + "  " + dept3 + "  " + sex3 + "  " + tax3);
		System.out.println("5�� �˹� ���� : " + name4 + "  " + basicPay4 + "  " + phoneNumber4 );
		System.out.println(accountNumber4 + "  " + dept4 + "  " + sex4 + "  " + tax4);
		
		//�����޾�
		//1�� 10�ð� 2�� 15�ð� 3�� 20�ð� 4�� 25�ð� 5�� 30�ð�
		//1���� 10�ð� ���ؼ�  10 x 50000 = 500000 ���� 500000 x 0.03 �Ǽ��ɾ� = 500000- ���ݾ�
		
		//50������ ������ ��´�
		int sum1 = 10 * basicPay;
		
		//������ ����Ѵ�
		//int taxCal = sum1 * tax; �̰� ������ ��
		double taxCal = sum1 * tax;
		double sal = sum1 - taxCal;
		System.out.println(sum1 + "  " + taxCal + "  " + sal);
		
		int sum2 = 10 * basicPay;
		double taxCal2 = sum2 * tax1;
		double sal2 = sum2 - taxCal2;
		System.out.println(sum2 + "  " + taxCal2 + "  " + sal2);
		
		int sum3 = 10 * basicPay;
		double taxCal3 = sum3 * tax2;
		double sal3 = sum3 - taxCal3;
		System.out.println(sum3 + "  " + taxCal3 + "  " + sal3);
		
		int sum4 = 10 * basicPay;
		double taxCal4 = sum4 * tax3;
		double sal4 = sum4 - taxCal4;
		System.out.println(sum4 + "  " + taxCal4 + "  " + sal4);
		
		int sum5 = 10 * basicPay;
		double taxCal5 = sum5 * tax4;
		double sal5 = sum5 - taxCal5;
		System.out.println(sum5 + "  " + taxCal5 + "  " + sal5);
	}

}
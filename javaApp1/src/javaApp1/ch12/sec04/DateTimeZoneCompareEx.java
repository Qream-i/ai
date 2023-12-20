package javaApp1.ch12.sec04;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

public class DateTimeZoneCompareEx {

	public static void main(String[] args) {
		// ���� ��¥
		// Ư�� ��¥
		LocalDateTime startDateTime = LocalDateTime.of(2021, 1, 1, 0, 0);
		LocalDateTime stopDateTime = LocalDateTime.of(2021, 12, 31, 23, 59);
		LocalDateTime eventDateTime = LocalDateTime.of(2022, 12, 31, 23, 59);
		
		DateTimeFormatter dtf =  DateTimeFormatter.ofPattern("yyyy-MM-dd a HH:mm:ss");
		System.out.println("������ " + startDateTime.format(dtf));
		System.out.println("������ " + stopDateTime.format(dtf));
		
		if (startDateTime.isBefore(stopDateTime)) {
			System.out.println("�̺�Ʈ �������Դϴ�.");
		}else if ( eventDateTime.isEqual(stopDateTime)) {
			System.out.println("�̺�Ʈ ���� �����մϴ�.");
		}else {
			System.out.println("�̺�Ʈ �����߽��ϴ�. ���� ��ȸ��.");
		}
		
		//2023-12-20 12:00 ~ 12-25 11:59 �̺�Ʈ
		//�̺�Ʈ �Ⱓ�̸� ����70%, �̺��� ������ ���� 85%. �ƴϸ� �̺�Ʈ ����
		
		
		LocalDateTime eventstart = LocalDateTime.of(2023, 12, 20, 12, 00);
		LocalDateTime now = LocalDateTime.now();
		LocalDateTime eventend = LocalDateTime.of(2023, 12, 25, 23, 59);
		System.out.println("������ " + eventstart.format(dtf));
		System.out.println("������ " + eventend.format(dtf));
		
		if (eventstart.isBefore(eventend)) {
			System.out.println("���� 70% �������Դϴ�.");
		}else if ( now.isEqual(eventend)) {
			System.out.println("������ ���� 85% �������Դϴ�.");
		}else {
			System.out.println("�̺�Ʈ ���� �Ǿ����ϴ�.");
		}

	}

}

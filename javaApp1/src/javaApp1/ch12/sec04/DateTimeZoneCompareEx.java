package javaApp1.ch12.sec04;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

public class DateTimeZoneCompareEx {

	public static void main(String[] args) {
		// 현재 날짜
		// 특정 날짜
		LocalDateTime startDateTime = LocalDateTime.of(2021, 1, 1, 0, 0);
		LocalDateTime stopDateTime = LocalDateTime.of(2021, 12, 31, 23, 59);
		LocalDateTime eventDateTime = LocalDateTime.of(2022, 12, 31, 23, 59);
		
		DateTimeFormatter dtf =  DateTimeFormatter.ofPattern("yyyy-MM-dd a HH:mm:ss");
		System.out.println("시작일 " + startDateTime.format(dtf));
		System.out.println("종료일 " + stopDateTime.format(dtf));
		
		if (startDateTime.isBefore(stopDateTime)) {
			System.out.println("이벤트 진행중입니다.");
		}else if ( eventDateTime.isEqual(stopDateTime)) {
			System.out.println("이벤트 오늘 마감합니다.");
		}else {
			System.out.println("이벤트 마감했습니다. 다음 기회에.");
		}
		
		//2023-12-20 12:00 ~ 12-25 11:59 이벤트
		//이벤트 기간이면 세일70%, 이벤느 마감일 세일 85%. 아니면 이벤트 종료
		
		
		LocalDateTime eventstart = LocalDateTime.of(2023, 12, 20, 12, 00);
		LocalDateTime now = LocalDateTime.now();
		LocalDateTime eventend = LocalDateTime.of(2023, 12, 25, 23, 59);
		System.out.println("시작일 " + eventstart.format(dtf));
		System.out.println("종료일 " + eventend.format(dtf));
		
		if (eventstart.isBefore(eventend)) {
			System.out.println("세일 70% 진행중입니다.");
		}else if ( now.isEqual(eventend)) {
			System.out.println("마감일 세일 85% 진행중입니다.");
		}else {
			System.out.println("이벤트 종료 되었습니다.");
		}

	}

}

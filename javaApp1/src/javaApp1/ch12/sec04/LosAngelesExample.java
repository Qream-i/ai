package javaApp1.ch12.sec04;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.TimeZone;

public class LosAngelesExample {

	public static void main(String[] args) {
		TimeZone timeZone = TimeZone.getTimeZone("America/Los_Angeles");
		TimeZone timeZone1 = TimeZone.getTimeZone("CET");
		TimeZone timeZone2 = TimeZone.getTimeZone("KST");
		
		Calendar now = Calendar.getInstance(timeZone1);
		System.out.println(now.get(Calendar.MONTH)+"월 " +now.get(Calendar.DAY_OF_MONTH)+"일 " +now.get(Calendar.HOUR)+"시 " + now.get(Calendar.MINUTE)+"분");
		
		String[] av=TimeZone.getAvailableIDs();
		for(String a : av) {
			System.out.println(a);
		}
		
		LocalDateTime now1 = LocalDateTime.now();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy.MM.dd a HH:mm:ss");
		System.out.println("현재시간 : " + now1.format(dtf));
		
		LocalDateTime now1After = now1.plusYears(1);
		System.out.println("1년후 : " + now1After.format(dtf));
		
		LocalDateTime now3Before = now1.minusYears(3);
		System.out.println("3년후 : " + now3Before.format(dtf));
		
		LocalDateTime now2After = now1.plusWeeks(2);
		System.out.println("대출일 : " + now1.format(dtf) + " 반납일 : " + now2After.format(dtf));

	}

}

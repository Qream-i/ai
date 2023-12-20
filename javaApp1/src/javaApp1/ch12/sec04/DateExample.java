package javaApp1.ch12.sec04;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExample {

	public static void main(String[] args) {
		Date now = new Date();
		String strNow1= now.toString();
		System.out.println(strNow1);
		
		SimpleDateFormat sdf= new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
		sdf.format(now);

	}

}

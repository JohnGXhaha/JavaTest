package com.model.system;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class DateTest {
	public static void main(String[] args) {
		System.out.println(new Date().getTime());
		System.out.println(new Date(22));
		
		 
		Calendar cal=Calendar.getInstance();
		System.out.println(cal.get(Calendar.YEAR));
		
		System.out.println("\1");
		
		TimeZone tz=TimeZone.getDefault();
		System.out.println(tz);
		System.out.println(Arrays.toString(tz.getAvailableIDs()));
	}
}

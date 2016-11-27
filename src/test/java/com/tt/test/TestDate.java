package com.tt.test;

import java.util.Calendar;
import java.util.Date;

public class TestDate {
	
//	static{
//		System.load("D:\\HighFunction\\GrowthIceThicknessJavaDll\\GrowthIceThickness.dll");
//	}
//
	public static void main(String[] args) {
		Date date = new Date();
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		System.out.println(cal.getTime());
		cal.add(Calendar.MINUTE,10);
		System.out.println(cal.getTime());
		
	}

}

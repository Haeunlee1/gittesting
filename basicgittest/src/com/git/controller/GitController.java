package com.git.controller;

import java.util.Date;

public class GitController {
	
	public void testPrint() {
		System.out.println("프린트 하는 것");
	}
	
	public int calcPlus(int su1, int su2) {
		return su1-su2;
	}
	
	public String concatTest(String a, String b) {
		return a+b;
	}
	
	public Date bDay(int year, int month, int date) {
		return new Date(new GregorianCalender(year,month,date).getTimeInMillis());
	}
}

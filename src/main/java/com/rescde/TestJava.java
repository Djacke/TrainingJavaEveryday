package com.training.thread;

import java.util.Scanner;

abstract public class TestJava {

	private String id;
	private String password;
	
	public static void main(String[] args) {
		System.out.println(convertFirstCharToUpper("isShowPrice"));
	}
	
	private static String convertFirstCharToUpper(String field){
			return field.substring(0, 1).toUpperCase() + field.substring(1, field.length());
	}
	
	public void testLoop(){
		
		Scanner sc = new Scanner(System.in);
		Object a;
		int b = 0;
		boolean bool = true;
		 
		while (bool) {
		    System.out.println("bool is true");
		    try {
		        a = sc.next();
		        b = Integer.valueOf((String) a);
		        bool = false;
		    } catch (Exception e) {
		        System.out.println("has error:" + e.getMessage());
		    }
		}
		 
		System.out.println("b = " + b);
	}
	public abstract String doSomething();
	static
	{
		System.out.println("test static block....");
	}
	
	{
		System.out.println("test method block....");
	}
	
	TestJava()
	{
		System.out.println("TestJava()");
	}

	TestJava(String id,String password)
	{
		System.out.println("TestJava(String id,String password)");
		this.id = id;
		this.password = password;
	}
}

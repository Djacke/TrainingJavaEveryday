package com.rescde;

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
		    System.out.println("请输入整数：");
		    try {
		        a = sc.next();
		        b = Integer.valueOf((String) a);
		        bool = false;
		    } catch (Exception e) {
		        System.out.println("抛出异常，异常信息为" + e.getMessage());
		    }
		}
		 
		System.out.println("b = " + b);
	}
	public abstract String doSomething();
	//静态块，只加载一次
	static
	{
		System.out.println("静态块：资源加载....");
	}
	
	//实例块，每次创建实例都会加载
	{
		System.out.println("实例块：每次实例化类加载....");
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

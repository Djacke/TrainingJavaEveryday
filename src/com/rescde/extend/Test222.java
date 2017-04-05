package com.rescde.extend;

public class Test222 extends Test111{

	public int k  = 1;
	
	public Test222(){
		super();
		System.out.println("i---------------" + i);
		System.out.println("init Test222");
		i = 2;
	}
	
	public void init(){
		
	}
	
	public static void main(String[] args){
		Test222 test2 = new Test222();
		System.out.println(test2);
		System.out.println("i======" + test2.i);
	}
	
}

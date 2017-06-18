package com.rescde.lambda;

public class LambdaDemo {

	public static void main(String[] args){
		new Thread(new Runnable(){
			@Override
			public void run() {
				System.out.println("Before java 8, to much code for to little to do");
			}
		}).start();
	}
}

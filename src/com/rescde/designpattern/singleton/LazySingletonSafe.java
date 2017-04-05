package com.rescde.designpattern.singleton;

/**
 * @discribe 线程安全单例（懒汉式）
 * @author Administrator
 *
 */
public class LazySingletonSafe {
	
	private static LazySingletonSafe instance;
	
	private LazySingletonSafe(){}
	
	public static synchronized LazySingletonSafe getInstance(){
		
		if(instance == null){
			instance = new LazySingletonSafe();
		}
		return instance;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

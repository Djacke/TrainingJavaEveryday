package com.rescde.designpattern.singleton;

/**
 * 懒汉式
 * @discribe  这种写法lazy loading很明显，但是致命的是在多线程不能正常工作
 * @author Administrator
 *
 */
public class LazySingleton {
	
	private static LazySingleton singleton;
	
	private LazySingleton(){}
	
	public static LazySingleton getSingleton(){
		if(singleton == null){
			singleton = new LazySingleton();
		}
		return singleton;
	}

	public static void main(String[] args) {

	}

}

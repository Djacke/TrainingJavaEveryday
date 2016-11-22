package com.rescde.designpattern.singleton;

/**
 * @discribe 因为Java机制规定，内部类SingletonHolder只有在getInstance()方法第一次调用的时候才会被加载（实现了lazy），而且其加载过程是线程安全的（实现线程安全）。内部类加载的时候实例化一次instance
 * @author Administrator
 *
 */
public class InsideStaticSingle {
	
	private static class SingletonHolder{
		private static final InsideStaticSingle INSTACE = new InsideStaticSingle();
	}

	private InsideStaticSingle(){}
	
	public static InsideStaticSingle getInstance(){
		return SingletonHolder.INSTACE;
	}
	
	public static void main(String[] args){
		InsideStaticSingle sigle = InsideStaticSingle.getInstance();
		System.out.println(sigle);
	}
}

package com.rescde.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class TestClassProxy {

	public static void main(String[] args) {
//		Integer a = 1;
//		InvocationHandler aHandler = new SaneseeHandler(a);
//		Object aProxyInstance = Proxy.newProxyInstance(null, new Class[]{Comparable.class}, aHandler);
//		
//		Integer b = 2;
//		InvocationHandler bHandler = new SaneseeHandler(b);
//		Object bProxyInstance = Proxy.newProxyInstance(null, new Class[]{Comparable.class}, bHandler);
//		
//		Comparable aComparable = (Comparable)aProxyInstance;
//        Comparable bComparable = (Comparable)bProxyInstance;
//        System.out.println(aComparable.compareTo(bComparable));
		TestMethodProxyImpl test = new  TestMethodProxyImpl();
		MethodProxyFactory proxy = new MethodProxyFactory(test);
		ITestMethodProxy testProxy = (ITestMethodProxy) proxy.createProxy(test.getClass(), proxy);
		testProxy.doSomething();
		testProxy.doAnythind("heloo",1);
	}
	
	static class SaneseeHandler implements InvocationHandler{
		private Object object ;
		
		SaneseeHandler (Object obj){
			object = obj;
		}
		
		public Object invoke(Object proxy,Method method,Object[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException
		{
			System.out.print(object);
			System.out.println("." + method.getName() + "(");
			if(args != null)
			{
				for(Object obj : args)
				{
					System.out.println(obj + ",");
				}
			}
			System.out.println(")");
			return method.invoke(proxy,args);
		}
		
	}

}

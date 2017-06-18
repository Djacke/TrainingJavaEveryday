package com.rescde.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class MethodProxyFactory<T> implements InvocationHandler {
	
	private T object;
	
	MethodProxyFactory(T object){
		this.object = object;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		if(null != args){
			for(Object obj : args){
				System.out.println("" + obj.toString());
			}
		}
		beforeMethodExcute();
		Object obj = method.invoke(object, args);
		afterMethodExcute();
		return obj;
	}
	
	@SuppressWarnings("unchecked")
	public T createProxy(){
		return (T)Proxy.newProxyInstance(object.getClass().getClassLoader(),object.getClass().getInterfaces(), this);
	}
	
	public Object createProxy(Class<T> cls,InvocationHandler handler){
		return Proxy.newProxyInstance(cls.getClassLoader(),cls.getInterfaces(), handler);
	}

	private void beforeMethodExcute(){
		System.out.println("before method excute ...");
	}
	
	private void afterMethodExcute(){
		System.out.println("after method excute ...");
	}
}

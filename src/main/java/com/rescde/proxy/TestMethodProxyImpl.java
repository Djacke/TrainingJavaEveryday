package com.rescde.proxy;

public class TestMethodProxyImpl implements ITestMethodProxy {

	@Override
	public void doSomething() {
		System.out.println("doing something ......");
	}

	@Override
	public void doAnythind(String str, int i) {
		System.out.println(String.format("str:%s,int:%s",str,i+""));
	}

}

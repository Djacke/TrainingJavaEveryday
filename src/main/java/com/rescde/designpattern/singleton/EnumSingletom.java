package com.rescde.designpattern.singleton;

public enum EnumSingletom {
	
	INSTANCE;
	
	private EnumSingletom(){}
	
	public String getString(){
		return "Hello world!";
	}

	public static void main(String[] args) {

	}

}

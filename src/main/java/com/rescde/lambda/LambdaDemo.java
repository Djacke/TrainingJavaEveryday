package com.rescde.lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

public class LambdaDemo {

	public static void main(String[] args){
		new Thread(new Runnable(){
			@Override
			public void run() {
				System.out.println("Before java 8, to much code for to little to do");
			}
		}).start();
		
	    new Thread(()->System.out.println("In java 8,lambda expression rocks!")).start();
	    
	    List<String> features = Arrays.asList("java","c++","go","javascript","python");
	    
	    features.forEach((n) -> {System.out.print(n + " ");});
	    features.sort((s1,s2)->s1.compareToIgnoreCase(s2));
	    System.out.println("\nafter sort:" + features);
	    
	    List<Integer> integers = Arrays.asList(22,23,34,25,53,24,36,55);
	    integers.sort((int1,int2)-> int1 > int2?1:-1);
	    System.out.println(integers);
	    
	    System.out.println("\n---》features which starts with J :");
	    features.stream().filter((name)->name.startsWith("j")).forEach((n)->{
	    	System.out.print(n + " ");
	    });
	    
	    System.out.println("\n---》filter with multi predicate ");
	    Predicate<String> startWith = (n)->n.startsWith("j");
	    Predicate<String> length = (n)-> n.length() > 4;
	    features.stream().filter(startWith.or(length)).forEach((n)->{
	    	System.out.print(n + " ");
	    });
	    
	    System.out.println("\n---》lambda use map to calculate");
	    List<Integer> list = Arrays.asList(100,200,300,400,250);
	    list.stream().map((n)->n + 0.12*n).forEach((n)->{
	    	System.out.print(n + " ");
	    });
	    
	    List<People> peoples = Arrays.asList(new People("123",21),new People("789",33),new People("456",23));
	    System.out.println("\nbefore sort of peoples:" + peoples);
//	    peoples.sort((p1,p2)->p1.getName().compareTo(p2.getName()));
//	    peoples.sort(Comparator.comparing((People p)->p.getName()));
	    peoples.sort(Comparator.comparing(People::getName));
	    System.out.println("after sort of peoples:" + peoples);
	}
	
	private static void filter(List<String> features, Predicate condition){
		for(String str:features){
			if(condition.test(str)){
				System.out.println(str);
			}
		}
	}
	
	// 更好的办法
	public static void filter2(List names, Predicate condition) {
	    names.stream().filter((name) -> (condition.test(name))).forEach((name) -> {
	        System.out.println(name + " ");
	    });
	}
	
	@AllArgsConstructor
	@Getter
	@ToString
	static class People{
		String name;
		int age;
	}
}	

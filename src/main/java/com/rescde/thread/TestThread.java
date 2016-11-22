package com.rescde.thread;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.junit.Test;

public class TestThread {

	public static void main(String[] args) {
		
		ExecutorService cachedThreadPool = Executors.newCachedThreadPool();
		synchronized(TestThread.class){
			for(int i=0;i<10;i++){
				final int index = i;
				cachedThreadPool.execute(new Runnable(){
					public void run(){
						System.out.println("index--------" + index);
					}
				});
//				try {
//					Thread.sleep(1);
//				} catch (InterruptedException e) {
//					e.printStackTrace();
//				}
			}
		}
	}
	
	@Test
	public void testThread(){
		List<String> list = new ArrayList<>();
		list.add("111");
		list.add("112");
		list.add("113");
		list.add("114");
		list.add("115");
		R r = new R(list);
		for(int i=0;i<10;i++){
			Thread thread = new Thread(r);
			thread.start();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	class R<E extends Collection> implements Runnable{
		
		private ConcurrentLinkedQueue queue ;
		private int x = 0;
		R(E e){
			queue = new ConcurrentLinkedQueue(e);
		}
		public void run(){
			Iterator it = queue.iterator();
			while(it.hasNext()){
				System.out.println(it.next());
			}
		}
	}
}

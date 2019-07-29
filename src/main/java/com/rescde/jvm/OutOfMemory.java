package com.rescde.jvm;


import com.sun.tools.javac.util.Assert;
import java.util.HashSet;
import java.util.Set;

/**
 * -Xms64m -Xmx64m -XX:+PrintHeapAtGC -XX:+HeapDumpOnOutOfMemoryError
 */
public class OutOfMemory {

  public static void main(String[] args) {
    long star = System.currentTimeMillis();
    Set<Integer> hashSet = new HashSet<>(10000000);
    for (int i = 0; i< 10000000; i++) {
      hashSet.add(i);
    }
    long end = System.currentTimeMillis();
    System.out.println("执行时间：" + (end - star));
  }
}

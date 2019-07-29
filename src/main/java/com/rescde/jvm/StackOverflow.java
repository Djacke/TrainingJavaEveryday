package com.rescde.jvm;

/**
 * -Xmx32M -Xms32M -Xss128K
 */
public class StackOverflow {

  private static int count = 0;

  public static void recursion() {
    count++;
    recursion();
  }

  public static void main(String[] args) {
    try {
      recursion();
    } catch (Throwable e) {
      System.out.println("count=" + count);
      e.printStackTrace();
    }
  }
}

package com.rescde.jvm;

import com.google.common.hash.BloomFilter;
import com.training.algorithm.BloomFilterDemo;
import org.junit.Assert;
import org.junit.Test;

public class BloomFilterTest {

  private static int count = 10000000;

  @Test
  public void bloomFilterTest() {

    long start = System.currentTimeMillis();

    //Set<Integer> hashSet = new HashSet<>(10000000);
    BloomFilter<Integer> bloomFilter = BloomFilterDemo.builder(count);
    Assert.assertTrue(bloomFilter.mightContain(1));
    Assert.assertTrue(bloomFilter.mightContain(2));
    Assert.assertTrue(bloomFilter.mightContain(3));
    Assert.assertFalse(bloomFilter.mightContain(10000000));

    long end = System.currentTimeMillis();
    System.out.println("execute time:" + (end - start));
  }
}

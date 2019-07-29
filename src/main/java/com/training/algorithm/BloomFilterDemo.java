package com.training.algorithm;


import com.google.common.hash.BloomFilter;
import com.google.common.hash.Funnels;
import java.util.stream.IntStream;

/**
 * -Xms64m -Xmx64m -XX:+PrintHeapAtGC -XX:PrintGCDetails
 */
public class BloomFilterDemo {

  public static BloomFilter builder(int count) {
    BloomFilter<Integer> bloomFilter = BloomFilter.create(
        Funnels.integerFunnel(),
        count,
        0.01);
    IntStream.range(0, count).forEach(it -> bloomFilter.put(it));
    return bloomFilter;
  }
}

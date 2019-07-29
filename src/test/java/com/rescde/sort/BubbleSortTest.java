package com.rescde.sort;

import static org.junit.Assert.*;


import com.rescde.sort.BubbleSort;
import org.junit.Test;

public class BubbleSortTest {

  @Test
  public void bubbleSort() {
    int[] arr = {23,32,21,22,56,43,45,25};
    BubbleSort.bubbleSort(arr);
  }
}
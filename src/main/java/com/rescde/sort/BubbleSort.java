package com.rescde.sort;

import java.util.Arrays;

/**
 * @title 冒泡选择排序
 * @discriber   1、比较相邻的元素。如果第一个比第二个大，就交换他们两个。
 				2、对每一对相邻元素作同样的工作，从开始第一对到结尾的最后一对。在这一点，最后的元素应该会是最大的数。
 				3、针对所有的元素重复以上的步骤，除了最后一个。
 				4、持续每次对越来越少的元素重复上面的步骤，直到没有任何一对数字需要比较。
 * @author Djack
 * @email chenjinqi2010@163.com
 */
public class BubbleSort {

	public static void main(String[] args) {
		int[] arr = {23,32,21,22,56,43,45,25};
		System.out.println("待排序列表：" + Arrays.toString(arr));
		bubbleSort(arr);

	}
	
	public static void bubbleSort(int[] arr){
		for(int i=0;i<arr.length-1;i++){
			for(int j=0;j<arr.length-1-i;j++){
				if(arr[j] > arr[j+1]){
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
			System.out.println("第"+(i+1)+"次交换的结果：" + Arrays.toString(arr));
		}
		System.out.println("排序后的结果：" + Arrays.toString(arr) );
	}

}

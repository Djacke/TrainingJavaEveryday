package com.rescde.sort;

import java.util.Arrays;

/**
 * @title 直接选择排序
 * @discribe 在要排序的一组数中，选出最小的一个数与第一个位置的数交换；然后在剩下的数当中再找最小的与第二个位置的数交换，如此循环到倒数第二个数和最后一个数比较为止。
 * @author Djack
 * @time 2016-10-15
 */
public class DirectSelectSort {

	public static void main(String[] args) {
		int[] arr = {23,32,21,22,56,43,45,25};
		selectSort(arr);
	}
	
	public static void selectSort(int[] args){
		System.out.println("the disorder list:" + Arrays.toString(args));
		for(int i = 0;i<args.length;i++){
			int min = args[i];
			int min_index = i;
			for(int j = i+1;j<args.length;j++){
				if(args[j] < min){
					min = args[j];
					min_index = j;
				}
			}
			args[min_index]=args[i];
			args[i] = min;
			System.out.println("the " +(i + 1)+" times select result:" + Arrays.toString(args));
		}
		System.out.println("the order list:" + Arrays.toString(args));
	}

}

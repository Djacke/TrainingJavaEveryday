package com.rescde.sort;

import java.util.Arrays;

/**
 * @title 希尔排序
 * @discribe 先取一个小于n的整数d1作为第一个增量，把文件的全部记录分成d1个组。所有距离为d1的倍数的记录放在同一个组中。先在各组内进行直接插入排序；然后，
 * 			  取第二个增量d2<d1重复上述的分组和排序，直至所取的增量dt=1(dt<dt-l<…<d2<d1)，即所有记录放在同一组中进行直接插入排序为止。该方法实质上是一种分组插入方法。
 * @author Djack
 * @time 2016-10-15
 *
 */
public class HillInsertSort {

	public static void main(String[] args) {
		int[] arr = {23,32,21,22,56,43,45,25};
		hillSort(arr);
	}

	public static void hillSort(int[] args){
		System.out.println("待排序的列表：" +  Arrays.toString(args));
		int len = args.length;
		while(true){
			len = len /2 ;
			for(int i = 0;i < len;i++){
				for(int j=i+len;j<args.length;j=j+len){
					int temp = args[j];
					int k;
					for(k=j-len;k>=0 && args[k] > temp;k=k-len){
						args[k+len] = args[k];
					}
					args[k+len] = temp;
				}
			}
			System.out.println("第" + (len) + "次交换的结果" + Arrays.toString(args));
			if(len == 1){
				break;
			}
		}
		System.out.println("排序后的结果：" + Arrays.toString(args));
	}
}

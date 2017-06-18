package com.rescde.sort;

import java.util.Arrays;

/**
 * @title 快速选择排序
 * @discribe 选择一个基准元素,通常选择第一个元素或者最后一个元素,通过一趟扫描，将待排序列分成两部分,一部分比基准元素小,一部分大于等于基准元素,此时基准元素在其排好序后的正确位置,然后再用同样的方法递归地排序划分的两部分。
 * @author Administrator
 *
 */
public class QuickChangeSort {

	public static void main(String[] args) {
		int[] a={49,38,65,97,76,13,27,49,78,34,12,64};
		quickSort(a, 0, a.length-1);
		System.out.println(Arrays.toString(a));
	}
	
	public static void quickSort(int[] args,int low,int high){
		if(args.length>0 && low < high){
			int mid = getMiddle(args,low,high);
			quickSort(args,0,mid-1);
			quickSort(args,mid+1,high);
		}
	}
	
	public static int getMiddle(int[] args,int low,int high){
		int temp = args[low];
		while(low < high){
			//如果比基准值大，高位指针继续向前移动
			while(low<high && temp <= args[high]){
				high--;
			}
			//将高位比基准值小的元素赋值给基准位
			args[low]=args[high];
			//如果比基准值小，地位指针继续向后移动
			while(low<high && args[low] <= temp){
				low++;
			}
			//将低为比基准值大的元素赋值给高位
			args[high] = args[low];
		}
		args[low] = temp;
		return low;
	}

}

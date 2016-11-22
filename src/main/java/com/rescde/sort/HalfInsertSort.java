package com.rescde.sort;

import java.util.Arrays;

/**
 * @title 二分法插入排序
 * @discribe 二分法插入排序的思想和直接插入一样，只是找合适的插入位置的方式不同，这里是按二分法找到合适的位置，可以减少比较的次数。
 * @author Djack
 * @time 2016-10-15
 */
public class HalfInsertSort {

	public static void main(String[] args) {
		int[] arr = {23,32,21,22,56,43,45,25};
		halfSort(arr);
	}
	
	public static void halfSort(int[] args){
		System.out.println("待排序列表："  + Arrays.toString(args));
		for(int i=0;i<args.length;i++){
			int temp = args[i];
			int left = 0;
			int right = i - 1;
			int mid = 0;
			while(left <= right){
				mid = (left + right)/2;
				if(temp > args[mid]){
					left = mid + 1;
				}else{
					right = mid - 1;
				}
			}
			/* 每次找到left的位置后，将left到i-1位置的元素同意向后移动一个位置*/
//			for(int j = i-1;j >= left;j--){
//				args[j + 1] = args[j];
//			}
			int k = i;
			while(k > left){
				args[k] = args[k-1];
				k--;
			}
			
			System.out.println("第" + (i + 1) + "次移动的结果:" + Arrays.toString(args));
			if(left != i){
				args[left] = temp;
			}
		}
	}

}

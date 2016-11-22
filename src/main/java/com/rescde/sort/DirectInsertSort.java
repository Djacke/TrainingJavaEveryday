package com.rescde.sort;

import java.util.Arrays;

/**
 * @title 直接插入排序
 * @discriber 每步将一个待排序的记录，按其顺序码大小插入到前面已经排序的字序列的合适位置（从后向前找到合适位置后），直到全部插入排序完为止。
 * @author Djack
 * @time 2016-10-15
 */
public class DirectInsertSort {

	public static void main(String[] args) {
		int[] arr = {23,32,21,22,56,43,45,25};
		directInsertSort(arr);
	}
	
	public static void directInsertSort(int[] args){
		System.out.println("待排序的列表：" + Arrays.toString(args));
		for(int i=1;i<args.length;i++){
			int temp = args[i];
			int j;
			
			/* 从i-1处比较，如果比temp大的元素向后移动一个位置，否侧将temp插入比它小的元素后边 */
			for(j = i-1;j>=0;j--){
				if(args[j] > temp){
					args[j+1] = args[j];
				}else{
					break;
				}
			}
			args[j+1] = temp;
			System.out.println("第" + i +"插入的结果" +  Arrays.toString(args));
		}
		
		System.out.println("排序后结果:" + Arrays.toString(args));
	}

}

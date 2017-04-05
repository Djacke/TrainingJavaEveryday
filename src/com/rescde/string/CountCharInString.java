package com.rescde.string;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CountCharInString {

	public static void main(String[] args) {
		String str = "chenjinqi and fengjinhua";
		countNumber1(str);
	}
	
	public static void countNumber(String str){
		int len = str.length();
		Map<Character, Integer> numChars = new HashMap<>(Math.min(len, 26));
		for(int i=0;i<len;i++){
			char c = str.charAt(i);
			if(!numChars.containsKey(c)){
				numChars.put(c, 1);
			}
			else
			{
				numChars.put(c, numChars.get(c) + 1);
			}
		}
		System.out.println(numChars);
	}
	
	public static void countNumber1(String str){
		int len = str.length();
		int[] count = new int[(int)Character.MAX_VALUE];
		for(int i=0;i<len;i++){
			char ch = str.charAt(i);
			count[(int)ch]++;
		}
		System.out.println(Arrays.toString(count));
	}

}

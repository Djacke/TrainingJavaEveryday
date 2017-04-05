package com.rescde.calculate;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BigIntMultiply {

	public static void main(String[] args) {
		
		String parten = "^[1-9]\\d*$";
		Pattern p = Pattern.compile(parten);
		
		 // 获得乘数A
        System.out.println("请输入乘数A（不以0开头的正整数）：");
		Scanner sc_a = new Scanner(System.in);
		String a = sc_a.nextLine();
		Matcher m_a = p.matcher(a);
		if(!m_a.matches()){
			System.out.println("numer is not legal");
			return;
		}
		
		 // 获得乘数B
        System.out.println("请输入乘数B（不以0开头的正整数）：");
        
        Scanner sc_b = new Scanner(System.in);
        String b = sc_b.nextLine();
        Matcher m_b = p.matcher(b);
        if(!m_b.matches()){
        	System.out.println("numer is not legal");
			return;
        }
        
        char a_char[] = a.toCharArray();
        char b_char[] = b.toCharArray();
        
        char[] result = multiBigInt(a_char,b_char);
        System.out.print(a + " * " + b + "=");
        
        int count = 0;
        for(char r : result){
        	if(count==0 && (r-48)==0){
        		continue;
        	}
        	System.out.print(r-48);
        	count ++;
        }

	}
	
	public static void reverseOrder(char[] c_arr){
		int len = c_arr.length;
		for(int i=0,j=len-1;i<len && i<j;i++,j--){
			char temp = c_arr[i];
			c_arr[i] = c_arr[j];
			c_arr[j] = temp;
		}
	}
	
	public static char[] multiBigInt(char[] a,char[] b){
		int len_a = a.length;
		int len_b = b.length;
		char[] result = new char[len_a+len_b+1];
		for(int i = 0;i<len_a+len_b +1;i++){
			result[i] = '0';
		}
		reverseOrder(a);
		reverseOrder(b);
		
		int multiFlag ;
		int addFlag;
		for(int i=0;i<=len_b-1;i++){
			multiFlag = 0;
			addFlag = 0;
			for(int j=0;j<=len_a-1;j++){
				int temp1 = (b[i]-48)*(a[j]-48) + multiFlag;
				multiFlag=temp1/10;
				temp1 = temp1%10;
				int temp2 = (result[i+j]-48) + temp1 + addFlag;
				addFlag = temp2/10;
				temp2=temp2%10;
				result[i+j] = (char)(temp2+48);
			}
			result[i+len_a] = (char)(multiFlag + addFlag + 48);
		}
		reverseOrder(result);
		return result;
	}

}

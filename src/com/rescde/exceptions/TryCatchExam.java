package com.rescde.exceptions;

public class TryCatchExam {

	public static void main(String[] args) {
		
		System.out.println(testFinally().toString());
	}
	
	public static StringBuffer testFinally(){
		
		StringBuffer result = new StringBuffer("Hello ");
		
		try{
			result.append(" world");
			System.exit(0);
			return result;
		}
		catch(Exception e){
			result.append(" exception");
			System.out.println("excute catch!!!");
		}
		finally{
			result.append( " again!");
			System.out.println("excute filnally!!!");
		}
		return result;
	}

}

package com.rescde.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;

public class Test {

	public static void main(String[] args) throws Exception {
//		InputStream in = new OwnInputStream(new BufferedInputStream(new FileInputStream("F:\\github-workspace\\practice-java-example\\src\\com\\rescde\\io\\test.txt")));
//		OwnOutputStream buffOut = new OwnOutputStream(new FileOutputStream("F:\\github-workspace\\practice-java-example\\src\\com\\rescde\\io\\test_out.txt"));
//		buffOut.writer(in);
		test();
	}
	
	public static void test() throws Exception{
		FileInputStream in = new FileInputStream("F:\\github-workspace\\practice-java-example\\src\\com\\rescde\\io\\test.txt");
		BufferedInputStream bin = new BufferedInputStream(in);
		
		FileOutputStream out = new FileOutputStream("F:\\github-workspace\\practice-java-example\\src\\com\\rescde\\io\\test_out.txt");
		BufferedOutputStream bou = new BufferedOutputStream(out);
		
		int len = 0;
		byte[] b = new byte[1024];
		while((len = bin.read(b, 0, 1024)) != -1){
			bou.write(b, 0, len);
		}
		bou.flush();
		bin.close();
	}

}

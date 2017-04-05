package com.rescde.io;

import java.io.BufferedInputStream;
import java.io.FilterOutputStream;
import java.io.InputStream;
import java.io.OutputStream;


public class OwnOutputStream extends FilterOutputStream {

	public OwnOutputStream(OutputStream out) {
		super(out);
	}
	
	public void writer(InputStream in) throws Exception{
		BufferedInputStream buffIn = new BufferedInputStream(in);
		byte[] bt = new byte[1024];
		while(buffIn.read(bt) != -1){
			super.write(bt);
		}
		super.flush();
		buffIn.close();
	}

}

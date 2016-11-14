package com.rescde.computer;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class LocalIpv4 {

	public static void main(String[] args) throws UnknownHostException{
		String ip = InetAddress.getLocalHost().getHostAddress();
		System.out.println("ip=====" + ip);
	}
}

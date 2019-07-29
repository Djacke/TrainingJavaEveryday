package com.rescde.string;

public class ZipperString {

	public static void main(String[] args) {
		System.out.println(zipString("qwertyyyyyyyyu"));

	}
	public static String zipString(String iniString) {
		// write code here
		if (iniString == null
				|| iniString.length() == 0
				|| iniString.isEmpty()) {
			return "";
		}
		StringBuilder zipStr = new StringBuilder();
		int count = 1;
		for (int i = 0, j = 1; i < iniString.length()
				&& j < iniString.length(); i++) {
			if (iniString.charAt(i) == iniString.charAt(j++)) {
				count++;
			} else {
				zipStr.append(iniString.charAt(i));
				zipStr.append(count);
				count = 1;
			}
			if (j == iniString.length()) {
				zipStr.append(iniString.charAt(j - 1));
				zipStr.append(count);
			}
		}
		return zipStr.toString().length() > iniString.length() ?
				iniString : zipStr.toString();
	}
}

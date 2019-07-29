package com.rescde.string;

public class TestString {

	public static void main(String[] args) {
		String str = "ssseeerrr";
		String ips = "10.100.74.12,10.120.20.155";
		String str2= "jjjjjjxxxxxxxooZLLLLLLLLQQQQQQQQQLLLLLLLLECXXXXXXXIIIIIIIIIhjjyyySSooooooooommmuuEEEEEEEEEnnnnnnnffffffAAAAAllllllllbbbbkkkkkkkkkkkkKKKKKKhhhhhhhhhooooooooooYCCCCCCOOOOOOOOOMMMMMMMMMMiiiiiivvvvvvvWWWWkkkkkkwwwwwwwMmmmmmmmmLLLwwwwwwwkkkjjjjjjttttQQQQQQQQQaaaaaaaFFFFFFFlllllllllggggggggggPPPPPPuuuuuuuuaYYYYYYwQQQFFFFFFFFFFaaaaapXXXXXXXxxxxxxQQQQQQQQQsssssGGGGfffffffddddddpppQQQQQQHHHTTTaaaaaaGGGGGGddyyyyyMhhllllllllllNNNNNNNNUUUWWWWWWLLLLLLLLLYYYYYYYYYYTTKKKKKKKKiiiiiiitttttttXXXXXXXXXLLLHZZZZZZZssssjjJJJEEEEEOOOOOttttttttttBBttttttTTTTTTTTTTrrrrttttRRRRRyyooooooaaaaaaaaarrrrrrrPPPPPPPjjPPPPddddddddddHHHHnnnnnnnnnnSSSSSSSSSSzzHHHHHHHHHddddddDDDzzzhhhhhfffffffffftttttteeeeeeeeEEEEEEEEEaaaaaaccccccccccFFFFFFFF";
		System.out.println(ips.contains("10.100.74.12"));

	}
	
	/**
	 *
	 * @param iniString
	 * @return
	 */
    public static boolean checkDifferent(String iniString) {
        int len = iniString.length();
        for(int i=0;i< len;i++){
            String s = iniString.substring(i,i+1);
            String ss = iniString.substring(0,i);
            String sss = iniString.substring(i+1,len);
            if(ss.contains(s) || sss.contains(s))
             {
                return false;
            }
         }
        return true;
      }
    
    /**
     * @param iniString
     * @return
     */
    public static String zipString(String iniString) {
        int len = iniString.length();
        String temp = "";
        String newStr = "";
        int slen = 1;
        boolean flag = true;
        for(int i=0;i<len;i++){
            String s = iniString.substring(i,i+1);
            if(s.equals(temp))
            {
                slen ++;
                if(i==len-1){
                	newStr += slen;
                }
                continue;
            }
            else
            {
            	flag = (flag == false ? false : (slen > 1 ? false : true));
            	temp = s;
            	if(i > 0){
            		
            		newStr += slen + temp;
            	}
            	else
            	{
            		newStr += "" + temp;
            	}
            	slen = 1;
            }
            
        }
        if(flag){
        	return iniString;
        }
        return newStr;
    }

}

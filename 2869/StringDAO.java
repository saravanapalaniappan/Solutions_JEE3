package com.string;

public class StringDAO {
	
	public void doReverse(String str) {
	    char[] arr=str.toCharArray();
 	    System.out.print("After reverse:");
 	    for(int i=str.length()-1; i>=0; i--) {
 		   System.out.print(arr[i]);
 	    }
	}
    
	public void doSearch(String str, String word) {
		if (str.contains(word)) {
			System.out.println("Search string " + word + " was found in the given string: " + str);
		} else
			System.out.println("Search string " + word + " was not found in the given string: " + str);
	}
	
	public void doSrchrepl(String str, String sstr, String repl ) {
		if (str.contains(sstr)) {
			System.out.println("Search string " + sstr + " was found in the given string: " + str);
			System.out.println("After replace:" + str.replaceAll(sstr, repl));
		} else
			System.out.println("Search string " + sstr + " was not found in the given string: " + str);
			
		
	}
	
}
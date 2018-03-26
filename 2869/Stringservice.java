package com.string;

public class Stringservice {

	public static void main(String[] args) {

		String str=Getstring.getinputStr();
		int opt=Getstring.getinputopt();
		StringDAO sdao=new StringDAO();
        
		if (opt==1) {
           sdao.doReverse(str);    
    	   }
    	   
		if (opt==2) {
			String sstr=Getstring.getsearchstr();
			sdao.doSearch(str, sstr);
			}
		if (opt==3) {
			String sstr=Getstring.getsearchstr();
			String repl=Getstring.getreplstr();
			sdao.doSrchrepl(str, sstr, repl);
		}
        }
       
	}


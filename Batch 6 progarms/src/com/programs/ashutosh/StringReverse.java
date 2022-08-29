package com.programs.ashutosh;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("enter the string");
        String str = sc.nextLine();
        sc.close();
	    char ch[]=str.toCharArray();  
	    String rev="";  
	    for(int i=ch.length-1;i>=0;i--){  
	        rev+=ch[i];  
	    }  
	    System.out.println(rev);  
			}  
	}

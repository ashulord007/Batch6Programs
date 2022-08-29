package com.programs.ashutosh;

import java.util.Scanner;

public class NumberOfWords {
	 
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        System.out.println("enter the string");
        String str = sc.nextLine();
        sc.close();
        int count = 1;
 
        for (int i = 0; i < str.length() - 1; i++)
        {
            if ((str.charAt(i) == ' ') && (str.charAt(i + 1) != ' '))
            {
                count++;
            }
        }
        System.out.println("Number of words in a string : " + count);
    }
}
